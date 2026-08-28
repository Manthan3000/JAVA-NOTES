import java.util.*;

public class firstclass {
    public static void main(String[] args) {
        Scanner side = new Scanner(System.in);
        System.out.print("Enter One Side Of Square:");
        int a = side.nextInt();
        int Area = (a * a);
        System.out.print("Area of Square is :");
        System.out.println(Area);
    }
}