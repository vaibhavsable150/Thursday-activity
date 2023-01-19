package question1;

public class FirstAndLastdigit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int number = 902356996;
        int firstDigit = 0;
        int lastDigit = 0;
 
        lastDigit = number%10;
        System.out.println("Last digit: "+lastDigit);
 
        while(number!=0) {
            firstDigit = number%10;
            number /= 10;
        }
        System.out.println("First digit: "+firstDigit);
	}

}
