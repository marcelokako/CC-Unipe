class abstractCalcularSalario:
    def calcularSalario(self):
        pass

class Empregado:
    def __init__(self, nome, cargo, salario):
        self.nome = nome
        self.cargo = cargo
        self.salario = salario

    def exibeDetalhes(self):
        print(f"Nome: {self.nome}, Cargo: {self.cargo}, Salario: R$ {self.salario}")

    def calcularSalario(self):
        print(f"Salário de {self.nome}: R$ {self.salario}")
        return self.salario

class EmpregadoHorista:
    def __init__(self, nome, cargo, valor_hora, horas):
        self.nome = nome
        self.cargo = cargo
        self.valor_hora = valor_hora
        self.horas = horas

    def exibeDetalhes(self):
        print(f"Nome: {self.nome}, Cargo: {self.cargo}")

    def calcularSalario(self):
        salario = self.valor_hora * self.horas
        print(f"Salário de {self.nome}: R$ {salario}")
        return salario


class Empresa:
    def __init__(self, nome):
        self.nome = nome
        self.Empregados = []

    def contrataEmpregado(self, Empregado):
        self.Empregados.append(Empregado)

    def listaEmpregados(self):
        print("Listando Empregados da empresa", self.nome)
        for p in self.Empregados:
            p.exibeDetalhes()