
import java.util.*;

//adding comment for github demo 6/2/2022
public class Tri {
	static Scanner in = new Scanner(System.in);
	
	static int num1;
	static int num2;
	static int num3;
	
	public void SortOp(){
			 if(num1 / num2 == num3){ System.out.println(num1 + "/" +num2 + "=" + num3);}
		else if(num1 - num2 == num3){ System.out.println(num1 + "-" +num2 + "=" + num3);}
		else if(num1 * num2 == num3){ System.out.println(num1 + "*" +num2 + "=" + num3);}
		else if(num1 + num2 == num3){ System.out.println(num1 + "+" +num2 + "=" + num3);}
		else if(num1 == num2 / num3){ System.out.println(num1 + "=" +num2 + "/" + num3);}
		else if(num1 == num2 - num3){ System.out.println(num1 + "=" +num2 + "-" + num3);}
		else if(num1 == num2 * num3){ System.out.println(num1 + "=" +num2 + "*" + num3);}
		else if(num1 == num2 + num3){ System.out.println(num1 + "=" +num2 + "+" + num3);}
	}
	
	public static void main(String[] args){
		Tri T = new Tri();
		num1 = in.nextInt();
		num2 = in.nextInt();
		num3 = in.nextInt();
		T.SortOp();
	}

}

