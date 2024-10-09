class Professor:
    def __init__(self, nome):
        self.nome = nome
        self.Escolas = []

    def listaEscolas(self):
        print("Listando escolas do professor", self.nome)
        for e in self.Escolas:
                print(e.nome)

class Escola:
    def __init__(self, nome):
        self.nome = nome
        self.Professores = []

    def contrataProfessor(self, professor):
        self.Professores.append(professor)
        professor.Escolas.append(self)

    def listaProfessores(self):
        print("Listando Professores da escola", self.nome)
        for p in self.Professores:
            print(p.nome)