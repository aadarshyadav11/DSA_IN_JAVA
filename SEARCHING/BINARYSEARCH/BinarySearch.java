import java.util.*;

// binary search program.
// It is more optimized searching than linear search.
public class BinarySearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
    
        System.out.print("Enter size of array: ");
        int n = sc.nextInt();   // taking size of array
        int [] arr = new int [n];
        System.out.print("Enter elements separated with space: ");
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();   // taking elements of arrays
        }
        System.out.print("Enter search key: ");
        int key = sc.nextInt();     // taking element to search in the array

        int ele = binarySearch(arr, n , key);   // calling function binarySearch()
        if(arr[ele] == key){
            System.out.print("Element present at index: "+ ele);
        } 
        else{
            System.out.print("Element is not found in the given array: "+ ele);
        }
        

        sc.close();
    }

    static int binarySearch(int[] A,int n, int key){ 
        
        int l = 0, h = n-1, mid;
        while (l <= h){
            mid = (l + h) / 2;
            if(key == A[mid]){
                return mid;
            }
            if(key < A[mid]){
                h = mid - 1;
            }
            else{
                l = mid + 1;
            }
        }
        return -1;
    }
   
}