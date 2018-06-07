
import java.util.*;

public class Trips {
    
    static Scanner in = new Scanner(System.in);
   
    
        static int cases;
        static int trips;
        static String place;
       
        static LinkedList<String> locations;
        
    void Sort(){
         
    	 if(!locations.contains(place))
    	 
    		 locations.add(place); 
    	
    }
        
        
    
    public static void main(String[] args){
        Trips T = new Trips();
        cases = Integer.parseInt(in.next());
      
        for (int i= 0;i < cases; i++ ){
        	 
            trips =  Integer.parseInt(in.next());
            locations = new LinkedList<String>();
            
         for(int n=0; n < trips ; n++){
        	 
             place = in.next();
             T.Sort();
    
         }
        
         System.out.println( locations.size());
         
        }
    
    }
}

