
class Notes {
	public static void main(String[] args) {
		//Converting Data Types

		//Type Casting - Used between primitive types

		int num;
		double num2;
		boolean bool;
		char c;

		//int -> double

		num = 5;
		num2 = (double)num; //this makes a copy
		System.out.println(num2);

		//double -> int
		num2 = 5.5;
		num = (int)num2;
		System.out.println(num);

		//int -> char
		num = 82;
		c = (char)num;
		System.out.println(c);

		//char -> int
		c = '!';
		num = (int)c;
		System.out.println(num);

		//double -> char
		num2 = 88.2;
		c = (char)num2;
		System.out.println(c);

		//char -> double
		c = 'G';
		num2 = (double)c;
		System.out.println(num2);

		// System.out.println((boolean)5); Can't do this in java

		//Parsing - Converting from String to other data types

		String s = "55";
		num = Integer.parseInt(s);
		System.out.println(s + 10);
		System.out.println(num + 10);

		//double

		s = "55.789";
		num2 = Double.parseDouble(s);
		System.out.println(s + 10);
		System.out.println(num2 + 10);

		//Boolean -> true is true, everything else is false

		s = "truE";
		bool = Boolean.parseBoolean(s);
		System.out.println(s + 10);
		System.out.println(bool);

		//character
		s = "5";
		// c = Character.parseCharacter(s); Doesn't exist
		c = s.charAt(0);
		System.out.println(c);

		num = 5;
		s = num + "";
		System.out.println(s + 15);
	}
}
