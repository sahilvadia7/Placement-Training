package programs.library;

public class Library {

    public static void main(String[] args) {
        
        Books books = new Books();
        Auther auther = new Auther();
        auther.setAutherFname("Ankit");
        auther.setAutherLname("Yadav");

        books.setAuthername(auther);
        books.setBookName("Java for beginer");
        books.setPrice(300);


        System.out.println(auther);
        System.out.println(books);
        


    }
    
}
