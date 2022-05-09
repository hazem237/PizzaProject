package javaproject;

import myException.SoldOut;

public class Mixer {

    private String dough_size;
    private String deep;
    Ingredients dough = new Ingredients("dough", 4000);

    public String getDough_size() {
        return dough_size;
    }

    public Ingredients getDough() {
        return dough;
    }

    public void setDough_size(String dough_size) {
        this.dough_size = dough_size;
    }

    public void setDeep(String deep) {
        this.deep = deep;
    }

    public void setDough(Ingredients dough) {
        this.dough = dough;
    }

    public Mixer(String size, String deep) {
        this.dough_size = size;
        this.deep = deep;
        dough = new Ingredients("dough", 4000);
    }

    public String getSize() {
        return dough_size;
    }

    public String getDeep() {
        return deep;
    }

    public void makeDough() throws SoldOut {
        if (getSize().equals("small") && getDeep().equals("pan")) {
            getDough().setWeight(150);
            getDough().setAmount_of_calories(434);
            cheakDoghStorage(dough);

        } else if (getSize().equals("small") && getDeep().equals("dish")) {
            getDough().setWeight(230);
            getDough().setAmount_of_calories(665);
            cheakDoghStorage(dough);
        } else if (getSize().equals("medium") && getDeep().equals("pan")) {
            getDough().setWeight(310);
            getDough().setAmount_of_calories(896);
            cheakDoghStorage(dough);
        } else if (getSize().equals("medium") && getDeep().equals("dish")) {
            getDough().setWeight(390);
            getDough().setAmount_of_calories(1127);
            cheakDoghStorage(dough);
        } else if (getSize().equals("large") && getDeep().equals("pan")) {
            getDough().setWeight(500);
            getDough().setAmount_of_calories(1444);
            cheakDoghStorage(dough);
        } else if (getSize().equals("large") && getDeep().equals("dish")) {
            getDough().setWeight(1000);
            getDough().setAmount_of_calories(1676);
            cheakDoghStorage(dough);
        }

    }

    public static void cheakDoghStorage(Ingredients i) throws SoldOut {

        MyException.sold(i);
        i.setStorage(i.getStorage() - i.getWeight());

    }

    public String getInfo() {
        return "Your pizza size is :" + getSize() + " and its deep is " + getDeep();
    }

    public void showMeDoughStorage() {
        System.out.println(getDough().getStorage());
    }
}
