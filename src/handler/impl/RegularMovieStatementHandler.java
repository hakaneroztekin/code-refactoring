public class RegularMovieStatementHandler implements IMovieStatementHandler {
    
    @Override
    public void updateStatement(Rental rental, Statement statement) {
        updateTotalAmount(rental, statement);
        updateFrequentRenterPoints(statement);
    }
    
    private void updateTotalAmount(Rental rental, Statement statement) {
        double totalAmount = statement.getTotalAmount();
        totalAmount += 2;
        
        if (rental.getDaysRented() > 2) {
            totalAmount += (rental.getDaysRented() - 2) * 1.5;
        }

        statement.setTotalAmount(totalAmount);
    }
    
    private void updateFrequentRenterPoints(Statement statement) {
	   statement.setFrequentRenterPoints(statement.getRenterPoints() + 1);
    }
}