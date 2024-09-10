class Animal:
    def __init__(self, especie, nome):
        self.especie = especie
        self.nome = nome
    
    def emitir_som(self):
        pass

class Cachorro(Animal):
    def emitir_som(self):
        return "Au Au"
    
class Gato(Animal):
    def emitir_som(self):
        return "Miau"
    
class Mamifero(Animal):
    def __init__(self, especie, nome):
        super().__init__(especie, nome)

    def amamentar(self):
        print(f"{self.nome} está amamentando")

class Ave(Animal):
    def __init__(self, especie, nome):
        super().__init__(especie, nome)

    def voar(self):
        print(f"{self.nome} está voando")

class Morcego(Mamifero, Ave):
    def __init__(self, especie, nome):
        super().__init__(especie, nome)

    def emitir_som(self):
        return "Eu sou o batman"
