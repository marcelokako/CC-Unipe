class Motor:
    def __init__(self, tipo, potencia):
        self.tipo = tipo
        self.potencia = potencia
        self.ligado = False

    def ligar(self):
        self.ligado = True
        print("O motor está ligado.")

    def desligar(self):
        self.ligado = False
        print("O motor está desligado.")
        
class Pneu:
    def __init__(self, marca, tamanho):
        self.marca = marca
        self.tamanho = tamanho
        self.inflado = False

    def inflar(self):
        self.inflado = True
        print("O Pneu está inflado.")

    def desinflar(self):
        self.inflado = False
        print("O Pneu está desinflado.")

class Carro:
    def __init__(self, Motor, Pneus, ano, marca, modelo):
        self.Motor = Motor
        self.Pneus = Pneus
        self.ano = ano
        self.marca = marca
        self.modelo = modelo
        self.ligado = False
        self.velocidade = 0
 
    def ligar(self):
        self.Motor.ligar()
        self.ligado = True
        print("O carro está pronto para rodar.")

    def desligar(self):
        self.Motor.desligar()
        self.ligado = False
        print("O carro está desligado.")

    def trocar_pneu(self, indice, novo_pneu):
        pneu_removido = self.pneu[indice]
        self.pneu[indice] = novo_pneu
        print(f"Pneu {indice + 1} foi trocado")
        return pneu_removido
    
    def exibirDetalhes(self):
        print(f"""\tExibindo detalhes do carro 
              \tMotor [Tipo: {self.Motor.tipo}; Potencia: {self.Motor.potencia}]
              \tPneus [Marca: {self.Pneus[0].marca}; Tamanho: {self.Pneus[0].tamanho}]
              \tCarro [Marca: {self.marca}; Modelo: {self.modelo}; Ano: {self.ano}]
        """)

    def acelerar(self, vel):
        if (self.ligado):
            print("Acelerando carro")
            self.velocidade += vel
            print(f"O Carro está a {self.velocidade} km/h")
        else:
            print("O Carro está desligado")

    def frear(self, vel):
        if (self.ligado):
            print("Freando carro")
            self.velocidade -= vel
            if self.velocidade <= 0:
                self.velocidade = 0
            print(f"O Carro está a {self.velocidade} km/h")
        else:
            print("O Carro está desligado")
