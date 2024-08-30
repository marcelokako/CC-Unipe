#lê um vetor de 8 posições e, em seguida, lê dois valores de X e Y
#quaisquer correspondentes a duas posições no vetor.
#O programa então imprime a soma dos valores encontrados nas
#respectivas posições X e Y
# Henrique Rios e Marcelo Camilo

from funcao import *

def main():
    vetor = [0] * 8
    print("aaaaa")

    #ler os valores do vetor
    for i in range(8):
        vetor[i] = int(input("Digite o valor da posição {}: ".format(i)))

    #lê os valores X e Y
    x = int(input("Digite o valor de X: "))
    y = int(input("Digite o valor de Y: "))

    #Calcula a soma dos valores nas posições X e Y
    resultado = soma(vetor[x], vetor[y])
    
    # Imprime a soma
    imprimir(resultado)

    # Exibir a soma dos elementos do Vetor com suas características principais.
if __name__ == "__main__":
    main()
