class Retangulo:

    def __init__(self, comprimento, largura):
        self.comprimento = comprimento
        self.largura = largura

    def calcular_area(self):
        return self.comprimento * self.largura
    
    def calcular_perimetro(self):
        return (2*self.comprimento)+(2*self.largura)

ret = Retangulo(200, 300)
print("Area: ", ret.calcular_area())
print("Perímetro: ", ret.calcular_perimetro())
