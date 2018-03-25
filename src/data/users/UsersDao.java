package data.users;

import java.util.Arrays;
import java.util.List;

public class UsersDao {

    private static UsersDao instance;
    private List<User> users;

    public static UsersDao getInstance() {
        if(instance == null) {
            instance = new UsersDao();
        }
        return instance;
    }

    private UsersDao() {
        this.users = Arrays.asList(new User("Ginka", "1234"),
                new User("Gichka", "parola"));
    }

    public boolean isRegisteredUser(String username, String password) {
        for (User user : users) {
            if(user.getUsername().equals(username) && user.getPassword().equals(password)) {
                return true;
            }
        }
        return false;
    }
}
