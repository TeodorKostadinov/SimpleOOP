package data.animals;

import data.animals.Animal;

public class Cat extends Animal {

    public Cat() {
        super(null);
    }

    public Cat(String name) {
        super(name);
    }

    @Override
    public int getType() {
        return Animal.TYPE_CAT;
    }
}
