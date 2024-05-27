package faculdade.pessoas.Alunos;

import faculdade.pessoas.Aluno;

public class Bolsista extends Aluno {

    public Bolsista(String cpf, String nome, int idade, int matricula) {
        super(cpf, nome, idade, matricula);
    }

    @Override
    public void pagarMensalidade() {
        System.out.println(getNome() + " Pagando mensalidade com desconto");

    }




}
