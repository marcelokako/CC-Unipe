# Faça um programa em Python para gerar automaticamente numeros
# entre 0 e 99 de uma cartela de bingo. Sabendo que cada cartela devera
# conter 5 linhas e 5 numeros, gera estes dados de modo a nao ter numeros
# repetidos dentro das cartelas. O programa deve exibir na
# tela a cartela gerada.
# Henrique Rios e Marcelo Camilo

from funcao import gerar_cartela, imprimir_cartela

def main():
    
    print("Cartela de bingo: ")
    for i in range(5):
        cartela = gerar_cartela()
        imprimir_cartela(cartela)

if __name__ == "__main__":
    main()