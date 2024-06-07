// questão 6
#include <stdio.h>

int main(){
	float raio, pi, a;
	pi = 3.14;
	printf("insira o raio: ");
	scanf("%f", &raio);
	a = pi * raio * raio;
	printf("o raio e: %.2f", a);
		
	
	return 0;
}