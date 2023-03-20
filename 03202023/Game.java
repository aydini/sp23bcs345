/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aydin._classwork;

/**
 *
 * @author itlabs
 */
public class Game {
    // fields
    private Player p1;
    private Player p2;
    int duration; 
    
    // constructor with parameters
    public Game(Player p1,
            Player p2,
            int duration){
        this.p1 = p1;
        this.p2 = p2;
        this.duration = duration;        
    }    
    // toString method
    @Override
    public String toString(){
        return String.format("Player1: %s Player2: %s  duration: %d", 
                this.p1,
                this.p2, this.duration);
    }
    
}
