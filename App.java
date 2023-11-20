import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class App {

    private OrganizacaoEscolar organizacaoEscolar;
    private List<Aluno> alunos;
    private List<Professor> professores;
    private List<Disciplina> disciplinas;
    private List<Turma> turmas;

    private JFrame frame;
    private JTextArea outputTextArea;

    public App() {
        this.organizacaoEscolar = new OrganizacaoEscolar();
        this.alunos = carregarAlunos();
        this.professores = carregarProfessores();
        this.disciplinas = new ArrayList<>();
        this.turmas = new ArrayList<>();
        criarInterface();
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new App());
    }

    private List<Aluno> carregarAlunos() {
        // Implemente a lógica para carregar os alunos do arquivo
        return new ArrayList<>();
    }

    private List<Professor> carregarProfessores() {
        // Implemente a lógica para carregar os professores do arquivo
        return new ArrayList<>();
    }

    private void salvarAlunos() {
        // Implemente a lógica para salvar os alunos no arquivo
    }

    private void salvarProfessores() {
        // Implemente a lógica para salvar os professores no arquivo
    }

    private void cadastrarAluno(String nome, int matricula) {
        Aluno aluno = new Aluno(nome, matricula);
        alunos.add(aluno);
        salvarAlunos();
    }

    private void cadastrarProfessor(String nome, int matricula, Materias materia) {
        Professor professor = new Professor(nome, matricula, materia);
        professores.add(professor);
        salvarProfessores();
    }

    private void cadastrarDisciplina(int id, String nome, String descricao, int maxAlunos, int cargaHoraria,
            Materias materiaReq) {
        Disciplina disciplina = new Disciplina(id, nome, descricao, maxAlunos, cargaHoraria, materiaReq);
        disciplinas.add(disciplina);
    }

    private void matricularAlunoEmDisciplina(Aluno aluno, Disciplina disciplina) {
        if (aluno.addDisciplina(disciplina)) {
            // Feito na classe aluno o metodo
            JOptionPane.showMessageDialog(frame, "Aluno matriculado com sucesso!");
        } else {
            JOptionPane.showMessageDialog(frame, "Erro ao matricular o aluno!");
        }
    }

    private void criarTurmas() {
        // Implemente a lógica para criar turmas e alocar alunos e professores
    }

    private void visualizarDetalhesDisciplina(Disciplina disciplina) {
        outputTextArea.setText(disciplina.toString());
    }

    private void visualizarDetalhesProfessor(Professor professor) {
        outputTextArea.setText(professor.toString());
    }

    private void visualizarDetalhesAluno(Aluno aluno) {
        outputTextArea.setText(aluno.toString());
    }

    private void criarInterface() {
        frame = new JFrame("Sistema de Gerenciamento Escolar");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new BorderLayout());

        JPanel panel = new JPanel(new FlowLayout());

        JButton cadastrarAlunoButton = new JButton("Cadastrar Aluno");
        JButton cadastrarProfessorButton = new JButton("Cadastrar Professor");
        JButton cadastrarDisciplinaButton = new JButton("Cadastrar Disciplina");
        JButton matricularAlunoButton = new JButton("Matricular Aluno");
        JButton criarTurmasButton = new JButton("Criar Turmas");
        JButton visualizarDetalhesButton = new JButton("Visualizar Detalhes");

        outputTextArea = new JTextArea(20, 50);
        outputTextArea.setEditable(false);

        panel.add(cadastrarAlunoButton);
        panel.add(cadastrarProfessorButton);
        panel.add(cadastrarDisciplinaButton);
        panel.add(matricularAlunoButton);
        panel.add(criarTurmasButton);
        panel.add(visualizarDetalhesButton);

        frame.add(panel, BorderLayout.NORTH);
        frame.add(new JScrollPane(outputTextArea), BorderLayout.CENTER);

        cadastrarAlunoButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                cadastrarAluno("Nome do Aluno", 123);
            }
        });

        cadastrarProfessorButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                cadastrarProfessor("Nome do Professor", 456, Materias.P_ORIENTACAO_A_OBJETOS);
            }
        });

        cadastrarDisciplinaButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                cadastrarDisciplina(1, "Disciplina 1", "Descrição da Disciplina", 30, 4,
                        Materias.P_ORIENTACAO_A_OBJETOS);
            }
        });

        matricularAlunoButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Aluno aluno = alunos.get(0); // Obtém o primeiro aluno (exemplo)
                Disciplina disciplina = disciplinas.get(0); // Obtém a primeira disciplina (exemplo)
                matricularAlunoEmDisciplina(aluno, disciplina);
            }
        });

        criarTurmasButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                criarTurmas();
            }
        });

        visualizarDetalhesButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Disciplina disciplina = disciplinas.get(0); // Obtém a primeira disciplina (exemplo)
                visualizarDetalhesDisciplina(disciplina);
            }
        });

        frame.setSize(800, 600);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}