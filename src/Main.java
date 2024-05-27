import faculdade.dominio.Disciplina;
import faculdade.pessoas.Aluno;
import faculdade.pessoas.Alunos.Bolsista;
import faculdade.pessoas.Alunos.Regular;
import faculdade.pessoas.Professor;
import faculdade.turma.Turma;

public class Main {
    public static void main(String[] args) {
        Disciplina d1 = new Disciplina(1, "Orientação a Objetos", 1);
        Disciplina d2 = new Disciplina(2, "Lógica de Programação", 1);
        Disciplina d3 = new Disciplina(3, "Java", 1);

        Aluno aluno1 = new Regular("2224241", "Joao", 22, 20241);
        Aluno aluno2 = new Regular("2225251", "Pedro", 23, 20242);
        Aluno aluno3 = new Bolsista("2226261", "Julia", 24, 20243);

        Professor professor = new Professor("2227271", "Maria", 42, "Unifor");

        Turma turma1 = new Turma(1, d1, professor);
        turma1.adicionarAluno(aluno1);
        turma1.adicionarAluno(aluno2);
        turma1.adicionarAluno(aluno3);

        Turma turma2 = new Turma(2, d2, professor);
        turma2.adicionarAluno(aluno1);
        turma2.adicionarAluno(aluno2);
        turma2.adicionarAluno(aluno3);

        Turma turma3 = new Turma(3, d3, professor);
        turma3.adicionarAluno(aluno1);
        turma3.adicionarAluno(aluno2);
        turma3.adicionarAluno(aluno3);

        System.out.println(turma1);
        System.out.println("-------------");
        System.out.println(turma2);
        System.out.println("-------------");
        System.out.println(turma3);


    }
}
