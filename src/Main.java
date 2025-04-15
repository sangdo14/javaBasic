import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("이름을 입력하세요:");
        String name = scanner.nextLine();

        System.out.print("나이를 입력하세요:");
        int age = scanner.nextInt();

        System.out.println("안녕하세요." + name + "님!");
        System.out.println("당신의 나이는 "+ age + "살 입니다.");

    }
}
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