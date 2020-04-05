public class MovieService {
    
      public String statement(Customer customer) {  
        Statement statement = new Statement();
            
        String summary = "Rental Record for " + customer.getName() + "\n";
          
        for (Rental rental : customer.getRentals()) {
            
            //determine amounts for each line
            MovieTypeFactory
                .getHandler(rental.getMovie().getPriceCode())
                .updateStatement(rental, statement);
            
            // add frequent renter points
            statement.setFrequentRenterPoints(statement.getFrequentRenterPoints() + 1);

            //show figures for this rental
            summary += buildRentalSummary(rental, statement);

        }         //add footer lines
        summary += "Amount owed is " + String.valueOf(totalAmount) + "\n";
        summary += "You earned " + String.valueOf(frequentRenterPoints) + " frequent renter points";
        return summary;
    }
    
    private String buildRentalSummary(Rental rental, Statement statement) {
        return "\t" + rental.getMovie().getTitle() + "\t" + String.valueOf(statement.getTotalAmount()) + "\n";
    }
}

