package faculdade.turma;

import faculdade.dominio.Disciplina;
import faculdade.pessoas.Aluno;
import faculdade.pessoas.Professor;

import java.util.ArrayList;
import java.util.List;

public class Turma {
    int codigo;
    private Disciplina disciplina;
    private Professor professor;
    private List<Aluno> alunosList;


    public Turma(int codigo, Disciplina disciplina, Professor professor) {
        this.codigo = codigo;
        this.disciplina = disciplina;
        this.professor = professor;
        this.alunosList = new ArrayList<>();
    }

    public void adicionarAluno(Aluno aluno) {
        alunosList.add(aluno);
    }

    public void removerAluno(Aluno aluno) {
        alunosList.remove(aluno);
    }

    public void listarAlunos() {
        for (Aluno alunos : alunosList) {
            System.out.println(alunos);
        }
    }

    @Override
    public String toString() {
        return "Turma{" +
                "Codigo da Turma= " + codigo + '}' + '\n' +
                disciplina + '\'' + '\n' +
                professor + '\n' +
                "Lista de alunos:" + alunosList + '\n' +
                '}';
    }

    public int getCodigo() {
        return codigo;
    }

    public Disciplina getDisciplina() {
        return disciplina;
    }

    public Professor getProfessor() {
        return professor;
    }

    public List<Aluno> getAlunosList() {
        return alunosList;
    }
}
