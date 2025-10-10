import java.util.*;

public class PatternExample {
    // starting point of the java program
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);  
        System.out.print("Enter the size of pattern: ");
        int size = sc.nextInt();   //taking input from user 
        // Pattern1(size);
        // Pattern2(size);
        // Pattern3(size);
        Pattern4(size);
        Pattern5(size);


        sc.close();    // closing the Scanner class results in protection of data
    }
    // 1. TO PRINT PATTERN AS LIKE SQUARE
    //      * * * * *
    //      * * * * *
    //      * * * * *
    //      * * * * *
    //      * * * * *

    static void Pattern1(int n){
        for(int i = 0; i < n; i++){
            for(int j  = 0; j < n; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    // 2. TO PRINT PATTERN AS LIKE RIGHT-ANGLED-TRIANGLE (USING STARS)
    //       * 
    //       * * 
    //       * * * 
    //       * * * * 
    //       * * * * *

    static void Pattern2(int n){
        for (int i = 0; i < n; i++){
            for(int j = 0; j <= i; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    // 3. TO PRINT PATTERN AS LIKE RIGHT-ANGLED-TRIANGLE (USING DIGIT OR NUMBERS)
        //      1 
        //      1 2
        //      1 2 3
        //      1 2 3 4
        //      1 2 3 4 5

    static void Pattern3(int n){
        for (int i = 1; i <= n; i++){
            for(int j = 1; j <= i; j++){
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }


    // 4. TO PRINT PATTERN AS LIKE RIGHT-ANGLED-TRIANGLE (USING DIGIT OR NUMBERS)
        //      1 
        //      2 2
        //      3 3 3
        //      4 4 4 4 
        //      5 5 5 5 5

    static void Pattern4(int n){
        for (int i = 1; i <= n; i++){
            for(int j = 1; j <= i; j++){
                System.out.print(i + " ");
            }
            System.out.println();
        }
    }

    // 5. TO PRINT PATTERN AS LIKE REVERSE RIGHT-ANGLED-TRIANGLE (USING STARS)
        //      * * * * * 
        //      * * * * 
        //      * * * 
        //      * * 
        //      *
        static void Pattern5(int n){
            for(int i = 1; i <= n; i++){
                for(int j = 1; j <= n-i+1; j++){
                    System.out.print("* ");
                }
                System.out.println();
            }
        }

    
}
