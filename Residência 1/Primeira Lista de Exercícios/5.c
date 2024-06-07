// questão 5
#include <stdio.h>

int main(){
	float cm, pol;
	printf("insira os centimetros:");
	scanf("%f", &cm);
	pol = cm / 2.54;
	printf("%.2f cm = %.2f pol", cm, pol);
}