package Homework3.Work1;

import Homework3.Work1.Flower;

public class Lily extends Flower {

    public Lily(String name) {
        super(name);
    }


    @Override
    void voice() {
        System.out.println("Лілія " + super.getName() + "Коштує 35 грн");
    }

}
