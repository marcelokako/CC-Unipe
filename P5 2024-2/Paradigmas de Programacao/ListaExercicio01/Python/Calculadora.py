class Calculadora:
    def __init__(self):
        pass
    
    def soma(self, n1, n2, n3 = 0):
        return n1+n2+n3
    
    @staticmethod
    def fatorial(n):
        if n == 0 or n == 1:
            return 1
        else:
            return n * Calculadora.fatorial(n - 1)
    
class Produto:
    def __init__(self, nome, preco):
        self.nome = nome
        self.preco = preco

    def __add__(self, produto2):
        return self.preco + produto2.preco