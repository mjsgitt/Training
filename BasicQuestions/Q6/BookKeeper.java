public class BookKeeper extends Book{
    
    public BookKeeper(String Title, String Author) {
        super(Title, Author);
    }

    @Override
    public void RemoveBook() {
        // remove book from the arrayList
    }

    @Override
    public void AddBook() {
        // add book in the arraylist
    }
    public static void main(String[] args) {
        Book B = new BookKeeper("RAAAMPU", "DADA BASHA");
        System.out.println(B.getTitle());
    }

    
}