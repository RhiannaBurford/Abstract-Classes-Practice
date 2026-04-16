public abstract class LibraryItem {
    protected String title;
    protected int uniqueID;
    
    public LibraryItem(String title, int uniqueID){
        this.title = title;
        this.uniqueID = uniqueID;
    }

    public void displayInfo(){
        System.out.println("ID: " + uniqueID + " - Title: " + title);
    }

    abstract int getLoanPeriod();
}
