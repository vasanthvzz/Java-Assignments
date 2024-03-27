package CombinedAssignment04.Movie;

public class RomComMovie extends Movie{
    RomComMovie(String name, float duration ,float rating){
        super(name,duration,rating);
        this.genre = "Rom com";
    }
    void aboutMovie(){
        System.out.println("movie ideal for those who want love fantasy and with some jokes. ");
       }
}