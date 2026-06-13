
public class ConditionalStatement {
    public static void main(String[] args) {
        // 1. if statement
            int x = 10;
            if(x > 5){
                System.out.println("x greater than 5");
            }

        // 2. if-else statement
            int x1 = 5;
            if(x1 > 0){
                System.out.println("x1 is positive");
            }
            else{
                System.out.println("x1 is negative");
            }
            
        // 3. if-else-if statement
            float x2 = 5.0f;
            if(x2 > 0){
                System.out.println("x2 is positive");
            }
            else if(x2 < 0){
                System.out.println("x2 is negative");
            }
            else{
                System.out.println("x2 is zero");
            }

        // 4. switch statement
            int day = 2;
            switch(day){
                case 1:
                    System.out.println("Monday");
                    break;
                case 2:
                    System.out.println("Tuesday");
                    break;
                case 3:
                    System.out.println("Wednesday");
                    break;
                case 4:
                    System.out.println("Thursday");
                    break;
                case 5:
                    System.out.println("Friday");
                    break;
                case 6:
                    System.out.println("Saturday");
                    break;
                case 7:
                    System.out.println("Sunday");
                    break;
                default:
                    System.out.println("invalid day number");                            
            } 
            
        // 5. ternary operator/statement
            int a = 10;
            System.out.println(a > 0 ? "a is positive" : "a is not positive");   
    
        // 6. Nested ternary
            int b = 0;
            String res = b > 0 ? "b is positive" : (b < 0 ? "b is negative" : "b is zero");
            System.out.println(res);        }
}
