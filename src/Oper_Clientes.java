public class Oper_Clientes {
    Clientes arr[] = new Clientes[5];
    int contadorClientes=0;

    public void altaClientes(int nCuenta, String Nombre, int saldo){
    arr[contadorClientes++]= new Clientes(nCuenta,Nombre,saldo);
    }

    int pos(int m){
        int p=-1;
        for (int i = 0; i <contadorClientes; i++) {
            if (arr[i].getNumCuenta()==m){
                p=i;
            }
        }
        return p;
    }
}
