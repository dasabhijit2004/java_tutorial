import java.util.Scanner;

public class arrays {
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
    }
}
