class Triangulo:

    def __init__(self, lado1, lado2, lado3):
        self.lado1 = lado1
        self.lado2 = lado2
        self.lado3 = lado3
    
    def calcular_perimetro(self):
        return self.lado1 + self.lado2 + self.lado3

    def tipo(self):
            if self.lado1 == self.lado2 == self.lado3:
                return "Equilátero"
            elif self.lado1 == self.lado2 or self.lado1 == self.lado3 or self.lado2 == self.lado3:
                return "Isósceles"
            else:
                return "Escaleno"

tri = Triangulo(100, 200, 300)
print("Tipo: ", tri.tipo())
print("Perímetro: ", tri.calcular_perimetro())
tri = Triangulo(100, 200, 200)
print("Tipo: ", tri.tipo())
print("Perímetro: ", tri.calcular_perimetro())
tri = Triangulo(200, 200, 200)
print("Tipo: ", tri.tipo())
print("Perímetro: ", tri.calcular_perimetro())
