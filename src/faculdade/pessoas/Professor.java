package faculdade.pessoas;

import faculdade.dominio.Pessoa;

public class Professor extends Pessoa {
    private String centro;


    public Professor(String cpf, String nome, int idade, String centro) {
        super(cpf, nome, idade);
        this.centro = centro;
    }

    public void darAula() {
        System.out.println("Dando aula");
    }

    @Override
    public String toString() {
        return "Professor{" +
                "cpf='" + getCpf() + '\'' +
                ", nome='" + getNome() + '\'' +
                ", idade='" + getIdade() + '\'' +
                ", centro=" + centro +
                '}';
    }

}
