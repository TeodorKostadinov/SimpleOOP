package ui;

public abstract class Screen {

    protected Screen() {
        showScreenLabel();
        loadData();
    }

    private void showScreenLabel() {
        System.out.println("You are on " + getScreenName() + " screen.");
    }

    protected abstract void loadData();

    protected abstract String getScreenName();

}
