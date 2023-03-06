package Homework3.Work1;

public abstract class Flower {

    private String name;

    public Flower(String name) {
        this.name = name;
    }

    abstract void voice();

    public String getName() {
        return name;
    }

}
