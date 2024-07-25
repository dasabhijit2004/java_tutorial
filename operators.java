public class operators {

    public static void main(String[] args) {
        int a = 5, b = 6;
        
        //arithmetic operators
        System.out.println(a+b);
        System.out.println(a-b);
        System.out.println(a*b);
        System.out.println(a/b);
        System.out.println(a%b);

        //assignment operators
        a = 8; //"=" is the assignment operator

        //relational operator
        System.out.println(a == b);
        System.out.println(a > b);
        System.out.println(a < b);
        System.out.println(a <= b);
        System.out.println(a >= b);

        //logical operators
        System.out.println(a > 6 && a < 10);
        System.out.println(a > 6 || a < 7);
    }
}