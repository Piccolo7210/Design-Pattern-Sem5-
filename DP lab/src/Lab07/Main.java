package Lab07;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        User user1 = new User("Mustakim", 101);
        User user2 = new User("Toha", 300);
        LibraryConfigManager config = LibraryConfigManager.getManager();

        LibraryAccess proxyAccess = new LibraryAccessProxy();

        proxyAccess.accessItem("1", user1);
        proxyAccess.accessItem("2", user2);

    }
}
