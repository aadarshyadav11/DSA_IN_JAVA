// find maximum element


public class MaxElement {
    public static void main (String[] args){
        int[] arr = {10,50,23,20,15};

        int max = arr[0];
        for(int i = 1; i < arr.length; i++){
            if(max < arr[i]){
                max = arr[i];
            }
        }
        System.out.println("Max Element : " + max);
    }
}


