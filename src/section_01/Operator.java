package section_01;

public class Operator {
    public static void main(String[] args) {
        int a = 5;
        int b = 4;

        System.out.println(a + b);
        System.out.println(a - b);
        System.out.println(a * b);
        System.out.println(a / b);
        System.out.println(a / b);
        System.out.println(a % b);
        
        System.out.println(a == b);
        System.out.println(a != b);
        System.out.println(a < b);
        System.out.println(a > b);
        System.out.println(a <= b);
        System.out.println(a >= b);

        System.out.println(a += b);
        System.out.println(a -= b);
        System.out.println(a *= b);
        System.out.println(a /= b);
        System.out.println(a %= b);
        System.out.println(a <<= b);
        System.out.println(a >>= b);
        System.out.println(a &= b);
        System.out.println(a ^= b);
        System.out.println(a |= b);

        System.out.println(a + b == 9 ? true : false);
        // 여기서 false인 이유는 a에 값을 대입하는 출력문으로 인해서 a값이 변함.
    }
}
