import java.util.Scanner;

public class BC3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		// Taking input for the ages of three people
        System.out.println("Enter the classes held");
        double claases_held = scanner.nextInt();

        System.out.println("Enter the classes attended");
        double classes_attended = scanner.nextInt();
        
        double res = (classes_attended/claases_held)*100;
        if(res>75.0)
        {
        	System.out.println("Allowed");
        }
        else
        {
        	System.out.println("not allowed");
        }
		
		
	}

}