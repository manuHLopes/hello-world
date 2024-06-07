#include<stdio.h>

int main()
{
    // questão 11
    float compra, pago, troco;
    printf("Valor da compra:");
    scanf("%f", &compra);
    printf("Valor pago:");
    scanf("%f", &pago);
    troco = pago - compra;
    printf("o troco sera: %.2f", troco);
    return 0;
}