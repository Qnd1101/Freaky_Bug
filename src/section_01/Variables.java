package section_01;

class Person{
    String firstName;
    String LastNmae;
}

public class Variables {
    
    public static void main(String[] args) {
        Person person = new Person(); // 인스턴스 생성
        person.firstName = "MinJun";
        person.LastNmae = "Kim"; 

        int age = 16; // 정수형 
        double height = 175.0; // 실수형
        String name = "MinJunKim"; // 문자열
        boolean isAlive = false; // 비교 연산자. (생존여부) 

        System.out.printf("age : %d\n", age);
        System.out.printf("height : %f\n", height);
        System.out.printf("name : %s\n", name);
        System.out.printf("isAlive : %b\n", isAlive);
        System.out.printf("firstName : %s\n", person.firstName);
        System.out.printf("firstName : %s\n", person.LastNmae);
    }
}
