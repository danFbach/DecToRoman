package numberToRoman;
import java.util.*;

public class Math {
	Scanner scan = new Scanner(System.in);
	Integer number;
	String Roman = "";
	String Stop = "";
	
	public String convert(){
		while(Stop.equals("")){
		Roman = "";
		System.out.println("Number?");
		number = scan.nextInt();
	if(number >= 1 || number <= 10000){
		
		while(number >= 1000)
		{			
			Roman += "M";
			number -= 1000;
		}while(number >= 900)
		{
			Roman += "CM";
			number -= 900;
		}while(number >= 500)
		{
			Roman += "D";
			number -= 500;
		}while(number >= 400)
		{
			Roman += "CD";
			number -= 400;
		}while(number >= 100)
		{
			Roman += "C";
			number -= 100;
		}while(number >= 90)
		{
			Roman += "XC";
			number -= 90;
		}while(number >= 50)
		{
			Roman += "L";
			number -= 50;
		}while(number >= 40)
		{
			Roman += "XL";
			number -= 40;
		}while(number >= 10)
		{
			Roman += "X";
			number -= 10;
		}while(number >= 9)
		{
			Roman += "IX";
			number -= 9;
		}while(number >= 5)
		{
			Roman += "V";
			number -= 5;
		}while(number >= 4)
		{
			Roman += "IV";
			number -= 4;
		}while(number >= 1)
		{
			Roman += "I";
			number -= 1;
		}
		
		System.out.println(Roman);

	}
		}	return Roman;
	}		
}
