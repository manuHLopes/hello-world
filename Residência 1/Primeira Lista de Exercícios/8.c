#include<stdio.h>

int main()
{
    //questão 8
    float fixo, vendas, final;
    printf("salario fixo: ");
    scanf("%f", &fixo);
    printf("total de vendas em R$: ");
    scanf("%f", &vendas);
    final = fixo + (vendas * 0.15);
    printf("o salario fixo: %.2f\no salario no final do mes: %.2f", fixo, final);
    return 0;
}