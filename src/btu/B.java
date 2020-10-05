package btu;
import java.util.Scanner;

public class B extends A{
    int y;

    public B(){
    }

    public void m1(){
        Scanner input = new Scanner(System.in);
        System.out.print("y: = ");
        y = input.nextInt();
    }

    public void m2(){
        System.out.println(x+y);;
    }

}