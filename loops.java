public class loops {
    public static void main(String[] args) {
        int n = 10;

        // for loop
        for(int i = 1; i<=n; i++){
            System.out.print(i+" ");
        }

        //while loop
        int i = 1;
        while (i < n) {
            System.out.print(i+" ");
            i++;
        }

        // do-while loop
        do{
            System.out.print(i+" ");
        }while(i < n);

        //for-each loop
        
        int[] a = {1,2,3,4,5};
        for(int x : a){
            System.out.print(x+" ");
        }
    }
}
