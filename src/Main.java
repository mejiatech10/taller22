import java.sql.SQLOutput;
import java.util.Scanner;


import
public class Main {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in)
        System.out.println("cual es el valor a agregar ");
        double ingreso = teclado.nextInt();
        System.out.println("cual es el valor a retirar");
        double retirar = teclado.nextInt();




        cuenbancaria est1 = new cuenbancaria();
        System.out.println("CUAL ES SU NUMERO DE CUENTA ");
        est1.setNumecuenta();
        System.out.println("CUAL ES SU DNI");
        est1.setDni();
        System.out.println("saldo");
        est1.setSaldo();


        System.out.println(est1.toString());

        }

    }