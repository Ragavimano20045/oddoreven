import java.util.Scanner;

public class evenorodd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Check if the next input is an integer
        if (sc.hasNextInt()) {
            int a = sc.nextInt();  // Read the integer
            if (a % 2 == 0)
             {
                System.out.println("Even");
            } 
            else
             {
                System.out.println("Odd");
            }
        } 
        
        sc.close(); // Close the Scanner
    }
}
