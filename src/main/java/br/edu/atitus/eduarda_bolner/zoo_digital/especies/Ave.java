package br.edu.atitus.eduarda_bolner.zoo_digital.especies;

public abstract class Ave extends Animal {

    public Ave(String nome, int idade) {
        super(nome, idade);
    }

    @Override
    public String getEspecie() {
        return "Ave";
    }
}
