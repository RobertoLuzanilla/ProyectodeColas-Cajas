public class Oper_Colas {
    int t=5;
    int inicio=0;
    int fin=-1;
    Colas arr[]=new Colas[t];
    int ContadorColas=0;

    public void altaCola(int NumCuenta, String nombre, int deposito){
        if (fin==t-1){
            System.out.println("La cola esta llena");
            return;
        }
        Colas nuevCola = new Colas(NumCuenta,deposito,nombre);
        arr[++fin]=nuevCola;
        ContadorColas++;
    }



}
