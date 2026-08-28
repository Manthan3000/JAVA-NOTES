// class firstclass {
// public static void main(String[] args) {
// // Output print ln is use to print next line
// System.out.println("Hello World"); // Hello World
// System.out.println("Hello World"); // Hello World
// }
// }

// // PRINT PATTERN

// class firstclass {
// public static void main(String[] args) {
// // Output print ln is use to print next line
// System.out.println("*");
// System.out.println("**");
// System.out.println("***");
// System.out.println("****");
// }
// }

// // VARIABLES IN JAVA

// public class firstclass {
// public static void main(String[] args) {
// // Variables is Java
// int a = 25;
// int b = 25;
// int sum = a + b;
// int sub = a - b;
// int mul = a * b;
// int div = a / b;
// System.out.println(sum); // 50
// System.out.println(sub); // 0
// System.out.println(mul); // 625
// System.out.println(div); // 1

// }
// }

// INPUT FROM USER

// import java.util.*;

// public class firstclass {
// public static void main(String[] args) {
// Scanner sc = new Scanner(System.in);
// // String name = sc.next();// next() print single world
// String name = sc.nextLine();// next() print multiple words
// // nextInt()
// // nextFloat()
// System.out.println(name);
// }
// }

// Q. Take 2 input from user and print Sum of them

// import java.util.Scanner;

// public class firstclass {

// public static void main(String[] args) {
// Scanner sc = new Scanner(System.in);
// System.out.print("Enter number 1:");
// int a = sc.nextInt();
// System.out.print("Enter Number 2:");
// int b = sc.nextInt();
// int add = a + b;
// System.out.print("sum of two numbers :");
// System.out.println(add);
// }
// }

// // Q . Find Area of Square
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