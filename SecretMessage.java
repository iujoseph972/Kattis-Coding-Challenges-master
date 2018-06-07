

import java.util.*;

public class SecretMessage {
    static Scanner in = new Scanner(System.in);
    static int cases;
    static String num;
    static SecretMessage S = new SecretMessage();

    static String message ;
    static int length ;
    int m = 0;
    int k = 0;
    int k2 = 1;
    

            void Op2(int nRoot){
                int n = nRoot * nRoot;
//                String code = "";
                StringBuilder sb = new StringBuilder();
                int startPos = n - 1;
                int root = nRoot - 1;
                for(int i=0; i < (n - length);i++){ message += "*"; }
                    for(int G= 0; G < n;G++,m++ ){
                    	if(G == (k2*nRoot)) {
                    		k2++;
                    		k++;
                    		m = 0;
                    	}  
                    	sb.append(message.charAt((k - root) + (startPos -  nRoot * m)));
                    }
                     String code = sb.toString();
                     code = code.replace("*", "");
                   System.out.println(code); 
                   m= 0; 
                   k= 0;
                   k2 = 1;
                }
                 
            

            void Op1(){
                message = in.next();
                length = message.length();
                for(int i = 0;i < 200;i++){
                        if((i * i) >= length){
                        	Op2(i);
                        	break;
                        }
                    }
            }

    public static void main(String[] args) {
        SecretMessage S = new SecretMessage();
        cases = in.nextInt();
       
	      for(int i = 0; i <cases; i++){
	          S.Op1();
	      }
      }
    }
/*

1000 asdfghkjhjkhagsdfhjkgasdhjfgjhasdgfjhkgasduyfkgasdkyufgweuykgwuygegwghwuighweiughiuwgwhiugiuwheg

 */
