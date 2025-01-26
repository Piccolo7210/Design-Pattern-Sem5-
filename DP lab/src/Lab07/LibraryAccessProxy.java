package Lab07;

public class LibraryAccessProxy implements LibraryAccess {
    private RealLibraryAccess realLibraryAccess ;
    
    @Override
    public void accessItem(String itemID, User user) {
        if (user.getID()>=100 && user.getID()<=200) {
            realLibraryAccess = new RealLibraryAccess();
             realLibraryAccess.accessItem(itemID, user);
        } else {
            System.out.println("Access denied for user: " + user.getName() +"Id: "+user.getID());

        }
    }
}

