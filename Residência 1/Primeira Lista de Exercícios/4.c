// questão 4

#include <stdio.h>

int main(){
	float a, b;
	
	printf("me de dois numeros\na:");
	scanf("%f", &a);
	printf("b:");
	scanf("%f", &b);
	printf("a soma: %f\no produto: %f\no quociente: %f\n", a+b, a*b, a/b);
	
	return 0;
}