#include <stdio.h>

int main()
{
	int a, b, aux;
	printf("Digite o valor de a:");
	scanf("%d", &a);
	printf("Digite o valor de b:");
	scanf("%d", &b);
	printf("a vale: %d e b vale: %d\n", a, b);
	aux = a;
	a = b;
	b = aux;
	printf("depois da troca, a vale %d e b vale %d\n", a, b);
	return 0;
}