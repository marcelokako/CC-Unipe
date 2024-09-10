# Henrique Rios e Marcelo Camilo
import random

def soma(x:(int), y:(int)):
    return x + y

def imprimir(resultado:(int)):
    print("A soma dos valores nas posições X e Y é {}." .format(resultado))
    return

def maior(vetor):
    maior = vetor[0]
    for i in range(len(vetor)):
        if(vetor[i] > maior):
            maior = vetor[i]
    return maior

def menor(vetor):
    menor = vetor[0]
    for i in range(len(vetor)):
        if(vetor[i] < menor):
            menor = vetor[i]
    return menor

def soma_elementos(vetor):
    soma_elementos = 0
    for i in vetor:
        soma_elementos += i
    return soma_elementos

def gerar_cartela():
    numeros = set()
    cartela = []

    for i in range(5):
        numero = random.randint(0, 99)

        while numero in numeros:
            numero = random.randint(0, 99)
        
        numeros.add(numero)
        cartela.append(numero)
    
    return cartela

def imprimir_cartela(cartela):
    print("| ",end="")
    for linha in cartela:
        print(linha, end=" | ")
    print()
    return

def coletar_dados():
    dados = []
    while True:
        nome = input("Digite o nome (ou 'sair' para encerrar): ")
        if nome.lower() == 'sair':
            break

        idade = input("Digite a idade")
        try:
            idade = int(idade)
        except ValueError:
            print("Idade deve ser um numero inteiro. Tente novamente")
            continue
        
        telefone = input("Digite o telefone")
        
        dados.append({
            "nome": nome,
            "idade": idade,
            "telefone": telefone
        })

    return dados

def salvar_dados(dados, nome_arquivo, extensao):
    nome_arquivo = nome_arquivo + extensao
    with open(nome_arquivo, 'w') as arquivo:
        for item in dados:
            linha = f"Nome: {item["nome"]}, Idade: {item["idade"]}, Telefone: {item["telefone"]}\n"
            arquivo.write(linha)