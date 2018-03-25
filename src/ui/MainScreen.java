package ui;

import core.MainPresenter;

import java.util.Scanner;

public class MainScreen extends Screen implements MainPresenter.ViewListener {

    private MainPresenter presenter;
    private Scanner scanner;

    @Override
    protected void loadData() {
        this.scanner = new Scanner(System.in);
        this.presenter = new MainPresenter(this);
    }

    @Override
    protected String getScreenName() {
        return "Main";
    }

    @Override
    public void showMainMenu() {
        System.out.println(" __________________________________" + "\n" +
                           "|          Choose option           |" + "\n" +
                           "|  1. Register Animal              |" + "\n" +
                           "|  2. Show All Registered Animals  |" + "\n" +
                           "|  3. Search for Animal            |" + "\n" +
                           "|__________________________________|");
    }

    @Override
    public void startRegisterAnimalScreen() {
        new RegisterAnimalScreen();
    }

    @Override
    public void startSearchAnimalScreen() {
        new SearchScreen(SearchScreen.DEFAULT);
    }

    @Override
    public void startAllAnimalScreen() {
        new SearchScreen(SearchScreen.SHOW_ALL);
    }

    @Override
    public int getOptionFromUser() {
        return scanner.nextInt();
    }

    @Override
    public void showInvalidOptionMessage() {
        System.out.println("Enter 1, 2 or 3 only.");
    }
}
