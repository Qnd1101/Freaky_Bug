package section_01;

import java.util.Arrays;

public class Array {
    public static void main(String[] args) {
        int[] intArray = new int[5];
        String[] strArray = new String[5];
        char[] charArray = new char[5];
        boolean[] boolArray = new boolean[5];
        
        System.out.println(intArray); 
        System.out.println(intArray); 
        System.out.println(charArray);
        System.err.println(boolArray);
        // 저장된 주소값 

        System.out.println(Arrays.toString(intArray));
        System.out.println(Arrays.toString(strArray));
        System.out.println(Arrays.toString(charArray));
        System.out.println(Arrays.toString(boolArray));
        // 배열에 들어있는 값을 알 수 있다.

        int[] intArray1 = {1, 2, 3, 4, 5};
        String[] strArray1 = {"Apple", "Banna", "Cherry"};
        System.out.println(Arrays.toString(intArray1));
        System.out.println(Arrays.toString(strArray1));


        
    }
}
