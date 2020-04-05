public class StatementHelper {
    
    private Statement statement;
    
    private StatementHelper() {}
    
    public StatementHelper(Statement statement) {
        this.statement = statement;
    }
    
    public void addSummary(Rental rental) {
        String newSummary = new StringBuilder()
            .append("\t")
            .append(rental.getMovie().getTitle())
            .append("\t")
            .append(String.valueOf(statement.getTotalAmount()))
            .append("\n")
            .toString();
        statement.setSummary(newSummary);
    }
    
    public void addSummary(Customer customer) {
        String newSummary = new StringBuilder()
            .append("Rental Record for ")
            .append(customer.getName())
            .append("\n")
            .toString();
        statement.setSummary(newSummary);
    }
    
    public void addSummary() {
        String newSummary = new StringBuilder()
            .append(statement.getSummary())
            .append("Amount owed is ")
            .append(String.valueOf(statement.getTotalAmount()))
            .append("\n You earned ")
            .append(String.valueOf(statement.getFrequentRenterPoints()))
            .append(" frequent renter points")
            .toString();
        statement.setSummary(newSummary);
    }
    
}