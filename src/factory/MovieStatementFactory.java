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
}