package data.animals;

import data.animals.Animal;

public class Dog extends Animal {

    public Dog() {
        super(null);
    }

    public Dog(String name) {
        super(name);
    }

    @Override
    public int getType() {
        return Animal.TYPE_DOG;
    }
}
