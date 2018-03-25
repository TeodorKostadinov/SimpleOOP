package data.animals;

public abstract class Animal {
    public static final int TYPE_CAT = 1;
    public static final int TYPE_DOG = 2;
    private String name;

    public Animal(String name) {
        this.name = name;
    }

    public abstract int getType();

    public void setName(String name) {
        this.name = name;
    }
}
