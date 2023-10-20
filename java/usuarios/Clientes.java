package Usuarios;
public class Clientes {
    private String nome;
    private int idade;
    private float saldo = 0;
    
    public Clientes() {
    }
    public void depositar(float valor) {
      this.saldo = saldo + valor;
    }
    public void sacar(float valor) {
      this.saldo = saldo - valor;
    }
    public Clientes(String nome, int idade, float saldo) {
      this.nome = nome;
      this.idade = idade;
      this.saldo = saldo;
    }
    public String getNome() {
      return nome;
    }
    public void setNome(String nome) {
      this.nome = nome;
    }
    public int getIdade() {
      return idade;
    }
    public void setIdade(int idade) {
      this.idade = idade;
    }
    public float getSaldo() {
      return saldo;
    }
    public void setSaldo(float saldo) {
      this.saldo = saldo;
    }
}