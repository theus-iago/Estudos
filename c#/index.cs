using System;

class Program
{
  static void Main(string[] args)
  {
  Console.WriteLine("|============================");
  Console.WriteLine("|Sistema de Cadastro");
  Console.WriteLine("|============================");
  Console.Write("|Por favor informe o seu nome:");
  string nome = Console.ReadLine();
  Console.WriteLine("|============================");
  Console.Write("|Agora a sua idade:");
  int idade = int.Parse(Console.ReadLine());
  Console.WriteLine("|============================");
  Console.Write("|Seu Cpf:");
  string cpf = Console.ReadLine();
  Console.WriteLine("|============================");
  Console.WriteLine($"|Bem-Vindo ao Sistema Sr.{nome}!");
  Console.WriteLine("|============================");
  }
}
