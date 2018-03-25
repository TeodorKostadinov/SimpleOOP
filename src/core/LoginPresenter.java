package core;

import data.users.UsersDao;

public class LoginPresenter {

    private final ViewListener listener;
    private UsersDao authenticatorManager;

    public LoginPresenter(ViewListener listener) {
        this.listener = listener;
        authenticatorManager = UsersDao.getInstance();
        startAuthentication();
    }

    private void startAuthentication() {
        while(!authenticate());
        listener.startMainScreen();
    }

    private boolean authenticate() {
        listener.showAuthenticateMessage();
        String username = listener.getUsernameFromUser();
        String password = listener.getPaswordFromUser();
        if(authenticatorManager.isRegisteredUser(username, password)) {
            return true;
        } else {
            listener.showWrongCredentials();
            return false;
        }
    }

    public interface ViewListener {
        void showAuthenticateMessage();
        String getUsernameFromUser();
        String getPaswordFromUser();
        void showWrongCredentials();
        void startMainScreen();
    }
}
