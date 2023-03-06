package Homework3.Work1;

import Homework3.Work1.Flower;

public class Rose extends Flower {

    public Rose(String name) {
        super(name);
    }


    @Override
    void voice() {
        System.out.println("Троянда " + super.getName() + "коштує 79 грн");
    }

}
