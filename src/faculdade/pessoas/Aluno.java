package faculdade.pessoas;

import faculdade.dominio.Pessoa;

public abstract class Aluno extends Pessoa {

    int matricula;

    public Aluno(String cpf, String nome, int idade, int matricula) {
        super(cpf, nome, idade);
        this.matricula = matricula;

    }
    public abstract void pagarMensalidade();

    public String toString() {
        return "Aluno{" +
                "cpf='" + getCpf() + '\'' +
                ", nome='" + getNome() + '\'' +
                ", idade='" + getIdade() + '\'' +
                ", matricula=" + matricula +
                '}';
    }

}
