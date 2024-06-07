#include<stdio.h>

int main()
{
   // questão 12
   float media1, media2, soma, mediaTotal;
   media1= (7+8+9)/3;
   media2= (4+5+6)/3;
   soma = media1 + media2;
   mediaTotal = soma/2;
   printf("a soma: %.2f e a media: %.2f", soma, mediaTotal);
   return 0;
}