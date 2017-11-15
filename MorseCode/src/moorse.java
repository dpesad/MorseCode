import java.util.ArrayList;
import java.util.Scanner;

//Class to create morseCode for each of the string
class Characters {
	String character;
	int Characters;
	String morseCode;
	
	public Characters (String character, String morseCode){
		this.character=character;
		this.morseCode=morseCode; 
	}
}

class Encrypt{

	String chk;
	String code= ""; 
	String name;
	ArrayList<Characters> chara;
	
	public Encrypt(String name,ArrayList<Characters> chara){
		this.name=name;
		this.chara = chara;
	}
	
	public String Encryptfunc(){
	
	for (int i = 0;i < name.length(); i++){  
	    chk = Character.toString(name.charAt(i));
	    
	    for(Characters ch:chara){ 	
	    	if (chk.equals( ch.character)){
	    		System.out.println(chk);
	            System.out.println(ch.morseCode);  
	            code = code+ch.morseCode + " ";
	    	}	
	    }
	    if (chk.equals(" ")){
	    	code =code + "/" +" "; 
	    }
	}
	System.out.println(code);
	return code;
	}
}

class Decrypt{
	 String Decrypt = "";
	 String text = "";
	 String code;
	 ArrayList<Characters> chara;
	 
public Decrypt (String code, ArrayList<Characters> chara){
	this.code=code;
	this.chara=chara;
}

public String DecryptFunc(){
for (int i = 0;i < code.length(); i++){ 
	
	if(Character.toString(code.charAt(i)).equals(" ")){
		System.out.println(Decrypt);
		for(Characters dec:chara){
		if(Decrypt.equals(dec.morseCode)){
			text = text+dec.character;
			System.out.println(text);
			++i;
		}
		}
		
		Decrypt ="";
	}

	if (i<code.length())
	Decrypt = Decrypt + code.charAt(i);
}
text = text.replace("  ", " ");

System.out.println(text);

return text;
}
}

public  class moorse {
public static void main (String args[]){
	System.out.println("Let's start the coding.");
	Scanner sc=new Scanner(System.in);  
	ArrayList<Characters> chara = new ArrayList<Characters>();
	
	Characters A = new Characters ("A","._");
	Characters B = new Characters ("B","_...");
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
	Characters spc = new Characters (" ","/");
	
	Characters num1 = new Characters ("1",".____");
	Characters num2 = new Characters ("2","..___");
	Characters num3 = new Characters ("3","...__");
	Characters num4 = new Characters ("4","...._");
	Characters num5 = new Characters ("5",".....");
	Characters num6 = new Characters ("6","_....");
	Characters num7 = new Characters ("7","__...");
	Characters num8 = new Characters ("8","___..");
	Characters num9 = new Characters ("9","____.");
	Characters num0 = new Characters ("0","_____");
	
	chara.add(num1);
	chara.add(num2);
	chara.add(num3);
	chara.add(num4);
	chara.add(num5);
	chara.add(num6);
	chara.add(num7);
	chara.add(num8);
	chara.add(num9);
	chara.add(num0);
	
	chara.add(spc);
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
	String name = sc.nextLine();
	name = name.toUpperCase();
	
	Encrypt c = new Encrypt(name,chara);
	String code = c.Encryptfunc();
	
	Decrypt d = new Decrypt (code,chara);
	d.DecryptFunc();
}
	
}




