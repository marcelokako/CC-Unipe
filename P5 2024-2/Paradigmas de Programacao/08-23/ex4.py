# Coleta dados do usuário: Recebe uma lista de nomes, idades e telefone
# armazena dados em um dicionario: usa um dicionario para associar
# cada nome à sua idade
# Salvar os dados em um arquivo.txt 
# Henrique Rios e Marcelo Camilo

from funcao import coletar_dados, salvar_dados

def main():
    
   dados = coletar_dados()
   salvar_dados(dados, "biblioteca", ".txt")
   salvar_dados(dados, "biblioteca", ".json")
   salvar_dados(dados, "biblioteca", ".csv")

if __name__ == "__main__":
    main()