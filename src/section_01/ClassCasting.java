package section_01;

public class ClassCasting {
    public static void main(String[] args) {
        class Parent{

        }
        class Child extends Parent{
    
        }

        Parent parent = new Parent(); // 업케스팅 : 자식클래스 객체를 부모클래스로 변환하는 것이다.
        Child child = (Child) parent; // 다운케스팅 : 부모클래스 객체를 자식클래스로 변환하는 것이다.
    }    
}
