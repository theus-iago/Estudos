#include <stdio.h>
#include <stdlib.h>
void soma(int n1,int n2) {
  int res = n1 + n2;
  printf("|o resultado eh: %d\n", res);
}
void subtracao(int n1, int n2) {
  int res = n1 - n2;
  printf("|o resultado eh: %d\n", res);
}
void multiplicacao(int n1, int n2) {
  int res = n1 * n2;
  printf("|o resultado eh: %d\n", res);
}
void divisao(int n1, int n2) {
  int res = n1 / n2;
  printf("|o resultado eh: %d\n", res);
}
int main() {
  char nome[30];
  int idade;
  int n1,n2;
  int op = 0;
  do {
  printf("|====================================\n");
  printf("|\tCalculadora\n");
  printf("|====================================\n");
  printf("|1-Soma\n");
  printf("|2-Subtracao\n");
  printf("|3-Multiplicacao\n");
  printf("|4-Divisao\n");
  printf("|5-Sair\n");
  printf("|====================================\n");
  printf("|Selecione a opcao:");
   scanf("%d", &op);
   printf("|====================================\n");
   switch(op) {
     case 1:
     printf("|\tSoma\n");
     printf("|====================================\n");
     printf("|Digite um numero:");
      scanf("%d", &n1);
      printf("|====================================\n");
    printf("|Digite outro numero:");
     scanf("%d", &n2);
     printf("|====================================\n");
     soma(n1,n2);
       break;
     case 2:
     printf("|\tSubtracaco\n");
     printf("|====================================\n");
     printf("|Digite um numero:");
      scanf("%d", &n1);
      printf("|====================================\n");
    printf("|Digite outro numero:");
     scanf("%d", &n2);
     printf("|====================================\n");
     subtracao(n1,n2);
       break;
     case 3:
     printf("|\tMultiplicacao\n");
     printf("|====================================\n");
     printf("|Digite um numero:");
      scanf("%d", &n1);
      printf("|====================================\n");
    printf("|Digite outro numero:");
     scanf("%d", &n2);
     printf("|====================================\n");
     multiplicacao(n1,n2);
       break;
     case 4:
     printf("|\tDivisao\n");
     printf("|====================================\n");
     printf("|Digite um numero:");
      scanf("%d", &n1);
      printf("|====================================\n");
    printf("|Digite outro numero:");
     scanf("%d", &n2);
     printf("|====================================\n");
     divisao(n1,n2);
       break;
       default:
       printf("|Esta opcao nao existe!\n");
       break;
       case 5:
       printf("|Deseja Sair?\n");
       
   }
   printf("|====================================\n");
   printf("|5- Sim\n");
   printf("|6- Nao\n");
   printf("|====================================\n");
   printf("|Selecione a opcao:");
    scanf("%d", &op);
    if(op==5) {
      printf("|====================================\n");
      printf("|Good Bye!\n");
      printf("|====================================\n");
    }
  }while(op!=5);
  return 0;
}