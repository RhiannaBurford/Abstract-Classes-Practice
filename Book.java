public class Book extends LibraryItem {

    public Book(String title, int uniqueID){
        super(title, uniqueID);
    }

    @Override
    public int getLoanPeriod(){
        return 21;
    }
}
