import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Welcome to line comparison computation program ");

        Scanner sc =new Scanner(System.in);
        System.out.println("enter the X-coordinates of first line : ");
        int x1 = sc.nextInt();
        System.out.println("enter the Y-coordinate of first line : ");
        int y1 = sc.nextInt();
        System.out.println("enter the X-coordinate of second line : ");
        int x2 = sc.nextInt();
        System.out.println("enter the Y-coordinate of second line : ");
        int y2 = sc.nextInt();

        int length = (int) Math.sqrt(Math.pow((x2-x1),2) + Math.pow((y2-y1),2));
        System.out.println("Length of line is "+length);
    }
}