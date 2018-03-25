package data.animals;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class AnimalsDao {

    private static AnimalsDao instance;
    private List<Animal> animals;

    public static AnimalsDao getInstance() {
        if(instance == null) {
            instance = new AnimalsDao();
        }
        return instance;
    }

    private AnimalsDao() {
        this.animals = new ArrayList<>(Arrays.asList(new Cat("Kotka"),
                new Dog("Ko4e")));
    }

    public void add(Animal animal) {
        this.animals.add(animal);
    }
}
