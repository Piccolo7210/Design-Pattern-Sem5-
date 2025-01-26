package Lab07;

public final class LibraryConfigManager {
    private static volatile LibraryConfigManager manager;
    private double lateFee;
    private int borrowingLimit;
    private String libraryHours;

    private LibraryConfigManager() {
        this.lateFee = 100.0;
        this.borrowingLimit = 10;
        this.libraryHours = "8 AM to 6 PM";
    }

    public static synchronized LibraryConfigManager getManager() {
        LibraryConfigManager result = manager;
        if (manager != null) {
            return manager;
        }
        synchronized (LibraryConfigManager.class){
            if(manager==null){
                manager= new LibraryConfigManager();
            }
        return manager;
        }
    }

    public double getLateFee() {
        return lateFee;
    }

    public void setLateFee(double lateFee) {
        this.lateFee = lateFee;
    }

    public int getBorrowingLimit() {
        return borrowingLimit;
    }

    public void setBorrowingLimit(int borrowingLimit) {
        this.borrowingLimit = borrowingLimit;
    }

    public String getLibraryHours() {
        return libraryHours;
    }

    public void setLibraryHours(String libraryHours) {
        this.libraryHours = libraryHours;
    }
}

