public class MovieService {
    
      public String statement(Customer customer) {  
        Statement statement = new Statement();
        StatementHelper helper = new StatementHelper(statement);
        helper.addSummary(customer);
          
        for (Rental rental : customer.getRentals()) {
            
            //determine amounts for each line
            MovieTypeFactory
                .getHandler(rental.getMovie().getPriceCode())
                .updateStatement(rental, statement);
            
            // add frequent renter points
            statement.setFrequentRenterPoints(statement.getFrequentRenterPoints() + 1);

            //show figures for this rental
            helper.addSummary(rental, statement);

        } //add footer lines
        helper.addSummary();
        return summary;
    }
}

