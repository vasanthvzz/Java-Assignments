public class Player {
    private String name;
    private String position;
    private int jerseyNumber;
    private Team team;
    
    void playGame(){
        System.out.println(name +" played the game!");
    }
    void train(){
        System.out.println("The player is being trained");
    }
}
