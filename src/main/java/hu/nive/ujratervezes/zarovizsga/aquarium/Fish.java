package hu.nive.ujratervezes.zarovizsga.aquarium;

public abstract class Fish {

    private String name;
    private int weight;
    private String color;
    private boolean memoryLoss = false;


    public Fish(String name, int weight, String color) {
        this.name = name;
        this.weight = weight;
        this.color = color;
    }

    public String getName() {
        return name;
    }

    public int getWeight() {
        return weight;
    }

    public String getColor() {
        return color;
    }

    public abstract void feed();

    public String status(){
        return this.toString();
    }

    public boolean hasMemoryLoss(){
        return memoryLoss;
    }

    protected void increaseWeight(int value){
        weight += value;
    }
    protected void setMemoryLoss(boolean b){
        memoryLoss = b;
    }

    @Override
    public String toString() {
        return name + ", weight: " + weight + ", color: " + color + ", short term memory loss: " + memoryLoss;
    }
}
