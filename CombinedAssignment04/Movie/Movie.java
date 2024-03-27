package CombinedAssignment04.Movie;

abstract public class Movie {
   String name;
   float duration;
   float rating;
   String genre = "generic";
   Movie(String name,float duration,float rating ){
    this.name = name;
    this.duration = duration;
    this.rating = rating; 
   }
   abstract void aboutMovie();
   

   public static void main(String[] args) {
    ThrillerMovie movie = new ThrillerMovie("abc",2.14f,3.5f);
    movie.aboutMovie();
    RomComMovie movie2 = new RomComMovie("def", 2, 4);
    movie2.aboutMovie();
   }
}
