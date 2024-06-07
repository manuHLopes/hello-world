// questão 10
#include<stdio.h>

int main()
{
	int valor, vinte, cinquenta, cem, dez, cinco, dois, um;
	printf("insira o valor a ser sacado:");
	scanf("%d", &valor);
	cem = valor/100;
	valor = valor%100;
	cinquenta = valor/50;
	valor = valor%50;
	vinte = valor/20;
	valor = valor%20;
	dez = valor/10;
	valor = valor%10;
	cinco = valor/5;
	valor = valor%5;
	dois = valor/2;
	valor = valor%2;
	um = valor/1;
	valor = valor%1;
	printf("100:(%d)  50:(%d)  20:(%d) 10:(%d)  5:(%d)  2:(%d)\n\n", cem, cinquenta, vinte, dez, cinco, dois);
	printf("o valor restante: %d", valor);
	return 0;
}