
import java.util.*;
	

public class Per {
	static Scanner in = new Scanner(System.in);
	
	static String message;
	static int count ;
	static int Length;
	static int thirdLength;
	static int k;
	static  String[] ary;
	
	
		public void Input(){
			 message = in.nextLine();
			 Length = message.length() ;
			 thirdLength = Length / 3;
			 count = 0;
			 ary = message.split("");
			 
		}

	
		public void SortP(){
			
			
				for(int i = 0 ; i < Length; i += 3){

				
					if(ary[i].equals("P")){
						count++;}
				}
				 
				
		}
		
		public void SortE(){
		
			 for(int i = 1 ; i < Length; i += 3){

					if(ary[i].equals("E")){
						count++;}
					
			
				}
			
			
		}
		
		
		public void SortR(){	

				for(int i = 2 ; i < Length; i += 3){

					if(ary[i].equals("R")){
						count++;}
				}

		}
		
	
		public static void main(String[] args) {
			Per P = new Per();
			
			P.Input();
			P.SortP();
			P.SortE();
			P.SortR();
			System.out.println(Length - count);
			
		
		}
}
