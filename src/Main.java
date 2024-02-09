import java.util.Scanner;
abstract class CheckLength{
    abstract int length();
}
class line1 extends CheckLength{
    public int length(){
        System.out.println("Welcome to line comparison computation program ");

        Scanner sc =new Scanner(System.in);
        System.out.println("enter the X1-coordinates of first line : ");
        int x1 = sc.nextInt();
        System.out.println("enter the Y1-coordinate of first line : ");
        int y1 = sc.nextInt();
        System.out.println("enter the X2-coordinate of first line : ");
        int x2 = sc.nextInt();
        System.out.println("enter the Y2-coordinate of first line : ");
        int y2 = sc.nextInt();

        int length1 = (int) Math.sqrt(Math.pow((x2-x1),2) + Math.pow((y2-y1),2));
        System.out.println("length of line is "+length1);
       return length1;
    }
}
class line2 extends CheckLength{
    int length() {

        Scanner sc =new Scanner(System.in);
        System.out.println("enter the X1-coordinates of second line : ");
        int x1 = sc.nextInt();
        System.out.println("enter the Y1-coordinate of second line : ");
        int y1 = sc.nextInt();
        System.out.println("enter the X2-coordinate of second line : ");
        int x2 = sc.nextInt();
        System.out.println("enter the Y2-coordinate of second line : ");
        int y2 = sc.nextInt();

        int length2 = (int) Math.sqrt(Math.pow((x2-x1),2) + Math.pow((y2-y1),2));
        System.out.println("Length of line is "+length2);
        return length2;
    }
}

public class Main {
    public static void main(String[] args) {
        line1 sc = new line1();
       int l1= sc.length();
        line2 sc1 = new line2();
        int l2 = sc1.length();
        if(l1==l2){
            System.out.println("two line are equal in length");
        }
        else if(l1>l2) {
            System.out.println("length of first line is greater than second i.e "+l1);
        }
        else{
            System.out.println("length of second line is greater than first i.e "+l2);
        }

    }
}