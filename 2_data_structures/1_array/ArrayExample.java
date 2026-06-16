// package 2_data_structures.1_array;

public class ArrayExample{
    public static void main(String[] args) {
        // primitive array
            // int[] arr = {1,2,3,4,5};
            // System.out.print("Primitive Array -> ");
            // for(int i = 0; i < arr.length; i++){
            //     System.out.print(arr[i] + " ");
            // }
            // System.out.println();
        

        // Non-primitive array
            // String[] names = {"Aadarsh Yadav", "Aman Yadav", "Ramesh Sharma", "Saurabh Verma"};
            // System.out.print("Non-Primitive Array -> ");
            // for(int i = 0; i < names.length; i++){
            //     System.out.print(names[i] + " ");
            // }

            // primitive types
            int[] arr = new int[5];        // by default value is 0 
            boolean[] check = new boolean[3];   // by default value is false

            // reference types / Obeject types
            String[] names = new String[7];    // by default value is null

            for(int i : arr)
                System.out.print(i + " ");

            for(boolean i : check)
                System.out.print(i + " ");

            for(String i : names)
                System.out.print(i + " ");

            


        

    }
}
