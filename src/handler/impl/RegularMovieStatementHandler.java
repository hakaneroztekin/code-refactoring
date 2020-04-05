public class RegularMovieStatementHandler implements IMovieStatementHandler {
    
    public void calculateStatement(Rental rental, Statement statement) {
        calculateTotalAmount(rental, statement);
    }
    
    private void calculateTotalAmount(Rental rental, Statement statement) {
        double totalAmount = statement.getTotalAmount();
        totalAmount += 2;
        
        if (rental.getDaysRented() > 2) {
            totalAmount += (rental.getDaysRented() - 2) * 1.5;
        }
        
        statement.setTotalAmount(totalAmount);
    }
}