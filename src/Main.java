import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int opcion=0,NumC,Saldo;
        String Nombre;
        Oper_Clientes OClientes=new Oper_Clientes();
        Oper_Colas OColas=new Oper_Colas();
        Oper_Pilas OPilas=new Oper_Pilas();

        do {
            System.out.println("1)\tApertura de Cuenta\n" +
                    "2)\tDepósito\n" +
                    "3)\tRetiro\n" +
                    "4)\tCambio de Cheque\n" +
                    "5)\tSaldo de una cuenta\n" +
                    "6)\tDatos de una Cuenta\n" +
                    "7)\tDatos de todas las cuentas.\n" +
                    "8)\tÚltimo cliente atendido\n" +
                    "9)\tClientes en la cola\n" +
                    "10)\tClientes que están en caja\n" +
                    "11)\tPasar cliente a una caja\n" +
                    "12)\tAtender a un cliente en una caja\n" +
                    "13)\tSalir\n");
                    opcion=sc.nextInt();

                    switch (opcion) {
                        case 1:
                                System.out.println("Apertura de cuenta");

                            System.out.println("Ingrese el numero de cuenta");
                            NumC=sc.nextInt();
                            int pos= OClientes.pos(NumC);
                            if (pos==-1) {
                                System.out.println("Ingrese el nombre del cliente");
                                Nombre = sc.next();

                                System.out.println("Ingrese el saldo de la cuenta");
                                Saldo = sc.nextInt();

                                OClientes.altaClientes(NumC, Nombre, Saldo);
                               OPilas.apilar(new Clientes(NumC,Nombre,Saldo));
                            }else {
                                System.out.println("Ya existe esa cuenta");
                                System.out.println("Introduzca el numero de cuenta");
                                NumC=sc.nextInt();
                                pos = OClientes.pos(NumC);
                                if (pos!=-1){
                                    System.out.println("Introduzca su nombre");
                                    Nombre=sc.next();
                                    System.out.println("Introduzca el importe del deposito");
                                    Saldo=sc.nextInt();
                                    OColas.altaCola(NumC,Nombre,Saldo);
                                }
                            }
                            break;
                        case 2:
                            System.out.println("Deposito");
                            break;
                        case 3:
                            System.out.println("Retiro");
                            break;
                        case 4:
                            System.out.println("Cambio de cheque");
                            break;
                        case 5:
                            System.out.println("Saldo de una cuenta");
                            break;
                        case 6:
                            System.out.println("Datos de una cuenta");
                            break;
                        case 7:
                            System.out.println("Datos de todas las cuenta");
                            break;
                        case 8:
                            System.out.println("Ultimo cliente atendido");
                            break;
                        case 9:
                            System.out.println("Cliente de una cola");
                            break;
                        case 10:
                            System.out.println("Clientes que estan en caja");
                            break;
                        case 11:
                            System.out.println("Pasar cliente a una caja ");
                            break;
                        case 12:
                            System.out.println("Atender un cliente en la caja");
                            break;
                        case 13:
                            System.out.println("Salir");
                            System.out.println("Gracias por usa el programa");
                            break;
                    }

        }while (opcion!=13);

    }
}