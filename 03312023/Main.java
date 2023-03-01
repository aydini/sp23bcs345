import java.util.ArrayList;
public class MainApp {
    
    public static void main(String[] args) {
        // a list of names handled using a regular
        // java array vs. class ArrayList        
        /////////////////////////////////////////////
        // using class ArrayList
        /////////////////////////////////////////////
        ArrayList<String> names = new ArrayList<String>();
        names.add("Gili");
        names.add("Jeff");
        names.add("Tika");
        
        System.out.println("The names in the ArrayList are...");
        for (int i=0; i < names.size(); i++ ){
            System.out.println(names.get(i));
        }                 
        
        /////////////////////////////////////////////
        // using a regular array
        /////////////////////////////////////////////
        final int CAPACITY = 10;
        String[]  namesArray = new String[CAPACITY]; // created the array
        int nameCount  = 0;
        
        // add new items into the array
        namesArray[0] = "Gili"; nameCount++;
        namesArray[1] = "Jeff"; nameCount++;
        namesArray[2] = "Tika"; nameCount++;       
        // display items from the array
        System.out.println("The names in the array are...");
        //for (int i = 0; i < namesArray.length; i++){
        for (int i = 0; i < nameCount; i++){
            System.out.println(namesArray[i]);
        }
        
   
   
    }
    
    
}
