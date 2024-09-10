from Animal import *  
from Pessoa import *  

class Main():
    # Testes da classe Animal
    gato = Gato("Gato", "tom")
    cachorro = Cachorro("Cachorro", "Snoop")
    morcego = Morcego("Morcego", "Batman")

    print(gato.emitir_som())
    print(cachorro.emitir_som())
    morcego.amamentar()
    morcego.voar()

    
    # Testes da classe Pessoa, Empresa, Endereco
    pessoa1 = Pessoa("Marcelo", 27)
    pessoa1.mostrar_informacoes()
    endereco = Endereco("Av. RuaIrada", "João Pessoa", "Paraíba", "12345-78")
    pessoa1.adicionar_endereco(endereco)
    pessoa1.mostrar_informacoes()

    pessoa2 = Pessoa("Joana", 30)
    endereco2 = Endereco("Av. RuaIrada2", "Recife", "Pernambuco", "54321-00")
    pessoa2.adicionar_endereco(endereco2)

    empresa = Empresa("Banon Banoff", "12332121000106")
    empresa.contratar_funcionario(pessoa1)  
    empresa.listar_funcionarios()
    empresa.contratar_funcionario(pessoa2)  
    empresa.listar_funcionarios()
