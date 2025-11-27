public class CuentaBancaria {

    private double saldo;

    public CuentaBancaria(double saldoInicial) {
        this.saldo = saldoInicial;
    }

    public void retirar(double cantidad) throws SaldoInsuficienteException {

        if (cantidad > saldo) {
            throw new SaldoInsuficienteException(
                    "No se puede retirar " + cantidad +
                            " €. Saldo disponible: " + saldo + " €."
            );
        }

        saldo -= cantidad;
        System.out.println("Retiro exitoso. Saldo actual: " + saldo + " €");
    }

    public double getSaldo() {
        return saldo;
    }
}
