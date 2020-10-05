package btu;
import java.util.Scanner;

public class A {
    int x;

    public A() {
        System.out.println("Hello");
    }

    public void M2(){
        Scanner input = new Scanner(System.in);
        System.out.println("x: = ");
        x = input.nextInt();

    }
    public void M3(){
        System.out.println(x+12);
    }

    public void M4(){
        if (x % 2 == 0) {
            System.out.println("Luwia");
        } else {
            System.out.println("Kentia");
        }

    }
}