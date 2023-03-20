package aydin._classwork;

public class Main {
    public static void main(String[] args) {
        Player chris = new Player("Chris", "Black");
        Player reetz = new Player("Reetz", "White");
        
        System.out.println(chris);
        System.out.println(reetz.toString());    
        
        System.out.println("there are " + Player.count + 
                " players in this game");            
        Game chess = new Game(chris, reetz, 3);
        System.out.println("Created this chess game...");
        System.out.println(chess); //toString method of Game is called
        
        
    }
    
}
