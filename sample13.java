import java.util.*;

class sample13 {
    public static void main(String[] args) {

   
        int[] arr = {10, 20, 30, 40, 50};

        System.out.println("Original Array:");
        printArray(arr);

        int newElement = 60;
        int[] newArr = new int[arr.length + 1];

        for (int i = 0; i < arr.length; i++) {
            newArr[i] = arr[i];
        }
        newArr[arr.length] = newElement;

        arr = newArr; 
        System.out.println("\nAfter Adding Element:");
        printArray(arr);

      
        arr[2] = 99; 

        System.out.println("\nAfter Modification:");
        printArray(arr);

  
        System.out.println("\nTraversing using loop:");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

      
        int key = 40;
        boolean found = false;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == key) {
                System.out.println("\nElement " + key + " found at index " + i);
                found = true;
                break;
            }
        }

        if (!found) {
            System.out.println("\nElement not found");
        }

        
        Arrays.sort(arr);

        System.out.println("\nSorted Array:");
        printArray(arr);
    }

    static void printArray(int[] arr) {
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}