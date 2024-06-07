// questão 3
#include<stdio.h>

int main(){
	int x, y;
	
	printf("me de dois numeros, x: ");
	scanf("%d", &x);
	printf("y: ");
	scanf("%d", &y);
	printf("o quociente: %d e o resto: %d", x/y, x%y);
	
	return 0;
}