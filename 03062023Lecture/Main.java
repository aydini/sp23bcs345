package aydin._classwork;

public class Main {
    public static void main(String[] args) {
        Player chris = new Player("Chris", "Black");
        Player reetz = new Player("Reetz", "White");
        
        System.out.println(chris);
        System.out.println(chris.toString());    
        
        System.out.println("there are " + Player.count + 
                " players in this game");            
    }
    
}
