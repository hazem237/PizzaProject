package javaproject;

import com.sun.media.jfxmedia.logging.Logger;
import java.io.IOException;
import java.util.Scanner;
import myException.*;
import java.io.*;
import java.util.logging.Level;

public class Console {

    private static Pan pan = new Pan(new Mixer("size", "deep"), new PizzaType("type"), 0);
    private static Scanner input = new Scanner(System.in);
    private static PizzaLogger l = new PizzaLogger();
    private static int choice;
    private static WriteInFile write = new WriteInFile();

    static DataBase db = new DataBase();

    public static void displayStartMenu() {
        System.out.println(Messages.START_MENU);
    }

    public static void displayPizzaTypeMenu() {
        System.out.println(Messages.PIZZA_TYPE_MENU);
    }

    public static void displaySizeMenu() {
        System.out.println(Messages.SIZE_MENU);
    }

    public static void displaySliceMenu() {
        System.out.println(Messages.SLICE_MENU);
    }

    public static void displayConfirmMenu() {
        System.out.println(Messages.CONFIRM_ORDER);
    }

    public static void displayDrinksMenu() {
        System.out.println(Messages.DRINKS_MENU);
    }

    public static void displayPizzaInfo() throws Exception {
        System.out.println(Messages.SHOW_INFO);
        System.out.println(Messages.PIZZA_NAME + pan.getPizzaType().getType());
        System.out.println(Messages.PIZZA_SIZE_AND_DEEP + pan.getDough().getSize() + "," + pan.getDough().getDeep());
        System.out.println(Messages.CALORIES_INFO + pan.getCalories());
        System.out.println(Messages.SLICE_CALORIES_INFO + pan.getSliceCalories());
        System.out.println(Messages.INGREDIENTS_INFO + Topping.getIngredientsInfo());
        System.out.println(Messages.ACCOUNT + PizzaType.price + " dollars");

        displayConfirmMenu();
        chooseFromConfirmMenu();
    }

    public static void clearOrder() {
        Topping.topping.clear();
        Pan.sum = 0;
        Pan.sum2 = 0;
    }

    public static void clrscr() {

        try {

            if (System.getProperty("os.name").contains("Windows")) {
                new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
            } else {
                Runtime.getRuntime().exec("clear");
            }

        } catch (IOException | InterruptedException ex) {
        }

    }

    public static void sentDataToMySql(String type, String size, String deep, double c) throws Exception {
        db.post(type, size, deep, c);
    }

    public static void chooseFromStartMenu() throws SoldOut, Exception {
        while (choice != 2) {
            clrscr();
            displayStartMenu();
            choice = input.nextInt();
            switch (choice) {
                case 1:
                    l.log("New Order");
                    clrscr();
                    displayPizzaTypeMenu();
                    chooseFromPizzaTypeMenu();
                    break;
                case 2:
                    clrscr();
                    break;
                default:
                    clrscr();
                    System.out.println(Messages.WRONG_MENUE_CHOICE);
                    displayStartMenu();
                    chooseFromStartMenu();

            }
        }
    }

