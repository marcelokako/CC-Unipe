# recebe vetor com 10 posições, em seguida deverá 
# imprimir o maior, menor e a soma de todos os elementos
# Henrique Rios e Marcelo Camilo

from funcao import maior, menor, soma_elementos

def ex2():
    vetor = []

    for i in range(10):
        vetor.append(int(input("Digite o elemento %d: " % i)))

    print("O maior valor é: ", maior(vetor))
    print("O menor valor é: ", menor(vetor))
    print("A soma dos elementos é: ", soma_elementos(vetor))

if __name__ == "__main__":
    ex2()