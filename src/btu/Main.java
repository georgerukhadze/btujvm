package btu;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public Main() {
    }

    public static void main(String[] args) {
        // write your code here

        C c = new C();
        c.m1();
        c.m2();
        c.m3();
        c.m4();
        c.m5();


        A a = new A();
        a.M2();
        a.M3();
        a.M4();


        B b = new B();
        b.m1();
        b.M2();
        b.m2();


        davaleba3();

    }

    public static void davaleba3() {
        Scanner input = new Scanner(System.in);
        System.out.print("a: = ");
        int a = input.nextInt();
        System.out.print("b: = ");
        int b = input.nextInt();


        if (a > b) {
            a += b;
            b = a - b;
            a -= b;
        }



        int kenti = 0;
        int kentjami = 0;
        int luwi = 0;
        int luwjami = 0;
        int y;

        Random random = new Random();

        for(y = 0; y < 40; ++y) {
            int x = random.nextInt(b - a + 1) + a;
//            System.out.println(x);
            if (x % 2 != 0) {
                ++kenti;
                kentjami += x;
            } else {
                ++luwi;
                luwjami += x;
            }
        }


        System.out.println("luwebis raodenoba: = " + luwi+ "\n" + "luwi ricxebis jami: = "+luwjami);
        System.out.println("kentebis raodenoba: = " + kenti+ "\n" + "kenti ricxebis jami: =" + kentjami);
        }
 }






