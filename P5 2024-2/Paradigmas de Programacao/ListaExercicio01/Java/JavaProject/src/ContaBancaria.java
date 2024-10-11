public class ContaBancaria {
    private int saldo = 0;
    private String titular;

    public ContaBancaria(String titular) {
        this.titular = titular;
    }

    public int getSaldo() {
        return saldo;
    }

    public int depositar(int valor) {
        saldo += valor;
        return saldo;
    }

    public int sacar(int valor) throws SaldoInsuficienteException {
        if (valor > saldo) {
            throw new SaldoInsuficienteException("Saldo insuficiente para o saque de R$ " + valor);
        }
        saldo -= valor;
        return saldo;
    }
}

