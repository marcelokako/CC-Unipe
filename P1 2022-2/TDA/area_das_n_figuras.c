#include <stdio.h>

int main() {

	float base, altura, raio, base2, lado;
	float pi = 3.14, area, perimetro = 0;
	int escolha;
	char figuras[6][10] = {"Triangulo", "Retangulo", "Quadrado", "Trapezio", "Losango", "Circulo"};

	printf("Escolha a figura geometrica:\n");
	int i = 0;
	for (i; i <= 5; i++) {
		printf("[%d] %s\n", i + 1, figuras[i]);
	}
	scanf("%d", &escolha);

	switch (escolha) {
		case 1:
			printf("Informe a base e a altura do triangulo: ");
			scanf("%f %f", &base, &altura);

			area = base * altura / 2;
			break;
		case 2:
			printf("Informe o comprimento e a altura do retangulo: ");
			scanf("%f %f", &lado, &altura);

			area = lado * altura;
			perimetro = 2*lado + 2*altura;
			break;
		case 3:
			printf("Informe o lado do quadrado: ");
			scanf("%f", &lado);

			area = lado * lado;
			perimetro = 4 * lado;
			break;
		case 4:
			printf("Informe a base inferior, a base superior e a altura do trapezio: ");
			scanf("%f %f %f", &base, &base2, &altura);

			area = ((base + base2)*altura)/2;
			break;
		case 5:
			printf("Informe a diagonal maior e a diagonal menor: ");
			scanf("%f %f", &base, &base2);

			area = base * base2 / 2;
			break;
		case 6:
			printf("Informe o raio do circulo: ");
			scanf("%f", &raio);

			area = pi * raio * raio;
			perimetro = 2 * pi * raio;
			break;
		default:
			printf("Escolha invalida");
	}

	printf("A area do %s foi de %f unidades de area", figuras[escolha-1], area);
	if (perimetro) {
		printf(" e perimetro igual a %f unidades de area", perimetro);
	}
	return 0;
}
