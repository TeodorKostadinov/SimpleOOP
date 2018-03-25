package core;

import data.animals.Animal;
import data.animals.AnimalsDao;
import data.animals.Cat;
import data.animals.Dog;

public class RegisterAnimalPresenter {

    private final ViewListener listener;
    private final AnimalsDao animalsDao;

    public RegisterAnimalPresenter(ViewListener listener) {
        this.listener = listener;
        this.animalsDao = AnimalsDao.getInstance();
        registerAnimal();
    }

    private void registerAnimal() {
        int type = listener.getAnimalTypeFromUser();
        Animal animal = createAnimalByType(type);
        if(animal != null) {
            animal.setName(listener.getAnimalNameFromUser());
            animalsDao.add(animal);
            listener.showAnimalAdded();
        } else {
            listener.showBadInput();
        }

        listener.closeScreen();
    }

    private Animal createAnimalByType(int type) {
        switch (type) {
            case Animal.TYPE_CAT: return new Cat();
            case Animal.TYPE_DOG: return new Dog();
        }
        return null;
    }

    public interface ViewListener {
        int getAnimalTypeFromUser();
        void closeScreen();
        void showBadInput();
        String getAnimalNameFromUser();
        void showAnimalAdded();
    }
}
