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
    
    private void updateFrequentRenterPoints(Rental rental, Statement statement) {}
        int frequentRenterPoints = statement.getRenterPoints();
        frequentRenterPoints += rental.getDaysRented() > 1 ? 2 : 1;
        statement.setFrequentRenterPoints(frequentRenterPoints);
    }
}