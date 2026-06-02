package br.edu.atitus.eduarda_bolner.zoo_digital.especies;

public abstract class Reptil extends Animal {

        public Reptil(String nome, int idade) {
        super(nome, idade);
    }

    @Override
    public String getEspecie() {
        return "Réptil";
    }
}
