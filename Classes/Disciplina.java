package Classes;

import Classes.Interface.AlunoList;

import java.util.ArrayList;

public class Disciplina implements AlunoList {

    private String nome;
    private ArrayList<Aluno> alunos;
    private ArrayList<Docente> professores;
    private ArrayList<Monitor> monitor;
    private double aprovada;

    public Disciplina(String nome, ArrayList<Aluno> alunos, ArrayList<Docente> professores, ArrayList<Monitor> monitor) {
        this.nome = nome;
        this.alunos = alunos;
        this.professores = professores;
        this.monitor = monitor;

        calcularAprovada();

        for (Aluno aluno : alunos) {
            aluno.addListener(this);
        }
    }

    public void calcularAprovada() {
        double total = 0;
        for (Aluno aluno : alunos) {
            if (aluno.getStatus()) {
                total += 1;
            }
        }
        this.aprovada = (total / this.alunos.size()) * 100;

        if (this.aprovada >= 60) {
            System.out.println("Aumento:\n");
            for (Monitor monitor : monitor) {
                double value = monitor.aumento();
                System.out.println("Monitor: " + value);
            }

            for (Docente professor : professores) {
                if (professor instanceof Professor) {
                    double valueProf = ((Professor) professor).aumento();
                    System.out.println("Prof: "+valueProf);
                }
            }

            for (Docente coordenador : professores) {
                if (coordenador instanceof Coordenador) {
                    double valueCoor = ((Coordenador) coordenador).aumento();
                    System.out.println("Coordenador:"+valueCoor);

                }
            }

            for (Docente diretor : professores) {
                if (diretor instanceof Diretor) {
                    double valueDir = ((Diretor) diretor).aumento();
                    System.out.println("Diretor:"+valueDir);

                }
            }

        }
        if (this.aprovada < 50) {
            System.out.println("Foram descontados:\n");
            for (Monitor monitor : monitor) {
                double value = monitor.desconto();
                System.out.println("Monitor:"+value);
            }

            for (Docente professor : professores) {
                if (professor instanceof Professor) {
                    double valueProf = ((Professor) professor).desconto();
                    System.out.println("Prof: "+valueProf);
                }
            }

            for (Docente coordenador : professores) {
                if (coordenador instanceof Coordenador) {
                    double valueCoor = ((Coordenador) coordenador).desconto();
                    System.out.println("Coordenador:"+valueCoor);
                }
            }

            for (Docente diretor : professores) {
                if (diretor instanceof Diretor) {
                    double valueDir = ((Diretor) diretor).desconto();
                    System.out.println("Diretor:"+valueDir);
                }
            }
        }
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public ArrayList<Aluno> getAlunos() {
        return alunos;
    }

    public void getAlunos(ArrayList<Aluno> alunos) {
        this.alunos = alunos;
    }

    public ArrayList<Docente> getProfessores() {
        return professores;
    }

    public void setProfessores(ArrayList<Docente> professores) {
        this.professores = professores;
    }

    public ArrayList<Monitor> getMonitores() {
        return monitor;
    }

    public void setMonitores(ArrayList<Monitor> monitores) {
        this.monitor = monitores;
    }

    @Override
    public String toString() {
        return "Classes.Disciplina{" +
                "nome='" + nome + '\'' +
                ", turma=" + alunos +
                ", professores=" + professores +
                ", monitores=" + monitor +
                '}';
    }

    @Override
    public void onAlunoChange() {
        this.calcularAprovada();
    }
}
