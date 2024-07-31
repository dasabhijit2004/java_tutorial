import java.util.Scanner;

class deleteFromArray {

    deleteFromArray(int[] arr, int key){
        int pos = -1;
        for(int i = 0; i<arr.length; i++){
            if(arr[i] == key){
                pos = i;
            }
        }
        if(pos == -1){
            System.out.println("Element not found");
        }
        else{
            for(int i = pos; i < arr.length-1; i++){
                arr[i] = arr[i+1];
            }
            System.out.println("Element deleted");
            for(int i = 0; i<arr.length-1; i++){
                System.out.print(arr[i]+" ");
            }
        }
        
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the no of elements: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter array elements: ");
        for(int i = 0; i<arr.length; i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter the element to be deleted: ");
        int key = sc.nextInt();
        deleteFromArray d = new deleteFromArray(arr, key);
    }
}
