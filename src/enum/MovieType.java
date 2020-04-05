public enum MovieType {
    REGULAR(0),
    NEW_RELEASE(1),
    CHILDRENS(2);
    
    @Getter
    private int value;
    
    public MovieType(int value) {
        this.value = value;
    }
    
}