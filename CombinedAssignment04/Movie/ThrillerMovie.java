package CombinedAssignment04.Movie;

public class ThrillerMovie extends Movie {
    ThrillerMovie(String name, float duration, float rating) {
        super(name, duration, rating);
        this.genre = "Thriller";
    }

    void aboutMovie(){
        System.out.println("if you fear ghost and supersitious this movie is for you to avoid :)");
       }
    
}
