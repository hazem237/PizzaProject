package javaproject;

public class Ingredients {
    
    private double amount_of_calories;
    private final String name;
    private double weight;
    private double Storage;
    //evvery ingredient will have a name, wight, amount of calories and quantity in grams in storage
    
    public Ingredients(String name, double storage) {
        this.name = name;
        this.Storage = storage;
    }

    public Ingredients(String name, double weight, double amount_of_calories) {
        this.amount_of_calories = amount_of_calories;
        this.name = name;
        this.weight = weight;
    }

    public void setStorage(double Storage) {
        this.Storage = Storage;
    }

    public double getStorage() {
        return Storage;
    }

    public String getName() {
        return name;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double getAmount_of_calories() {
        return amount_of_calories;
    }

    public void setAmount_of_calories(double amount_of_calories) {
        this.amount_of_calories = amount_of_calories;
    }

}
