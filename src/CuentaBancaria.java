public class CuentaBancaria {
    // Atributos
    private String nombreCliente;
    private double saldo;


    // Constructor (si lo consideras necesario)
    public CuentaBancaria(String nombreCliente, double saldo){
        this.nombreCliente = nombreCliente;
        this.saldo = saldo;
    }



    // Métodos

    public String getNombreCliente(){
        return nombreCliente;
    }

    public double getSaldo(){
        return saldo;
    }

    public void depositar(double cantidad){
        saldo += cantidad;
        System.out.println("Depósito de " + cantidad + " realizado con éxito.");
    }

    public void retirar(double cantidad){
        saldo = saldo - cantidad;
        System.out.println("Retiro de " + cantidad + " realizado con éxito.");
    }

    public String toString(){
        return "Cuenta de " + nombreCliente + ", Saldo: " + saldo;
    }

}