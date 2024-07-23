package programs.library;

public class Books {

    private String BookName;
    private Auther Authername;
    private int price;
    
    public String getBookName() {
        return BookName;
    }
    public void setBookName(String bookName) {
        BookName = bookName;
    }
    public Auther getAuthername() {
        return Authername;
    }
    public void setAuthername(Auther authername) {
        Authername = authername;
    }
    public int getPrice() {
        return price;
    }
    public void setPrice(int price) {
        this.price = price;
    }
    @Override
    public String toString() {
        return "Books [BookName=" + BookName + ", Authername=" + Authername + ", price=" + price + "]";
    }
    
}
