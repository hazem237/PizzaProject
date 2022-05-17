package javaproject;

import myException.SoldOut;

import java.util.ArrayList;

public class Topping {

    public Topping() {
    }
    ;
    //fill the storage for every ingredient with the suitable weight in grams
    static Ingredients marinara_sauce = new Ingredients("marinara sauce", 1000000);
    static Ingredients garlic = new Ingredients("garlic", 1000);
    static Ingredients olive_oil = new Ingredients("olive oil", 4000);
    static Ingredients basil = new Ingredients("basil", 1000);
    static Ingredients oregano = new Ingredients("oregano", 1000);
    static Ingredients tomato_sauce = new Ingredients("tomato sauce", 4000);
    static Ingredients mozzarella = new Ingredients("mozzarella", 4000);
    static Ingredients salmon = new Ingredients("salmon", 1000);
    static Ingredients ricotta = new Ingredients("ricotta", 1000);
    static Ingredients onion = new Ingredients("onion", 1000);
    static Ingredients mashroom = new Ingredients("mashroom", 1000);
    static Ingredients tuna = new Ingredients("tuna", 1000);
    static Ingredients peppers = new Ingredients("peppers", 1000);
    static Ingredients corn = new Ingredients("corn", 1000);
    static Ingredients olive = new Ingredients("olive", 1000);
    static Ingredients Parmesan = new Ingredients("Parmesan cheese", 1000);
    static Ingredients chicken = new Ingredients("chicken", 1000);

    //the ArrayList will contain all ingredients used in the topping of every type of pizza
    static ArrayList<Ingredients> topping = new ArrayList<>();

    public static void setMarinara(String doughSize) throws SoldOut {
        //the method will set toppings for the marinara pizza with the suitable quantity for the size
        switch (doughSize) {
            case "small":
                marinara_sauce.setWeight(100);
                marinara_sauce.setAmount_of_calories(50);
                chakeStorge(marinara_sauce);
                garlic.setWeight(6);
                garlic.setAmount_of_calories(9);
                chakeStorge(garlic);
                olive_oil.setWeight(10);
                olive_oil.setAmount_of_calories(85);
                chakeStorge(olive_oil);
                basil.setWeight(2);
                basil.setAmount_of_calories(0.4);
                chakeStorge(basil);
                oregano.setWeight(1);
                oregano.setAmount_of_calories(2.7);
                chakeStorge(oregano);
                PizzaType.price = 6;
                break;
            case "medium":
                marinara_sauce.setWeight(125);
                marinara_sauce.setAmount_of_calories(89);
                chakeStorge(marinara_sauce);
                garlic.setWeight(9);
                garlic.setAmount_of_calories(13.5);
                chakeStorge(garlic);
                olive_oil.setWeight(20);
                olive_oil.setAmount_of_calories(170);
                chakeStorge(olive_oil);
                basil.setWeight(6);
                basil.setAmount_of_calories(1.1);
                chakeStorge(basil);
                oregano.setWeight(1.5);
                oregano.setAmount_of_calories(4.05);
                chakeStorge(oregano);
                PizzaType.price = 9;
                break;
            case "large":
                marinara_sauce.setWeight(150);
                marinara_sauce.setAmount_of_calories(110);
                chakeStorge(marinara_sauce);
                garlic.setWeight(12);
                garlic.setAmount_of_calories(18);
                chakeStorge(garlic);
                olive_oil.setWeight(25);
                olive_oil.setAmount_of_calories(212.5);
                chakeStorge(olive_oil);
                basil.setWeight(4);
                basil.setAmount_of_calories(1);
                chakeStorge(basil);
                oregano.setWeight(2);
                oregano.setAmount_of_calories(5.4);
                chakeStorge(oregano);
                PizzaType.price = 12;
                break;
            default:
                break;
        }
    }

    public static void setMargharita(String doughSize) throws SoldOut {
        //the method will set toppings for the margharita pizza with the suitable quantity for the size       
        switch (doughSize) {
            case "small":
                tomato_sauce.setWeight(45);
                tomato_sauce.setAmount_of_calories(10.575);
                chakeStorge(tomato_sauce);
                mozzarella.setWeight(150);
                mozzarella.setAmount_of_calories(454.5);
                chakeStorge(mozzarella);
                olive_oil.setWeight(10);
                olive_oil.setAmount_of_calories(85);
                chakeStorge(olive_oil);
                basil.setWeight(2);
                basil.setAmount_of_calories(0.5);
                chakeStorge(basil);
                PizzaType.price = 7;
                break;
            case "medium":
                tomato_sauce.setWeight(55);
                tomato_sauce.setAmount_of_calories(12.925);
                chakeStorge(tomato_sauce);
                mozzarella.setWeight(175);
                mozzarella.setAmount_of_calories(530.25);
                chakeStorge(mozzarella);
                olive_oil.setWeight(20);
                olive_oil.setAmount_of_calories(170);
                chakeStorge(olive_oil);
                basil.setWeight(3);
                basil.setAmount_of_calories(0.75);
                chakeStorge(basil);
                PizzaType.price = 11;
                break;
            case "large":
                tomato_sauce.setWeight(65);
                tomato_sauce.setAmount_of_calories(10.5);
                chakeStorge(tomato_sauce);
                mozzarella.setWeight(200);
                mozzarella.setAmount_of_calories(606);
                chakeStorge(mozzarella);
                olive_oil.setWeight(25);
                olive_oil.setAmount_of_calories(212.5);
                chakeStorge(olive_oil);
                basil.setWeight(4);
                basil.setAmount_of_calories(1);
                chakeStorge(basil);
                PizzaType.price = 16;
                break;
            default:
                break;
        }
    }

