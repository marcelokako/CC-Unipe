# Exercício de nivelamento da turma - Calcular distância entre dois pontos
import math
from rich.console import Console
from rich.table import Table

print("Olá, vamos calcular a distância entre dois pontos!")
x1 = int(input("\nDigite a coordenada x do primeiro ponto: "))
y1 = int(input("\nDigite a coordenada y do primeiro ponto: "))
x2 = int(input("\nDigite a coordenada x do segundo ponto: "))
y2 = int(input("\nDigite a coordenada y do segundo ponto: "))

dist = math.sqrt((x2-x1)**2+(y2-y1)**2)

console = Console()

table = Table(title="Distância entre dois pontos")
table.add_column("Coordenadas", justify="center", style="cyan", no_wrap=True)
table.add_column("Distância", justify="center", style="magenta", no_wrap=True)

table.add_row(f"Ponto 1: ({x1}, {y1}) \nPonto 2: ({x2}, {y2})"
              , f"Distância: √(({x2} - {x1})² + ({y2} - {y1})²) = {dist:.2f}")

console.print(table)