import java.util.Scanner;

public class BC2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		// Taking input for the ages of three people
        System.out.println("Enter age of person 1:");
        int age1 = scanner.nextInt();

        System.out.println("Enter age of person 2:");
        int age2 = scanner.nextInt();

        System.out.println("Enter age of person 3:");
        int age3 = scanner.nextInt();

        // Finding the oldest and youngest ages
        int oldest = Math.max(age1, Math.max(age2, age3));
        int youngest = Math.min(age1, Math.min(age2, age3));

        // Displaying the results
        System.out.println("Oldest person's age: " + oldest);
        System.out.println("Youngest person's age: " + youngest);
		
		
		
		
	}

}