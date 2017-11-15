import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

//Class to create morseCode for each of the string
class Characters {
	String character;
	int numbers;
	String morseCode;
	

	Characters (String character, String morseCode){
		this.character=character;
		this.morseCode=morseCode; 
	}
}

class Numbers{
	int numbers;
	String morseCode;
	Numbers (int number, String morseCode){
		this.numbers=number;
		this.morseCode=morseCode;
	}
}


class Encrypt{
	
	
}

class Decrypt{
	
}


public class moorse {
public static void main (String args[]){
	System.out.println("Let's start the coding.");
	Scanner sc=new Scanner(System.in);  
	ArrayList<Characters> chara = new ArrayList<Characters>();
	ArrayList<Numbers> numb = new ArrayList<Numbers>();
	
	Characters A = new Characters ("A","._");
	Characters B = new Characters ("B","_..");
	Characters C = new Characters ("C","_._.");
	Characters D = new Characters ("D","_..");
	Characters E = new Characters ("E",".");
	Characters F = new Characters ("F",".._.");
	Characters G = new Characters ("G","__.");
	Characters H = new Characters ("H","....");
	Characters I = new Characters ("I","..");
	Characters J = new Characters ("J",".___");
	Characters K = new Characters ("K","_._");
	Characters L = new Characters ("L","._..");
	Characters M = new Characters ("M","__");
	Characters N = new Characters ("N","_.");
	Characters O = new Characters ("O","___");
	Characters P = new Characters ("P",".__.");
	Characters Q = new Characters ("Q","__._");
	Characters R = new Characters ("R","._.");
	Characters S = new Characters ("S","...");
	Characters T = new Characters ("T","_");
	Characters U = new Characters ("U",".._");
	Characters V = new Characters ("V","..._");
	Characters W = new Characters ("W",".__");
	Characters X = new Characters ("X","_.._");
	Characters Y = new Characters ("Y","_.__");
	Characters Z = new Characters ("Z","__..");

	Numbers num1 = new Numbers (1,".____");
	Numbers num2 = new Numbers (2,"..___");
	Numbers num3 = new Numbers (3,"...__");
	Numbers num4 = new Numbers (4,"...._");
	Numbers num5 = new Numbers (5,".....");
	Numbers num6 = new Numbers (6,"_....");
	Numbers num7 = new Numbers (7,"__...");
	Numbers num8 = new Numbers (8,"___..");
	Numbers num9 = new Numbers (9,"____.");
	Numbers num0 = new Numbers (0,"_____");
	
	numb.add(num1);
	numb.add(num2);
	numb.add(num3);
	numb.add(num4);
	numb.add(num5);
	numb.add(num6);
	numb.add(num7);
	numb.add(num8);
	numb.add(num9);
	numb.add(num0);
	
	chara.add(A);
	chara.add(B);
	chara.add(C);
	chara.add(D);
	chara.add(E);
	chara.add(F);
	chara.add(G);
	chara.add(H);
	chara.add(I);
	chara.add(J);
	chara.add(K);
	chara.add(L);
	chara.add(M);
	chara.add(N);
	chara.add(O);
	chara.add(P);
	chara.add(Q);
	chara.add(R);
	chara.add(S);
	chara.add(T);
	chara.add(U);
	chara.add(V);
	chara.add(W);
	chara.add(X);
	chara.add(Y);
	chara.add(Z);
	
	System.out.println("Enter the text you want to convert");
	String name=sc.next(); 
	name = name.toUpperCase();
	
	
	
	 for (int i = 0;i < name.length(); i++){
 	    System.out.println(name.charAt(i));
 	}

	 


	
	 	
	
	
}


}
