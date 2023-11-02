import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//      First Homework
        Triangle triangle = new Triangle();
        Scanner scanner = new Scanner(System.in);
        triangle.a = scanner.nextInt();
        triangle.b = scanner.nextInt();
        triangle.c = scanner.nextInt();

        triangle.area();
//      Second Homework
        MyClass myClass = new MyClass("Sagyn", "Topchuev", (byte) 1, new String[]{"Javascript-9, Java-12, Javascript-24"}, "Ashlyanfu");
        myClass.getInfoAboutStudent();
    }
}