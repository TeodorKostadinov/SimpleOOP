package core;

public class MainPresenter {

    private static final int OPTION_REGISTER = 1;
    private static final int OPTION_SHOW_ALL = 2;
    private static final int OPTION_SEARCH = 3;

    private final ViewListener listener;

    public MainPresenter(ViewListener listener) {
        this.listener = listener;
        listener.showMainMenu();
        int option = listener.getOptionFromUser();
        while(!handleOption(option)) {
            option = listener.getOptionFromUser();
        }
    }

    /**
     * Handles menu selection
     * @param option the selected option
     * @return true if handled successfully, false if no such option
     */
    private boolean handleOption(int option) {
        switch (option) {
            case OPTION_REGISTER:
                onRegisterAnimalChosen();
                return true;
            case OPTION_SHOW_ALL:
                onShowAllAnimalsChosen();
                return true;
            case OPTION_SEARCH:
                onSearchAnimalChosen();
                return true;
            default:
                onInvalidOptionChosen();
                return false;
        }
    }

    private void onRegisterAnimalChosen() {
        listener.startRegisterAnimalScreen();
    }

    private void onSearchAnimalChosen() {
        listener.startSearchAnimalScreen();
    }

    private void onShowAllAnimalsChosen() {
        listener.startAllAnimalScreen();
    }

    private void onInvalidOptionChosen() {
        listener.showInvalidOptionMessage();
    }

    public interface ViewListener {

        void showMainMenu();

        void startRegisterAnimalScreen();

        void startSearchAnimalScreen();

        void startAllAnimalScreen();

        int getOptionFromUser();

        void showInvalidOptionMessage();
    }
}
