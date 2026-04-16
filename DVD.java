public class DVD extends LibraryItem {

    public DVD(String title, int uniqueID){
        super(title, uniqueID);
    }

    @Override
    public int getLoanPeriod(){
        return 7;
    }
}
