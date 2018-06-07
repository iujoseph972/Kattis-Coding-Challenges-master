
import java.util.*;

public class Easiest {
	static Scanner in = new Scanner(System.in);
	static int num = -1;
	static int sum;
	static int match = 11;
	
	public void Repeat(){
		
		for(int i =11; i <= 100; i++){
			match = i;
			if(Sort2(match * num) == sum){ if(num == 0){}else{System.out.println(match);i=101;};}  
				else {}
			
		}
	}
	
	
	public int Sort(int n){
		Easiest E = new Easiest();
		String numString;
		int Length;
		numString = Integer.toString(n); 
		Length = numString.length();
		int nSum =0;
		
		for(int i = 0; i < Length; i++){
			
			nSum += Character.getNumericValue(numString.charAt(i));
			
		}
		sum = nSum;
		return nSum;
		}
	
	public int Sort2(int n){
		Easiest E = new Easiest();
		String numString;
		int Length;
		numString = Integer.toString(n); 
		Length = numString.length();
		int nSum =0;
		
		for(int i = 0; i < Length; i++){
			
			nSum += Character.getNumericValue(numString.charAt(i));
			
		}
		return nSum;
		}

	
	public static void main(String[] args) {
		Easiest E = new Easiest();
		
		while(num != 0){
		num = in.nextInt();
		
			
			E.Sort(num);
			E.Repeat();
		}
		
	}

}
