import java.util.Scanner;

public class insertInArray {

    static int[] insert(int[] arr, int key, int pos){
        int n = arr.length;

        int[] newArr = new int[n+1];

        for(int i = pos; i<n; i++){
            newArr[i+1] = arr[i];
        }

        newArr[pos] = key;

        for(int i = 0; i<pos; i++){
            newArr[i] = arr[i];
        }

        return newArr;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);    // for taking user input 

        System.out.println("Enter the number of elements : ");
        int n = sc.nextInt();

        int[] arr = new int[n];  // declaring the array

        //taking input
        for(int i = 0; i<n; i++){
            System.out.println("Enter element no "+i);
            arr[i] = sc.nextInt();
        }

        //printing the array
        System.out.println("The array is: ");
        for(int i = 0; i<n; i++){
            System.out.print(arr[i]+ " ");
        }

        System.out.println("Enter the element to be inserted: ");
        int key = sc.nextInt();
        System.out.println("Enter the position to be inserted: ");
        int pos = sc.nextInt();

        arr = insert(arr, key, pos);

        System.out.println("New array is: ");
        for(int i = 0; i<=n; i++){
            System.out.print(arr[i]+ " ");
        }
    }
}
