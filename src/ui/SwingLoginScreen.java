package ui;

import core.LoginPresenter;

public class SwingLoginScreen implements LoginPresenter.ViewListener {

    public SwingLoginScreen() {
        new LoginPresenter(this);
    }

    @Override
    public void showAuthenticateMessage() {

    }

    @Override
    public String getUsernameFromUser() {
        return null;
    }

    @Override
    public String getPaswordFromUser() {
        return null;
    }

    @Override
    public void showWrongCredentials() {

    }

    @Override
    public void startMainScreen() {

    }
}
