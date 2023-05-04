package section_01;

public class SummingUsingFor {
    public static void main(String[] args) {
        int sum = 0;

        for (int i = 1; i<= 10; i++){
            sum += 1;
        }

        System.out.println(sum);
        /*
         * debug
         * sum = 0, i = 1
         * sum = 1, i = 2
         * sum = 2, i = 3
         * .
         * .
         * .
         * sum = 9, i = 10
         * 출력 : 10
         */
    }
}
