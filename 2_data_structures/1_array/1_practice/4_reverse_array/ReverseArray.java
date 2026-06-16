
public class ReverseArray {
    public static void main(String[] args) {

        // Approach 1 : Brute force
            // int[] arr = {10,20,30,40,50};
            // int n = arr.length;
            // int[] res = new int[n];

            // for(int i = 0; i < n; i++){
            //     res[i] = arr[n - i - 1];
            // }
            // for(int val : res){
            //     System.out.print(val + " ");
            // }

        // Approach 2: Optimal (Two pointer)
            // int[] arr = {10,20,30,40,50};
            // int left = 0, right = arr.length - 1;

            // while(left < right){
            //     int temp = arr[left];
            //     arr[left] = arr[right];
            //     arr[right] = temp;
            //     left++; 
            //     right--;
            // }

            // System.out.print("Reversed Array: ");
            // for(int val : arr){
            //     System.out.print(val + " ");
            // }

            // OR

            int[] arr = {10,20,30,40,50,60};
            int n = arr.length;
            for(int i = 0; i < n / 2; i++){
                int temp = arr[n - i - 1];
                arr[n - i - 1] = arr[i];
                arr[i] = temp; 
            }

            System.out.print("Reversed Array: ");
            for(int val : arr){
                System.out.print(val + " ");
            }

    }   
}
