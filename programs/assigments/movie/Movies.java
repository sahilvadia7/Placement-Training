package programs.assigments.movie;


//here only movies data set-get & show 
public class Movies {

    private String MovieName,Description;
    private double price;

    public Movies(){
       
    }

    public Movies(String movieName, String description, double price) {
        MovieName = movieName;
        Description = description;
        this.price = price;
    }

    public String getMovieName() {
        return MovieName;
    }
    public void setMovieName(String movieName) {
        MovieName = movieName;
    }
    public String getDescription() {
        return Description;
    }
    public void setDescription(String description) {
        Description = description;
    }
    public double getPrice() {
        return price;
    }
    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Movies [MovieName=" + MovieName + ", Description=" + Description + ", price=" + price + "]";
    }

    
    
}
