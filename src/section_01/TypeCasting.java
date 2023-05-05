package section_01;

public class TypeCasting {
    public static void main(String[] args) {
        int intValue = 42;
        double doubleValue = intValue;

        double doubleValue1 = 42.5;
        // int intValue1 = doubleValue1;
        // int가 double보다 byte가 작기 때문에 불가능 하다.
        // 명시적으로 변환하면 가능함.
        int intValue1 = (int) doubleValue1;

        System.out.println(intValue);
        System.out.println(doubleValue);
        System.out.println(intValue1);
        System.out.println(intValue);
    }
}
