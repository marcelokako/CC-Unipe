class Motor:
    def __init__(self, tipo, potencia):
        self.tipo = tipo
        self.potencia = potencia

    def ligar(self):
        print("O motor está ligado.")

    def desligar(self):
        print("O motor está desligado.")
        
class Pneu:
    def __init__(self, marca, tamanho):
        self.marca = marca
        self.tamanho = tamanho

    def inflar(self):
        print("O Pneu está inflado.")

    def desinflar(self):
        print("O Pneu está desinflado.")

class Carro:
    def __init__(self, marca, modelo):
        self.marca = marca
        self.modelo = modelo
        self.motor = Motor("Gasolina", 150)
        self.pneu = [Pneu("Pirelli", 18) for _ in range(4)]
 
    def ligar(self):
        self.motor.ligar()
        print("O carro está pronto para rodar.")

    def desligar(self):
        self.motor.desligar()
        print("O carro está desligado.")

    def trocar_pneu(self, indice, novo_pneu):
        pneu_removido = self.pneu[indice]
        self.pneu[indice] = novo_pneu
        print(f"Pneu {indice + 1} foi trocado")
        return pneu_removido
    
carro = Carro("Toyota", "Corolla")
carro.ligar()
novo_pneu = Pneu("Michelin", 17)
pneu_removido = carro.trocar_pneu(2, novo_pneu)
print("Pneu removido: ", pneu_removido.marca)
carro.desligar()
