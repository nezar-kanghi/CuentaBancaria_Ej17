public class MainExcepcionCuentaBancaria {

    public static void main(String[] args) {

        CuentaBancaria cuenta = new CuentaBancaria(100); // saldo inicial

        try {
            cuenta.retirar(30);   // OK
            cuenta.retirar(90);   // ERROR → lanza excepción
        }
        catch (SaldoInsuficienteException e) {
            System.out.println("ERROR: " + e.getMessage());
        }
    }
}
