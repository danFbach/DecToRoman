package numberToRoman;
import java.util.*;

public class BackToDec {
	String Roman;
	Integer number = 0;
	Scanner scan = new Scanner(System.in);
	
	public int decimal(){		
		System.out.println("Numeral?");
		Roman = scan.nextLine();
		while(Roman.startsWith("M"))
		{	
			number += 1000;
			Roman = Roman.substring(1);
			System.out.println(Roman);
		}
		while(Roman.contains("CM"));
		{	
			number += 900;
			Roman = Roman.substring(2);
			System.out.println(Roman);
		}
		while(Roman.contains("D"))
		{	
			number += 500;
			Roman = Roman.substring(1);
			System.out.println(Roman);
		}
		while(Roman.contains("CD"))
		{	
			number += 400;
			Roman = Roman.substring(2);
			System.out.println(Roman);
		}
		while(Roman.contains("C"))
		{	
			number += 100;
			Roman = Roman.substring(1);
		}
		while(Roman.contains("XC"))
		{	
			number += 90;
			Roman = Roman.substring(2);
		}
		while(Roman.contains("L"))
		{	
			number += 50;
			Roman = Roman.substring(1);
		}
		while(Roman.contains("XL"))
		{	
			number += 40;
			Roman = Roman.substring(2);
		}
		while(Roman.contains("X"))
		{	
			number += 10;
			Roman = Roman.substring(1);
		}
		while(Roman.contains("IX"))
		{	
			number += 9;
			Roman = Roman.substring(1);
		}
		while(Roman.contains("V"))
		{	
			number += 5;
			Roman = Roman.substring(1);
		}
		while(Roman.contains("IV"))
		{	
			number += 4;
			Roman = Roman.substring(2);
		}
		while(Roman.contains("I"))
		{	
			number += 1;
			Roman = Roman.substring(1);
		}
		System.out.println(number);
		return number;
	}
	
}


//while(number >= 900)
//{	Roman += "CM";
//	number -= 900;
//}while(number >= 500)
//{	Roman += "D";
//	number -= 500;
//}while(number >= 400)
//{	Roman += "CD";
//	number -= 400;
//}while(number >= 100)
//{	Roman += "C";
//	number -= 100;
//}while(number >= 90)
//{	Roman += "XC";
//	number -= 90;
//}while(number >= 50)
//{	Roman += "L";
//	number -= 50;
//}while(number >= 40)
//{	Roman += "XL";
//	number -= 40;
//}while(number >= 10)
//{	Roman += "X";
//	number -= 10;
//}while(number >= 9)
//{	Roman += "IX";
//	number -= 9;
//}while(number >= 5)
//{	Roman += "V";
//	number -= 5;
//}while(number >= 4)
//{	Roman += "IV";
//	number -= 4;
//}while(number >= 1)
//{	Roman += "I";
//	number -= 1;}