    public static void setCipolla(String doughSize) throws SoldOut {
        //the method will set toppings for the cipolla pizza with the suitable quantity for the size        
        switch (doughSize) {
            case "small":
                tomato_sauce.setWeight(45);
                tomato_sauce.setAmount_of_calories(10.575);
                chakeStorge(tomato_sauce);
                mozzarella.setWeight(150);
                mozzarella.setAmount_of_calories(454.5);
                chakeStorge(mozzarella);
                onion.setWeight(23.5);
                onion.setAmount_of_calories(10.3);
                chakeStorge(onion);
                oregano.setWeight(1);
                oregano.setAmount_of_calories(2.7);
                chakeStorge(oregano);
                PizzaType.price = 4;
                break;
            case "medium":
                tomato_sauce.setWeight(55);
                tomato_sauce.setAmount_of_calories(12.925);
                chakeStorge(tomato_sauce);
                mozzarella.setWeight(175);
                mozzarella.setAmount_of_calories(530.25);
                chakeStorge(mozzarella);
                onion.setWeight(47);
                onion.setAmount_of_calories(20.5);
                chakeStorge(onion);
                oregano.setWeight(1.5);
                oregano.setAmount_of_calories(4.05);
                chakeStorge(oregano);
                PizzaType.price = 6;
                break;
            case "large":
                tomato_sauce.setWeight(65);
                tomato_sauce.setAmount_of_calories(15.275);
                chakeStorge(tomato_sauce);
                mozzarella.setWeight(200);
                mozzarella.setAmount_of_calories(606);
                chakeStorge(mozzarella);
                onion.setWeight(70.5);
                onion.setAmount_of_calories(30.8);
                chakeStorge(onion);
                oregano.setWeight(2);
                oregano.setAmount_of_calories(5.4);
                chakeStorge(oregano);
                PizzaType.price = 8;
                break;
            default:
                break;
        }
    }

    public static void setMamamia(String doughSize) throws SoldOut {
        //the method will set toppings for the Mamamia pizza with the suitable quantity for the size        
        switch (doughSize) {
            case "small":
                tomato_sauce.setWeight(45);
                tomato_sauce.setAmount_of_calories(10.575);
                chakeStorge(tomato_sauce);
                mozzarella.setWeight(150);
                mozzarella.setAmount_of_calories(454.5);
                chakeStorge(mozzarella);
                onion.setWeight(23.5);
                onion.setAmount_of_calories(10.3);
                chakeStorge(onion);
                corn.setWeight(51.5);
                corn.setAmount_of_calories(49.5);
                chakeStorge(corn);
                peppers.setWeight(57);
                peppers.setAmount_of_calories(16);
                chakeStorge(peppers);
                tuna.setWeight(85);
                tuna.setAmount_of_calories(111);
                chakeStorge(tuna);
                PizzaType.price = 5;
                break;
            case "medium":
                tomato_sauce.setWeight(55);
                tomato_sauce.setAmount_of_calories(12.925);
                chakeStorge(tomato_sauce);
                mozzarella.setWeight(175);
                mozzarella.setAmount_of_calories(530.25);
                chakeStorge(mozzarella);
                onion.setWeight(47);
                onion.setAmount_of_calories(20.5);
                chakeStorge(onion);
                corn.setWeight(82.4);
                corn.setAmount_of_calories(79.2);
                chakeStorge(corn);
                peppers.setWeight(91.2);
                peppers.setAmount_of_calories(25.6);
                chakeStorge(peppers);
                tuna.setWeight(141.7);
                tuna.setAmount_of_calories(185);
                chakeStorge(tuna);
                PizzaType.price = 7;
                break;
            case "large":
                tomato_sauce.setWeight(65);
                tomato_sauce.setAmount_of_calories(15.275);
                chakeStorge(tomato_sauce);
                mozzarella.setWeight(200);
                mozzarella.setAmount_of_calories(606);
                chakeStorge(mozzarella);
                onion.setWeight(70.5);
                onion.setAmount_of_calories(30.8);
                chakeStorge(onion);
                corn.setWeight(103);
                corn.setAmount_of_calories(99);
                chakeStorge(corn);
                peppers.setWeight(114);
                peppers.setAmount_of_calories(32);
                chakeStorge(peppers);
                tuna.setWeight(198.3);
                tuna.setAmount_of_calories(259);
                chakeStorge(tuna);
                PizzaType.price = 9;
                break;
            default:
                break;
        }
    }

