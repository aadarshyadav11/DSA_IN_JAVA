
public class MinElement {
    public static void main(String[] args) {
        int[] arr = {10,20,5,15,25,4,1};

        int min = arr[0];
        for(int i = 1; i < arr.length; i++){
            if(min > arr[i]){
                min = arr[i];
            }
        }
        System.out.println("Min Element: " + min);
    }    
}
