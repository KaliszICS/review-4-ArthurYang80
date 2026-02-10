import java.util.Scanner;

public class PracticeProblem {

	public static void main(String args[]) {
		q1();
		q2();
		q3();
		q4();
		q5();
		q6();		
	}

	public static void q1() {
	Scanner s = new Scanner(System.in);
		System.out.println("Input an integer: ");
	String num = s.nextLine();
	num = "5" + num;
	int word = Integer.parseInt(num);
	word += 5;
	System.out.println(word);
	s.close();
	}

	public static void q2() {
	Scanner s = new Scanner(System.in);
		System.out.println("Input a number: ");	
	String num = s.nextLine();
	num = "4" + num + "3";
	double dub = Double.parseDouble(num);
	dub += 3.4;
	System.out.println(dub);
	s.close();	
	}

	public static void q3() {
	Scanner s = new Scanner(System.in);
		System.out.println("Input a boolean: ");
	String num = s.nextLine();
	boolean bool = Boolean.parseBoolean(num); 
	bool = !bool;
	System.out.println(bool);
	s.close();
	}

	public static void q4() {
	Scanner s = new Scanner(System.in);
	System.out.println("Input an integer: ");
	String num = s.nextLine();
	num = num + "3";
	int value = Integer.parseInt(num);
	value += 2;
	char newValue = (char)value; 
	System.out.println(newValue);
	s.close();
	}

	public static void q5() {
	Scanner s = new Scanner(System.in);
	System.out.println("Input an integer: ");
	String num = s.nextLine();
	num = num + "1";
	int word = Integer.parseInt(num);
	double dub = word / 2.0;
	System.out.println(dub);
	s.close();	
	}

	public static void q6() {
	Scanner s = new Scanner(System.in);
	System.out.println("Input an number: ");
	String num = s.nextLine();
	num = "1" + num;
	double word = Double.parseDouble(num);
	int word2 = (int)word;
	System.out.println(word2);
	s.close();
	}

}
