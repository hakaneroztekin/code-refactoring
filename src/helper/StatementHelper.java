public class StatementHelper {
    
    private Statement statement;
    
    private StatementHelper() {}
    
    public StatementHelper(Statement statement) {
        this.statement = statement;
    }
    
    public void addSummary(Rental rental) {
         return "\t" + rental.getMovie().getTitle() + "\t" + String.valueOf(statement.getTotalAmount()) + "\n";
    }
    
    public void addSummary(Customer customer) {
        return "Rental Record for " + customer.getName() + "\n";
    }
    
    public void addSummary() {
        return "Amount owed is " + String.valueOf(statement.getTotalAmount()) 
            + "\n You earned " + String.valueOf(statement.getFrequentRenterPoints()) + " frequent renter points";
    }
    
}