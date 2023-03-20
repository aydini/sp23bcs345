package aydin._classwork;


public class Player {
    public static int count = 0; // count is a class variable
    private String userName;
    private String color;
    
    // constructor with parameters
    public Player(String userName,
            String color){
        this.userName= userName;
        this.color = color;        
        this.count++;
    }
    
    @Override
    public String toString(){
        return String.format("%s %s", this.userName,
                this.color);
    }
    
}
