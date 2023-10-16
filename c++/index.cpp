#include <iostream>
#include <iomanip>
using namespace std;
void imc(float peso, float altura) {
  float resultado = peso / (altura * altura);
  cout <<fixed<<setprecision(2);
  std::cout<<"|o seu IMC eh:"<<resultado<<std::endl;
}
int main() {
  int op;
  float peso, altura, resultado;
  do {
  std::cout<<"\n|============================="<<std::endl;
  std::cout<<"|\tCalculadora de IMC"<<std::endl;
  std::cout<<"|============================="<<std::endl;
  std::cout<<"|1-Calcular"<<std::endl;
  std::cout<<"|2-Sair"<<std::endl;
  std::cout<<"|============================="<<std::endl;
  std::cout<<"|Escolha a opcao:";
   cin >>op;
  std::cout<<"|============================="<<std::endl;
  switch(op) {
    case 1:
    std::cout<<"|Calculo de IMC"<<std::endl;
    std::cout<<"|============================="<<std::endl;
    std::cout<<"|Informe o seu peso:";
     cin >>peso;
    std::cout<<"|============================="<<std::endl;
    std::cout<<"|Agora Informe a sua altura:";
     cin >>altura;
    std::cout<<"|============================="<<std::endl;
     imc(peso,altura);
    break;
    default:
    case 2:
  }std::cout<<"|============================="<<std::endl;
  std::cout<<"|Deseja Sair?"<<std::endl;
std::cout<<"|============================="<<std::endl;  
  std::cout<<"|2-Sim"<<std::endl;
  std::cout<<"|1-Nao"<<std::endl;
  std::cout<<"|============================="<<std::endl;
  std::cout<<"|Escolha a opcao:";
   cin >>op;
   if(op==2) {
   std::cout<<"|============================="<<std::endl;
   std::cout<<"|Good Bye!"<<std::endl;
   std::cout<<"|============================="<<std::endl;
   } else {
   std::cout<<"|============================="<<std::endl;
   }
 }while(op!=2 && op==1);
  return 0;
}