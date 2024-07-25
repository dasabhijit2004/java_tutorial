public class literals {
    public static void main(String[] args) {

        int num = 65; //65 is the literal

        int num1 = 0b011; //'b' converts binary to decimal
        System.out.println(num1);

        int num2 = 0x7E; //'x' converts hexadecimal to decimal
        System.out.println(num2);

        int num3 = 1_00_00_00_000; //we can give '_' in java to get countability of '0's 
        System.out.println(num3);

        double num4 = 12e10; //makes implementation of larger numbers easy
        System.out.println(num4);

        char c = 'a';
        // c = c + 1; //this gives us error 
        c++; //this doesn't give us error
        System.out.println(c);
    }
}
