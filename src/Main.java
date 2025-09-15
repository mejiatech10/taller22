import java.sql.SQLOutput;
import java.util.Scanner;
import java.util.ArrayList;




public class Main {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        ArrayList<cuenbancaria> listCuentas = new ArrayList<>();


        int opc;
        do {
            System.out.println("MENU PRINCIPAL");
            System.out.println("1 crear cuenta ");
            System.out.println("2 listar cuentas");
            System.out.println("3 salir");
            System.out.println("escoja una opcion");
            opc = teclado.nextInt();

            switch (opc) {

                case 1:
                    cuenbancaria est1 = new cuenbancaria();

                    System.out.println("CUAL ES SU NUMERO DE CUENTA ");
                    String numecuenta = teclado.next();
                    est1.setNumecuenta(numecuenta);

                    System.out.println("CUAL ES SU DNI");
                    String dni = teclado.next();
                    est1.setDni(dni);

                    System.out.println("saldo");
                    double saldo = teclado.next();
                    est1.setSaldo(saldo);

                    listCuentas.add(est1)
                    System.out.println("cuenta creada con exito");
                    break;

                case 2:
                    if (listCuentas.isEmpty()) {
                        System.out.println("no hay cuenta creada ");
                    } else {
                        for (int i = 0; i < listCuentas.size(); i++) {
                            System.out.println((i + 1) + listCuentas.get(i).toString());
                        }
                    }
                    break;
                case 3:
                    System.out.println("cual es el numero de cuenta ");
                    double ingreso = teclado.nextDouble();
                    listCuentas.get(0).ingresar(ingreso)
                    break;
                case 4
                    ;
                    System.out.println("cual es el valor a retirar");
                    double retirar = teclado.nextDouble();
                    listCuentas.get(0).retirar(retirar);
                    break;

                case 5:
                    System.out.println("saliendo ");
                    break;

                default:
                    System.out.println("invalidado");
                }
            } while (opcion != 5);

            teclado.close();

        }

    }