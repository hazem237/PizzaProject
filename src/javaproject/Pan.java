package javaproject;

import myException.FedUp;
import myException.SoldOut;

public class Pan {

    private Mixer dough;
    private PizzaType pizzaType;
    private String pan_size;
    private int slice;

    static double sum = 0;
    static double sum2 = 0;

    public Pan() {
    }

    public Pan(Mixer dough, PizzaType pizzaType, int Slice) {
        this.dough = dough;
        this.pizzaType = pizzaType;
        this.slice = Slice;
    }

    public void setDough(Mixer dough) {
        this.dough = dough;
    }

    public String getSize() {
        return pan_size;
    }

    public void setSize(String size) {
        this.pan_size = size;
    }

    public int getSlice() {
        return slice;
    }

    public void setSlice(int slice) {
        this.slice = slice;
    }

    public void setPizzaType(PizzaType pizzaType) {
        this.pizzaType = pizzaType;
    }

    public Mixer getDough() {
        return dough;
    }

    public PizzaType getPizzaType() {
        return pizzaType;
    }

    public void MakePizza() throws SoldOut {
        this.getDough().makeDough();
        this.getPizzaType().setTopping();
    }

    public double getCalories() {

        for (int i = 0; i < Topping.topping.size(); i++) {
            sum = sum + Topping.topping.get(i).getAmount_of_calories();
        }
        sum2 = sum + getDough().getDough().getAmount_of_calories();
        return sum2;
    }

    public double getSliceCalories() {
        return sum2 / getSlice();
    }

    public static void setDoughOnPan(String p, String s) throws FedUp {

        MyException.SizeDifference(p, s);

    }
}
