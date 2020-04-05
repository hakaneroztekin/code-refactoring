public class MovieService {
    
      public String statement(Customer customer) {  
        Statement statement = new Statement();
            
        String summary = buildCustomerSummary();
          
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
        summary += buildFooterSummary();
        return summary;
    }
    
    private String buildCustomerSummary(Customer customer, Statement statement) {
         return "Rental Record for " + customer.getName() + "\n";
    }
    
    private String buildRentalSummary(Rental rental, Statement statement) {
        return "\t" + rental.getMovie().getTitle() + "\t" + String.valueOf(statement.getTotalAmount()) + "\n";
    }
    
    private String buildFooterSummary(Statement statement) {
        return "Amount owed is " + String.valueOf(statement.getTotalAmount()) 
            + "\n You earned " + String.valueOf(statement.getFrequentRenterPoints()) + " frequent renter points";
    }
}

