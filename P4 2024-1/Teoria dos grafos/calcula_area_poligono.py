# Exercício de nivelamento da turma - Calcular distância entre dois pontos
import math
from rich.console import Console
from rich.table import Table

print("Olá, escolha um polígono para calcular-mos seu perímetro e área")

console = Console()
table = Table(title="Calcular perímetro e área de polígonos")
table.add_column("Opção", justify="center", style="white", no_wrap=True)
table.add_column("Polígono", justify="center", style="red", no_wrap=True)
table.add_column("Perímetro", justify="center", style="cyan", no_wrap=True)
table.add_column("Área", justify="center", style="magenta", no_wrap=True)

table.add_row("1"
              ,f"Triângulo"
              ,f"a + b + c"
              ,f"(b.h) / 2")
table.add_row("2"
              ,f"Quadrado"
              ,f"4.L"
              ,f"L²")
table.add_row("3"
              ,f"Retângulo"
              ,f"2.a + 2.b"
              ,f"a.b")
table.add_row("4"
              ,f"Paralelogramo"
              ,f"2.a + 2.b"
              ,f"a.h")
table.add_row("5"
              ,f"Losango"
              ,f"4.L"
              ,f"(D.d) / 2")
table.add_row("6"
              ,f"Trapézio"
              ,f"a + b + c + d"
              ,f"(B.b).h / 2")
table.add_row("7"
              ,f"Circulo"
              ,f"2.π.r"
              ,f"π.r²")

while True:
    console.print(table)

    opcao = 0
    while (opcao < 1 or opcao > 7):
        opcao = int(input("Selecione a opção que deseja calcular: "))

    if opcao == 1:
        figura = 'Triângulo'
        a = float(input("Digite o lado a: "))
        b = float(input("Digite o lado b: "))
        c = float(input("Digite o lado c: "))
        h = float(input("Digite a altura h: "))
        perimetro = a+b+c
        area = b*h/2
    elif opcao == 2:
        figura = 'Quadrado'
        l = float(input("Digite o lado L: "))
        perimetro = 4*l
        area = l**2
    elif opcao == 3:
        figura = 'Retângulo'
        a = float(input("Digite o lado a: "))
        b = float(input("Digite o lado b: "))
        perimetro = 2*a + 2*b
        area = a*b
    elif opcao == 4:
        figura = 'Paralelogramo'
        a = float(input("Digite o lado a: "))
        b = float(input("Digite o lado b: "))
        h = float(input("Digite a altura h: "))
        perimetro = 2*a + 2*b
        area = a*h
    elif opcao == 5:
        figura = 'Losango'
        l = float(input("Digite o lado L: "))
        dmaior = float(input("Digite a diagonal maior D: "))
        dmenor = float(input("Digite a diagonal menor d: "))
        perimetro = 4*l
        area = dmaior*dmenor / 2
    elif opcao == 6:
        figura = 'Trapézio'
        a = float(input("Digite o lado a: "))
        b = float(input("Digite o lado b: "))
        c = float(input("Digite o lado c: "))
        dmaior = float(input("Digite a base maior B: "))
        h = float(input("Digite a altura h: "))
        perimetro = a+b+c+dmaior
        area = ((b+dmaior)*h)/2
    elif opcao == 7:
        figura = 'Círculo'
        r = float(input("Digite o raio r: "))
        perimetro = math.pi * r * 2
        area = math.pi * (r**2)

    print(f'Figura escolhida: {figura} | Perímetro: {perimetro} | Área: {area}')

    if input("Deseja continuar? Digite 0 para sair: ") == '0':
        break