    public static void chooseFromPizzaTypeMenu() throws SoldOut, Exception {

        choice = input.nextInt();
        switch (choice) {
            case 1:
                pan.setPizzaType(new PizzaType("Marinara"));
                l.log(Messages.LOG_SELECT_PIZZA + pan.getPizzaType().getType());
                clrscr();
                System.out.println(Messages.PIZZA_CHOOSED);
                displaySizeMenu();
                chooseFromSizeMenu();
                break;
            case 2:

                pan.setPizzaType(new PizzaType("Margharita"));
                l.log(Messages.LOG_SELECT_PIZZA + pan.getPizzaType().getType());
                clrscr();
                System.out.println(Messages.PIZZA_CHOOSED);
                displaySizeMenu();
                chooseFromSizeMenu();
                break;
            case 3:
                pan.setPizzaType(new PizzaType("Cipolla"));
                l.log(Messages.LOG_SELECT_PIZZA + pan.getPizzaType().getType());
                clrscr();
                System.out.println(Messages.PIZZA_CHOOSED);
                displaySizeMenu();
                chooseFromSizeMenu();
                break;
            case 4:
                pan.setPizzaType(new PizzaType("Mamamia"));
                l.log(Messages.LOG_SELECT_PIZZA + pan.getPizzaType().getType());
                clrscr();
                System.out.println(Messages.PIZZA_CHOOSED);
                displaySizeMenu();
                chooseFromSizeMenu();
                break;
            case 5:
                pan.setPizzaType(new PizzaType("Vegetables"));
                l.log(Messages.LOG_SELECT_PIZZA + pan.getPizzaType().getType());
                clrscr();
                System.out.println(Messages.PIZZA_CHOOSED);
                displaySizeMenu();
                chooseFromSizeMenu();
                break;
            case 6:
                pan.setPizzaType(new PizzaType("Chicken"));
                l.log(Messages.LOG_SELECT_PIZZA + pan.getPizzaType().getType());
                clrscr();
                System.out.println(Messages.PIZZA_CHOOSED);
                displaySizeMenu();
                chooseFromSizeMenu();
                break;
            default:
                l.log(Messages.LOG_UNVALID_INPUT);
                clrscr();
                System.out.println(Messages.WRONG_MENUE_CHOICE);
                displayPizzaTypeMenu();
                chooseFromPizzaTypeMenu();
        }
    }

    public static void chooseFromSizeMenu() throws SoldOut, Exception {
        choice = input.nextInt();
        switch (choice) {
            case 1:
                pan.getDough().setDough_size("small");
                pan.getDough().setDeep("pan");
                l.log(Messages.LOG_SIZE_DEEP + pan.getDough().getSize() + "," + pan.getDough().getDeep());
                pan.getPizzaType().setM(pan.getDough());
                clrscr();
                System.out.println(Messages.SIZE_CHOOSED);
                displaySliceMenu();
                chooseFromSliceMenu();

                break;
            case 2:
                pan.getDough().setDough_size("small");
                pan.getDough().setDeep("dish");
                l.log(Messages.LOG_SIZE_DEEP + pan.getDough().getSize() + "," + pan.getDough().getDeep());
                pan.getPizzaType().setM(pan.getDough());
                clrscr();
                System.out.println(Messages.SIZE_CHOOSED);
                displaySliceMenu();
                chooseFromSliceMenu();

                break;
            case 3:
                pan.getDough().setDough_size("medium");
                pan.getDough().setDeep("pan");
                l.log(Messages.LOG_SIZE_DEEP + pan.getDough().getSize() + "," + pan.getDough().getDeep());
                pan.getPizzaType().setM(pan.getDough());
                clrscr();
                System.out.println(Messages.SIZE_CHOOSED);
                displaySliceMenu();
                chooseFromSliceMenu();

                break;
            case 4:
                pan.getDough().setDough_size("medium");
                pan.getDough().setDeep("dish");
                l.log(Messages.LOG_SIZE_DEEP + pan.getDough().getSize() + "," + pan.getDough().getDeep());
                pan.getPizzaType().setM(pan.getDough());
                clrscr();
                System.out.println(Messages.SIZE_CHOOSED);
                displaySliceMenu();
                chooseFromSliceMenu();

                break;
            case 5:
                pan.getDough().setDough_size("large");
                pan.getDough().setDeep("pan");
                l.log(Messages.LOG_SIZE_DEEP + pan.getDough().getSize() + "," + pan.getDough().getDeep());
                pan.getPizzaType().setM(pan.getDough());
                clrscr();
                System.out.println(Messages.SIZE_CHOOSED);
                displaySliceMenu();
                chooseFromSliceMenu();

                break;
            case 6:
                pan.getDough().setDough_size("large");
                pan.getDough().setDeep("dish");
                l.log(Messages.LOG_SIZE_DEEP + pan.getDough().getSize() + "," + pan.getDough().getDeep());
                pan.getPizzaType().setM(pan.getDough());
                clrscr();
                System.out.println(Messages.SIZE_CHOOSED);
                displaySliceMenu();
                chooseFromSliceMenu();

                break;
            default:
                System.out.println(Messages.WRONG_MENUE_CHOICE);
                displaySizeMenu();
                chooseFromSizeMenu();
        }

    }

