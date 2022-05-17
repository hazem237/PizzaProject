package javaproject;

import myException.SoldOut;
import myException.FedUp;

public class MyException {

    private static PizzaLogger l = new PizzaLogger();

    public static void sold(Ingredients i) throws SoldOut {

        if (i.getStorage() < i.getWeight()) {
            throw new SoldOut(i.getName() + " is SoldOut!!");

        }

    }

    public static void SizeDifference(String p, String s) throws FedUp {
        if (!p.equals(s)) {
            throw new FedUp("The size of the dough and the size of the Pan is deffrent!!");
        }
    }

}
