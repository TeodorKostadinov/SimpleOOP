package ui;

import core.RegisterAnimalPresenter;

import java.util.Scanner;

public class RegisterAnimalScreen extends Screen implements RegisterAnimalPresenter.ViewListener {

    private Scanner scanner;
    private RegisterAnimalPresenter presenter;

    @Override
    protected void loadData() {
        this.scanner = new Scanner(System.in);
        this.presenter = new RegisterAnimalPresenter(this);
    }

    @Override
    protected String getScreenName() {
        return "RegisterAnimal";
    }

    @Override
    public int getAnimalTypeFromUser() {
        System.out.println("Enter Animal type. 1 for Cat and 2 for Dog.");
        return scanner.nextInt();
    }

    @Override
    public void closeScreen() {
        new MainScreen();
    }

    @Override
    public void showBadInput() {
        System.out.println("You've entered a bad value");
    }

    @Override
    public String getAnimalNameFromUser() {
        System.out.println("Enter animal name.");
        return scanner.next();
    }

    @Override
    public void showAnimalAdded() {
        System.out.println("Animal added successfully!");
    }
}
