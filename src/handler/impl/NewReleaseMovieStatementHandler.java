public class NewReleaseMovieStatementHandler implements IMovieStatementHandler {
    
    public void calculateStatement(Rental rental, Statement statement) {
        calculateTotalAmount(rental, statement);
    }
    
    private void calculateTotalAmount(Rental rental, Statement statement) {
        double totalAmount = statement.getTotalAmount();
        totalAmount += rental.getDaysRented() * 3;
        statement.setTotalAmount(totalAmount);
    }
}