public class Colas {

    private int NumCliente, Saldo;
    private String Nombre;

    public Colas(int numCliente, int saldo, String nombre) {
        NumCliente = numCliente;
        Saldo = saldo;
        Nombre = nombre;
    }

    public int getNumCliente() {
        return NumCliente;
    }

    public void setNumCliente(int numCliente) {
        NumCliente = numCliente;
    }

    public int getSaldo() {
        return Saldo;
    }

    public void setSaldo(int saldo) {
        Saldo = saldo;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String nombre) {
        Nombre = nombre;
    }
}
