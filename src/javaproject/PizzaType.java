package javaproject;

import myException.SoldOut;
import javaproject.Topping;

public class PizzaType {

    private String type;
    private Mixer mixer;
    static double price;
    static double price2 = 0;

    public void setM(Mixer mixer) {
        this.mixer = mixer;
    }

    public Mixer getM() {
        return mixer;
    }

    public PizzaType(String type) {
        this.type = type;
        this.mixer = mixer;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getType() {
        return type;
    }

    public void setTopping() throws SoldOut { //here s variable is a dough size , sent from Mixer in menue
        switch (getType()) {
            case "Marinara":
                Topping.setMarinara(getM().getSize());
                break;
            case "Margharita":
                Topping.setMargharita(getM().getSize());
                break;
            case "Mamamia":
                Topping.setMamamia(getM().getSize());
                break;
            case "Cipolla":
                Topping.setCipolla(getM().getSize());
                break;
            case "Vegetables":
                Topping.setVegetables(getM().getSize());
                break;
            case "Chicken":
                Topping.setChicken(getM().getSize());
                break;

        }

    }

}
