//finding greatest among 3 numbers

public class conditionals {
    public static void main(String[] args) {
        int a = 10, b = 40, c = 30;

        if(a >= b && a >= c){
            System.out.println(a+" is the largest number");
        }

        else if(b >= c){
            System.out.println(b+" is the largest number");
        }

        else{
            System.out.println(c+" is the largest number");
        }
    }
}
