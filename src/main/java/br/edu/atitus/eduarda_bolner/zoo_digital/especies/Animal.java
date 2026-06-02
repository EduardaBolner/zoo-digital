package br.edu.atitus.eduarda_bolner.zoo_digital.especies;

public abstract class Animal {

    private String nome;
    private int idade;
    private static int contador = 0;

    public Animal(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
        contador++;
    }

    // Método abstrato obrigatório
    public abstract void emitirSom();

    // Sobrecarga de comer()
    public void comer() {
        System.out.println(nome + " está comendo.");
    }

    // Sobrecarga com parâmetro - declarado como final (não pode ser sobrescrito)
    public final void comer(String alimento) {
        System.out.println(nome + " está comendo " + alimento + ".");
    }

    // Método static para retornar contador
    public static int getContador() {
        return contador;
    }

    public static void resetContador() {
        contador = 0;
    }

    // Getters e Setters
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

    public abstract String getEspecie();

    @Override
    public String toString() {
        return "Nome: " + nome + " | Idade: " + idade + " ano(s) | Espécie: " + getEspecie();
    }
}
