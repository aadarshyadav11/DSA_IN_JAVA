import java.util.Scanner;

class InputOutput{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // taking integer input using: nextInt()
            // System.out.print("Enter first number: ");
            // int n1 = sc.nextInt();
            // System.out.print("Enter second number: ");
            // int n2 = sc.nextInt();
            // System.out.println("Sum of num1 and num2 = "+ (n1 + n2));

        // taking multiple types of input
            System.out.print("Enter a sentence: ");
            String sentence = sc.nextLine();
            System.out.println("Entered sentence: "+ sentence);

            System.out.print("Enter an integer value: ");
            int x = Integer.parseInt(sc.nextLine()); 
            System.out.println("Entered Integer: "+ x);

            System.out.print("Enter a Float value: ");
            float y = Float.parseFloat(sc.nextLine()); 
            System.out.println("Entered Float: "+ y);
        

        
        sc.close();
    }
}