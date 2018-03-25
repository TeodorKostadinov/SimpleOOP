package ui;

import core.LoginPresenter;

import java.util.Scanner;

public class LoginScreen extends Screen implements LoginPresenter.ViewListener {

    private Scanner scanner;
    private LoginPresenter presenter;

    @Override
    protected void loadData() {
        scanner = new Scanner(System.in);
        presenter = new LoginPresenter(this);
    }

    @Override
    protected String getScreenName() {
        return "Login";
    }

    @Override
    public void showAuthenticateMessage() {
        System.out.println("Hello, please enter username and password:\n");
    }

    @Override
    public String getUsernameFromUser() {
        return scanner.next();
    }

    @Override
    public String getPaswordFromUser() {
        return scanner.next();
    }

    @Override
    public void showWrongCredentials() {
        System.out.println("Wrong credentials. Try again.");
    }

    @Override
    public void startMainScreen() {
        new MainScreen();
    }
}
