package controller;

import factory.DroidCreator;
import model.unit.Army;
import model.unit.DroidInterface;
import prototype.DroidPrototype;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.IntStream;

public class App {
    private DroidInterface droid;
    private Army army;
    private Scanner sc;

    public App() {
        this.army = new Army();
        this.sc = new Scanner(System.in);
    }

    private int inputNumber(String str) {
        int valueInput;
        System.out.println(str);
        while (!sc.hasNextInt()) {
            System.out.println(("not number"));
            sc.next();
        }
        valueInput = sc.nextInt();
        return valueInput;
    }


    private DroidInterface createDroid(int factoryName, int droidName) {
        try {
            return new DroidCreator().createFactory(factoryName).createDroid(droidName);
        } catch (RuntimeException e) {
            System.out.println("Unknown type of droid");
        }
        return null;
    }

    private void fillArmyByPrototype(int droidCount, DroidInterface prototype) {
        List<DroidInterface> droids = new ArrayList<>();
        DroidPrototype<DroidInterface> origin = new DroidPrototype<>(prototype);
        IntStream.range(0, droidCount).forEach(i -> droids.add(origin.copyFromPrototype()));
        army.setArmy(droids);
    }

    private void showArmy() {
        army.getArmy().forEach(System.out::println);
    }

    private DroidInterface chooseFactory() {
        int droidType;
        int factoryType = inputNumber("input type of factory:\n1-simpleFactory\n2-superFactory");
        switch (factoryType) {
            case (1):
                droidType = inputNumber("input droid type:\n1-droid\n2-repairDroid)");
                return droid = createDroid(factoryType, droidType);

            case (2):
                droidType = inputNumber("input droid type:\n1-droid with sword\n2-droid with shield\3-lucky droid");
                return droid = createDroid(factoryType, droidType);
            default:
                return null;
        }
    }

    public void run() {
        int choose;
        while (true) {
            try {
                choose = inputNumber("input number:\n1 - create your droid\n2-print your droid\n3-fill army with by your droid prototype\n4-print army\n0-exit");
                switch (choose) {
                    case (1):
                        chooseFactory();
                        break;
                    case (2):
                        System.out.println(droid);
                        break;
                    case (3):
                        int count = inputNumber("input count of army");
                        fillArmyByPrototype(count, droid);
                        break;
                    case (4):
                        showArmy();
                        break;
                    case (0):
                        System.exit(0);
                    default:
                        throw new RuntimeException();
                }
            } catch (RuntimeException e) {
                System.out.println("Wrong input argument");
            }
        }
    }
}