    public static void chooseFromSliceMenu() throws SoldOut, Exception {
        choice = input.nextInt();
        switch (choice) {
            case 1:
                pan.setSlice(4);
                l.log(Messages.LOG_SLICE_INPUT + ":" + pan.getSlice());
                clrscr();
                System.out.println(Messages.SLICES_CHOOSED);
                pan.MakePizza();

                displayDrinksMenu();
                chooseFromDrinksMenu();
                break;
            case 2:
                pan.setSlice(6);
                l.log(Messages.LOG_SLICE_INPUT + ":" + pan.getSlice());
                clrscr();
                System.out.println(Messages.SLICES_CHOOSED);
                pan.MakePizza();

                displayDrinksMenu();
                chooseFromDrinksMenu();
                break;
            case 3:
                pan.setSlice(8);
                l.log(Messages.LOG_SLICE_INPUT + ":" + pan.getSlice());
                clrscr();
                System.out.println(Messages.SLICES_CHOOSED);
                pan.MakePizza();

                displayDrinksMenu();
                chooseFromDrinksMenu();
                break;
            case 4:
                pan.setSlice(10);
                l.log(Messages.LOG_SLICE_INPUT + ":" + pan.getSlice());
                clrscr();
                System.out.println(Messages.SLICES_CHOOSED);
                pan.MakePizza();

                displayDrinksMenu();
                chooseFromDrinksMenu();
                break;
            default:
                System.out.println(Messages.WRONG_MENUE_CHOICE);
                clrscr();
                System.out.println(Messages.WRONG_MENUE_CHOICE);
                displaySliceMenu();
                chooseFromSliceMenu();

        }

    }

    public static void chooseFromDrinksMenu() throws SoldOut, Exception {
        choice = input.nextInt();
        switch (choice) {
            case 1:
                l.log(Messages.LOG_DRINK);
                PizzaType.price = PizzaType.price + 2;
                clrscr();
                System.out.println(Messages.DRINK_CHOOSED);
                displayPizzaInfo();
                break;
            case 2:
                l.log(Messages.LOG_DRINK);
                PizzaType.price = PizzaType.price + 2;
                clrscr();
                System.out.println(Messages.DRINK_CHOOSED);
                displayPizzaInfo();
                break;
            case 3:
                l.log(Messages.LOG_DRINK);
                PizzaType.price = PizzaType.price + 2;
                clrscr();
                System.out.println(Messages.DRINK_CHOOSED);
                displayPizzaInfo();
                break;
            case 4:
                l.log(Messages.LOG_DRINK);
                PizzaType.price = PizzaType.price + 2;
                clrscr();
                System.out.println(Messages.DRINK_CHOOSED);
                displayPizzaInfo();
                break;
            case 5:
                l.log(Messages.LOG_DRINK);
                PizzaType.price = PizzaType.price + 4;
                clrscr();
                System.out.println(Messages.DRINK_CHOOSED);
                displayPizzaInfo();
                break;
            case 6:

                clrscr();
                System.out.println(Messages.NO_DRINKS);
                displayPizzaInfo();
                break;

            default:
                clrscr();
                System.out.println(Messages.WRONG_MENUE_CHOICE);
                displayDrinksMenu();
                chooseFromDrinksMenu();

        }

    }

    public static void chooseFromConfirmMenu() throws SoldOut, Exception {
        choice = input.nextInt();
        switch (choice) {
            case 1:
                clrscr();
                System.out.println(Messages.PIZZA_READY);
                clearOrder();
                //Here Because of disconnect with My DataBase We Hide it , But its work when XAMPP installed
                sentDataToMySql(pan.getPizzaType().getType(), pan.getDough().getSize(), pan.getDough().getDeep(), pan.getCalories());
                write.PutDataInFile(pan.getPizzaType().getType(), pan.getDough().getSize(), pan.getDough().getDeep(), pan.getCalories());

                break;
            case 2:
                clrscr();
                System.out.println(Messages.PIZZA_CANCELED);
                clearOrder();
                break;
            default:
                clrscr();
                System.out.println(Messages.WRONG_MENUE_CHOICE);
                displayPizzaTypeMenu();
                chooseFromConfirmMenu();
        }

    }

}
