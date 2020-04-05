public class NewReleaseMovieStatementHandler implements IMovieStatementHandler {
    
    @Override
    public void updateStatement(Rental rental, Statement statement) {
        updateTotalAmount(rental, statement);
        updateFrequentRenterPoints(rental, statement);
    }
    
    private void updateTotalAmount(Rental rental, Statement statement) {
        double totalAmount = statement.getTotalAmount();
        totalAmount += rental.getDaysRented() * 3;
        statement.setTotalAmount(totalAmount);
    }
    
    private void updateFrequentRenterPoints(Rental rental, Statement statement) {
        if (rental.getDaysRented() > 1) {
            statement.setFrequentRenterPoints(statement.getRenterPoints() + 1);
        } 
    }
}