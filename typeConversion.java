public class typeConversion {
    public static void main(String[] args) {
        byte b = 122;
        int a = 129;

        b = (byte) a; // uses modulo operation [a % 128] and gives its equivalent byte number

        System.out.println(b);

        float f = 5.67f;
        int c = (int) f; //only gives the integer part

        System.out.println(c);

        //type promotion
        byte a1 = 30;
        byte a2 = 10;

        int res = a1 * a2; //java gives you to promote byte to int
        
        System.out.println(res);
    }
}
