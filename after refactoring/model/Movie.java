@Data
public class Movie {

    private String title;
    
    private int priceCode;

    public Movie(String title, int priceCode) {
        title = title;
        priceCode = priceCode;
    }
}