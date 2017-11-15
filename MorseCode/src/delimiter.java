

import java.util.*;  
public class delimiter{  
public static void main(String args[]){  
     String input = "10 tea 20 coffee 30 tea buiscuits";  
     Scanner s = new Scanner(input).useDelimiter("\\s");  
     System.out.println(s.nextInt());  
     System.out.println(s.next());  
     System.out.println(s.nextInt());  
     System.out.println(s.next());  
     s.close();   
     for (int i = 0;i < input.length(); i++){
    	    System.out.println(input.charAt(i));
    	}
}}  


//loop for characters
/*	
for (char alphabet = 'A'; alphabet <= 'Z'; alphabet++) {
    System.out.println(alphabet);
    
}
*/