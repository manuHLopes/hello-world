// q 7

#include <stdio.h>

int main(){
	float a, v, pi, r, h;
	pi = 3.14;
	printf("Vamos calcular a área e o volume do cilindro em cm.\ninsira o raio:");
	scanf("%f", &r);
	printf("agora insira a altura:");
	scanf("%f", &h);
	a = 2*pi*r*(h+r);
	v = pi*r*r*h;
	printf("a area vale: %.2f cm2 e o volume vale: %.2f cm3", a, v);
	return 0;
}