public class Power {
    public static void main(String[] args) {
        System.out.println(power(2,5));
    }

    private static int power(int base, int exponent) {
        if(exponent<1) return 1;//base case
        return base * power(base, exponent - 1);//recursive case
    }
}
