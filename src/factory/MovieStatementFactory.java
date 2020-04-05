public class MovieStatementFactory {
    
    public IMovieStatementHandler getHandler(MovieType movieType) {
        switch(movieType) {
            case MovieType.REGULAR:
                return new RegularMovieStatementHandler();
            case MovieType.NEW_RELEASE:
                return new NewReleaseMovieStatementHandler();
            case MovieType.CHILDRENS:
                return new ChildrensMovieStatementHandler();
        }
    }
    
     public IMovieStatementHandler getHandler(int value) {
         return getHandler(MovieType.getByValue(value));
     }
}