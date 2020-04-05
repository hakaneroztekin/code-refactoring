public class MovieService {
    
      public String statement(Customer customer) {  
        Statement statement = new Statement();
        StatementHelper helper = new StatementHelper(statement);
          
        helper.updateSummary(customer);
          
        customer.getRentals().stream()
              .forEach(rental -> {
                MovieTypeFactory
                    .getHandler(rental.getMovie().getPriceCode())
                    .updateStatement(rental, statement);
                helper.updateSummary(rental);
              });
          
        helper.updateSummary();
          
        return statement.getSummary();
    }
}

