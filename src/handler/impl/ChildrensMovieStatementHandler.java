public class ChildrensMovieStatementHandler implements IMovieStatementHandler {
    
    @Override
    public void updateStatement(Rental rental, Statement statement) {
        updateTotalAmount(rental, statement);
        updateFrequentRenterPoints(rental, statement);
    }
    
    private void updateTotalAmount(Rental rental, Statement statement) {
        double totalAmount = statement.getTotalAmount();
        totalAmount += 1.5;
        
        if (rental.getDaysRented() > 3) {
            totalAmount += (each.getDaysRented() - 3) * 1.5;
        }
        
        statement.setTotalAmount(totalAmount);
    }
    
    private void updateFrequentRenterPoints(Rental rental, Statement statement) {
	statement.setFrequentRenterPoints(statement.getRenterPoints() + 1);
    }
    
}