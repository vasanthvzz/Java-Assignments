import java.util.List;

public class Team {
    private String name;
    private String city;
    private String division;
    //private List<Player> playerList; --> To create a list of players for the team thus implementing one has many
    public void playGame(){
        System.out.println(name +" has played the game");
    }  
    public static void hireCoach(){
        System.out.println("the team has hired a coach");
    }  
}
