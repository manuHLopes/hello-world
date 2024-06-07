#include<stdio.h>

int main()
{
    // questão 13
    float pFab, pImp, pRev, pFin;
    
    printf("insira o preco de fabrica: R$ ");
    scanf("%f", &pFab);
    pImp = pFab * 0.45;
    pRev = pFab * 0.28;
    pFin = pFab + pRev + pImp;
    printf("o preco final: R$ %.2f", pFin);
    return 0;
}