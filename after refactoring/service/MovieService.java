public class MovieService {
    
      public String statement(Customer customer) {  
        Statement statement = new Statement();
        StatementHelper helper = new StatementHelper(statement);
          
        helper.addSummary(customer);
          
        customer.getRentals().stream()
              .forEach(rental -> {
                MovieTypeFactory
                    .getHandler(rental.getMovie().getPriceCode())
                    .updateStatement(rental, statement);
                helper.addSummary(rental);
              });
          
        helper.addSummary();
          
        return statement.getSummary();
    }
}

