class Imprimivel:
    def imprimir(self):
        pass

class Relatorio(Imprimivel):
    def __init__(self, corpo):
        self.corpo = corpo

    def imprimir(self):
        print(f"Imprimindo Relatório: {self.corpo}")

class Contrato(Imprimivel):
    def __init__(self, corpo, contratante):
        self.corpo = corpo
        self.contratante = contratante

    def imprimir(self):
        print(f"Imprimindo Contrato de {self.contratante}: {self.corpo};")