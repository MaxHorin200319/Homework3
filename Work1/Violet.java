package Homework3.Work1;

import Homework3.Work1.Flower;

public class Violet extends Flower {

    public Violet(String name) {
        super(name);
    }


    @Override
    void voice() {
        System.out.println("Фіалка" + super.getName() + "Коштує 110 грн");
    }

}
