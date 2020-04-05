@Data
class Customer {
    
    private String name;
    
    private List<Rental> rentals;
    
    public void addRental(Rental rental) {
        rentals.add(rental);
    }
}