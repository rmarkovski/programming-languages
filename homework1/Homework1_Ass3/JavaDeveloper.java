
public class JavaDeveloper {

	public static void main(String[] args) {
		
		String javaDeveloper = ("Java Developer");
		int length = javaDeveloper.length();
		char first = javaDeveloper.charAt(0);
		char last = javaDeveloper.charAt (length - 1);
		char middle = javaDeveloper.charAt(length/2);
		
		int prva = first;
		int posledna = last;
		int sredna = middle;
		
		int sum = prva + posledna + sredna;
	
		System.out.println("My string is " + javaDeveloper);
		System.out.println("It's first character is " + first);
		System.out.println("It's last character is " + last);
		System.out.println("It's middle character is " + middle);
		System.out.println("The sum of these characters is: " + sum);
		
		if (prva > posledna && prva > sredna)
				System.out.println("The biggest character of these three is " + first + "with the code of " + prva);
			
		else if (posledna > sredna)
				System.out.println("The biggest character of these three is " + last + "with the code of " + posledna);
			
			else System.out.println("The biggest character of these three is " + middle + "with the code of " + sredna);
					
	}

}
