package Lab07;

import java.util.HashMap;
import java.util.Map;

public class RealLibraryAccess implements LibraryAccess {
    private Map<String, LibraryItem> items = new HashMap<>();

    public RealLibraryAccess() {
       LibraryItemFactory magazineFactory= new MagazineFactory();
       LibraryItemFactory bookFactory = new BookFactory();
        items.put("1", bookFactory.createLibraryItem("Teach C", "ABC"));
        items.put("2", magazineFactory.createLibraryItem("Teach Java", "CDE"));

    }

    @Override
    public void accessItem(String itemID, User user) {
        LibraryItem item = items.get(itemID);
        if (item != null) {
             item.borrowItem(user);
             return;
        }
        System.out.println("Item not found.");

    }
}
