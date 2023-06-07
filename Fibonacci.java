import java.util.*;
import java.io.*;

public class Fibonacci {
    static int numero;
    static String resultado;
    static String fin = "";
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese el numero de Fibonacci que desee: ");
        numero = Integer.parseInt(sc.nextLine());
        sc.close();
        if (numero >= 2) {
            int menos1 = numero - 1;
            int menos2 = numero - 2;
            String secuencia = "F" + Integer.toString(numero) + " = " + "F" + Integer.toString(menos1) + " + F" + Integer.toString(menos2);
            System.out.println(secuencia);
            System.out.println("F" + Integer.toString(numero) + " = " + Recursion1(numero));
            System.out.println("F" + Integer.toString(numero) + " = " + Result(numero));
        } else {
            System.out.println("ERROR!!!\nIngrese un numero mayor o igual a 2");
        }
    }

    static String Recursion1(int c) {
        String tem = "";
        if (c < 2) {
            tem = Integer.toString(c);
            return tem;
        }
        tem = Recursion1(c-1) + " + " + Recursion2(c-2);
        return tem;
        /*resultado = "";
        if (c == 1) {
            return Integer.toString(c);
        } else if (c == 0) {
            return Integer.toString(c);
        } else {
            String temp = "F" + Integer.toString(c-1) + " + F" + Integer.toString(c-2);
            //System.out.println("Iteracion2 : " + temp);
            Recursion1(c-1);
            return temp;
        }*/
    }

    static String Recursion2(int x) {
        String tem = "";
        if (x < 2) {
            tem = Integer.toString(x);
            return tem;
        }
        tem = Recursion1(x-1) + " + " + Recursion2(x-2);
        return tem;
        /*resultado = "";
        if (x == 1) {
            return Integer.toString(x);
        } else if (x == 0) {
            return Integer.toString(x);
        } else {
            String temp = "F" + Integer.toString(x-1) + " + F" + Integer.toString(x-2);
            //System.out.println("Iteracion2 : " + temp);
            Recursion2(x-1);
            return temp;
        }*/
    }

    /*static String ResuString(String F) {
        fin = "F" + Integer.toString(numero) + " = " + F;
        return fin;
    }*/
    
    static int Result(int f) {
        if (f < 2) {
            return f;
        }
        return Result(f-1) + Result(f-2);
    }
}