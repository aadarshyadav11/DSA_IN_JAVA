public class ForLoop {
    public static void main(String[] args) {
        // 1. basic for loop
            // for(int i = 1; i <= 5; i++){
            //     System.out.print(i + " ");
            // }
           
        // 2. for Each loop
            // int[] numbers = {1,2,3,4,5};
            // for(int num : numbers){
            //     System.out.print(num + " ");
            // }
            
        // 3. for loop with multiple variables
            // for(int i = 0, j = 10; i < 5 && j > 0; i++, j--){
            //     System.out.println("i = " + i + ", j = " + j);
            // }

        // 4. infinite for loop
            // for(;;){
            //     // infinite loop
            // } 
            
        // 5. nested for loop    
            for(int i = 1; i <= 3; i++){
                for(int j = 1; j <= 3; j++){
                    System.out.print(i * j + " ");
                }
                System.out.println();
            }
    }
}
