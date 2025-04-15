import java.util.Scanner;
import java.util.*;

public class Main{
    public static void main(String[] args){
        //자바에서의 map: 자바스크립트에서의 객체와 비슷
        // value값에 해당하는 자료형이 다양하게 들어올때는 Object로 타입 지정
        // Generic: 파라미터에 어떤 자료형의 인자값이 전달되야 되는지 호출 시점에 지정하는 것
        Map<String, Object> student1 = new HashMap<>();
        student1.put("name", "David");
        student1.put("age", 20);
        student1.put("isFemal", false);
        student1.put("age", 21);
        student1.remove("isfemal"); // student1.remove("isfemal");

        System.out.println(student1);
        System.out.println(student1.get("name"));
    }
}

//public class Main{
//    public static void main(String[] args){
//        //ArrayList란 클래스로 List생성시 반환 받는 자료형이 무조건 문자열 형식으로 지정
//        List<String> names = new ArrayList<>();
//        names.add("David");
//        names.add("Emily");
//        System.out.println(names);
//        /*
//         자바에서 Array와 List의 차이
//         Array: 고정형, 값 추가 불가
//         List: 가변형, 값 추가 가능
//        */
//    }
//}

//public class Main{
//    public static void main(String[] args){
//        String[] colors = {"red", "green", "blue"};
//        System.out.println(colors[0]);
//        System.out.println(colors.length);
//    }
//}

//public class Main {
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//
//        System.out.println("점수를 입력하세요:");
//        int score = scanner.nextInt();
//
//        if(score >= 80){
//            System.out.print("A");
//        }else if(score >= 70){
//            System.out.print("B");
//        }else{
//            System.out.print("C");
//        }
//        System.out.print(" 점수를 받았습니다.");
//    }
//}

//public class Main {
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//
//        System.out.print("이름을 입력하세요:");
//        String name = scanner.nextLine();
//
//        System.out.print("나이를 입력하세요:");
//        int age = scanner.nextInt();
//
//        System.out.println("안녕하세요." + name + "님!");
//        System.out.println("당신의 나이는 "+ age + "살 입니다.");
//
//    }
//}
//public class Main {
//    public static void main(String[] args) {
//        //터머닐에서 사용가능한 입력도구를 생성하는 클래스
//        //해당 클래스는 관련 기능 메서드들을 품고 있는 인스턴스 객체를 반환
//        Scanner scanner = new Scanner(System.in);
//
//        //문자 값을 입력받을 수 있는 메서드 호출
//        String name = scanner.nextLine(); //문자값 입력받게 하는 메서드 호출
//        int age = scanner.nextInt(); // 정수를 입력받는 메서드
//        double height = scanner.nextDouble(); // 키를 입력받는 메서드
//
//        System.out.println("내 이름은" + name + "이고 나이는 " + age + "살이며 키는 " + height + "cm입니다.");
//    }
//}