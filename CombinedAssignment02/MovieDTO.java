class MovieDTO {
    private String name;
    private String releaseDate;
    private int rating;
    static void playMovie(){
        System.out.println("Movie is being played");
    }
    void showMovieDetails(){
        System.out.println(name +"\t\t"+releaseDate+"\t\t"+rating);
    }
}
