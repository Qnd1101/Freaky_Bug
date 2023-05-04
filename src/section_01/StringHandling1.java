package section_01;

public class StringHandling1 {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Hello JeaDis");

        System.out.println(sb.append("null"));
        System.out.println(sb.replace(0, 5, "Goodby"));
        System.out.println(sb.delete(0, 5));
        System.out.println(sb.reverse());
    }
}
