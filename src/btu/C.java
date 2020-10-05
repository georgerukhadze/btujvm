package btu;
import java.util.Scanner;

public class C {
    int a,b,c;
    void m1(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("a: =");
        a = scanner.nextInt();
        System.out.print("b: =");
        b = scanner.nextInt();
        System.out.print("c: =");
        c = scanner.nextInt();


    }
    void m2(){
        System.out.println("a-s bolo cifri aris = "+a%10);

    }

    void m3(){
        while (b>9){
            b /= 10;
        }
        System.out.println("b-s pirveli cifri aris = " + b);
    }

    void m4(){
        int sum = 0;
        while (c >0){
            sum = sum + c % 10;
            c = c / 10;
        }
        System.out.println("c-s cifrebis jami = " + sum);


    }

    void m5(){

    }
}


