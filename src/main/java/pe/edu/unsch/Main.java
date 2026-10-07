package pe.edu.unsch;

public class Main {
    public static void main(String[] args) {
        CuentaBancaria cuenta = new CuentaBancaria(100);
        cuenta.depositar(50);
        System.out.println("SISTEMA FINANCIERO");
        System.out.println("Saldo actual: " + cuenta.obtenerSaldo());
    }
}