    public static void setVegetables(String doughSize) throws SoldOut {
        //the method will set toppings for the vegetables pizza with the suitable quantity for the size      
        switch (doughSize) {
            case "small":
                tomato_sauce.setWeight(10);
                tomato_sauce.setAmount_of_calories(10.575);
                chakeStorge(tomato_sauce);
                mozzarella.setWeight(150);
                mozzarella.setAmount_of_calories(454.5);
                chakeStorge(mozzarella);
                mashroom.setWeight(12);
                mashroom.setAmount_of_calories(3.4);
                chakeStorge(mashroom);
                corn.setWeight(82.4);
                corn.setAmount_of_calories(79.2);
                chakeStorge(corn);
                peppers.setWeight(91.2);
                peppers.setAmount_of_calories(25.6);
                chakeStorge(peppers);
                olive.setWeight(27);
                olive.setAmount_of_calories(39);
                chakeStorge(olive);
                PizzaType.price = 5;
                break;
            case "medium":
                tomato_sauce.setWeight(55);
                tomato_sauce.setAmount_of_calories(12.925);
                chakeStorge(tomato_sauce);
                mozzarella.setWeight(175);
                mozzarella.setAmount_of_calories(530.25);
                chakeStorge(mozzarella);
                mashroom.setWeight(24);
                mashroom.setAmount_of_calories(6.8);
                chakeStorge(mashroom);
                corn.setWeight(51.5);
                corn.setAmount_of_calories(49.5);
                chakeStorge(corn);
                peppers.setWeight(57);
                peppers.setAmount_of_calories(16);
                chakeStorge(peppers);
                olive.setWeight(40.5);
                olive.setAmount_of_calories(58.5);
                chakeStorge(olive);
                PizzaType.price = 8;
                break;
            case "large":
                tomato_sauce.setWeight(65);
                tomato_sauce.setAmount_of_calories(15.275);
                chakeStorge(tomato_sauce);
                mozzarella.setWeight(200);
                mozzarella.setAmount_of_calories(606);
                chakeStorge(mozzarella);
                mashroom.setWeight(36);
                mashroom.setAmount_of_calories(10.2);
                chakeStorge(mashroom);
                corn.setWeight(103);
                corn.setAmount_of_calories(99);
                chakeStorge(corn);
                peppers.setWeight(114);
                peppers.setAmount_of_calories(32);
                chakeStorge(peppers);
                olive.setWeight(54);
                olive.setAmount_of_calories(78);
                chakeStorge(olive);
                PizzaType.price = 11;
                break;
            default:
                break;
        }
    }

    public static void setChicken(String doughSize) throws SoldOut {
        //the method will set toppings for the chicken pizza with the suitable quantity for the size        
        switch (doughSize) {
            case "small":

                chicken.setWeight(350);
                chicken.setAmount_of_calories(837);
                chakeStorge(chicken);
                garlic.setWeight(50);
                garlic.setAmount_of_calories(9);
                chakeStorge(garlic);
                olive_oil.setWeight(10);
                olive_oil.setAmount_of_calories(127.5);
                chakeStorge(olive_oil);
                Parmesan.setWeight(180);
                Parmesan.setAmount_of_calories(776);
                chakeStorge(Parmesan);
                mozzarella.setWeight(180);
                mozzarella.setAmount_of_calories(504);
                chakeStorge(mozzarella);
                PizzaType.price = 6;
                break;
            case "medium":
                chicken.setWeight(420);
                chicken.setAmount_of_calories(910);
                chakeStorge(chicken);
                garlic.setWeight(55);
                garlic.setAmount_of_calories(13);
                chakeStorge(garlic);
                olive_oil.setWeight(21);
                olive_oil.setAmount_of_calories(190);
                chakeStorge(olive_oil);
                Parmesan.setWeight(200);
                Parmesan.setAmount_of_calories(799);
                chakeStorge(Parmesan);
                mozzarella.setWeight(180);
                mozzarella.setAmount_of_calories(504);
                chakeStorge(mozzarella);
                PizzaType.price = 9;
                break;
            case "large":
                chicken.setWeight(370);
                chicken.setAmount_of_calories(900);
                chakeStorge(chicken);
                garlic.setWeight(50);
                garlic.setAmount_of_calories(9);
                chakeStorge(garlic);
                olive_oil.setWeight(16);
                olive_oil.setAmount_of_calories(134.8);
                chakeStorge(olive_oil);
                Parmesan.setWeight(222);
                Parmesan.setAmount_of_calories(821);
                chakeStorge(Parmesan);
                mozzarella.setWeight(222);
                mozzarella.setAmount_of_calories(555);
                chakeStorge(mozzarella);
                PizzaType.price = 12;
                break;

        }
    }

    public static void chakeStorge(Ingredients i) throws SoldOut {
        //this method is to make sure that any ingredient in storage is enough to make pizza, if not will throw exception
        MyException.sold(i);
        topping.add(i);
        i.setStorage(i.getStorage() - i.getWeight());

    }

    public static String getIngredientsInfo() {
        String s = "";
        for (int i = 0; i < topping.size(); i++) {
            s = s + "\n" + topping.get(i).getName();

        }
        return s;
    }

}
