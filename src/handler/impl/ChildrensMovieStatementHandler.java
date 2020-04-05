public class ChildrensMovieStatementHandler implements IMovieStatementHandler {
    
    public void calculateStatement(Rental rental, Statement statement) {
        calculateTotalAmount(rental, statement);
    }
    
    private void calculateTotalAmount(Rental rental, Statement statement) {
        double totalAmount = statement.getTotalAmount();
        totalAmount += 1.5;
        
        if (rental.getDaysRented() > 3) {
            totalAmount += (each.getDaysRented() - 3) * 1.5;
        }
        
        statement.setTotalAmount(totalAmount);
    }
}