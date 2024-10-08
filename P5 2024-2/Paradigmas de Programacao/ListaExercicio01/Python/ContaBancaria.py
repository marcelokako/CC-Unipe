class SaldoInsuficiente(Exception):
    def __init__(self, saldo, valor):
        super().__init__(f"ERROR: Saldo insuficiente!\nSaque de R$ {valor} falhou. Saldo disponível: R$ {saldo}")
        self.saldo = saldo
        self.valor = valor

class ContaBancaria:
    def __init__(self, titular, saldo):
        self.titular = titular
        self.saldo = saldo

    def depositar(self, valor):
        self.saldo += valor
        print(f"Deposito de R$ {valor} feito, Saldo disponível: R$ {self.saldo}")
    
    def sacar(self, valor):
        if (valor > self.saldo):
            raise SaldoInsuficiente(self.saldo, valor)
        else:
            self.saldo -= valor
            print(f"Saque de R$ {valor} feito, Saldo disponível: R$ {self.saldo}")

    def obter_saldo(self):
        print(f"Saldo disponível: R$ {self.saldo}")
        return self.saldo
            
