package Classes;
import Classes.Interface.AlunoList;

import java.util.ArrayList;
import java.util.List;


public class Aluno extends Discente {

    private double[] notas;
    private double media;
    private boolean status;
    private double presenca;
    private int ano;
    private int faltas;

    private List<AlunoList> ListagemD = new ArrayList<AlunoList>();

    public void addListener(AlunoList disciplina){
        this.ListagemD.add(disciplina);
    }

    public Aluno(int CPF, String nome, int idade, String email, double[] notas, double presenca) {
        super(CPF, nome, idade, email);
        this.notas = notas;
        this.presenca = presenca;

        calcM();
        calcAprovado();
    }

    private void calcAprovado(){
        this.setStatus(this.media >= 5 && this.presenca >= 75);

        for (AlunoList disciplina: ListagemD){
            disciplina.onAlunoChange();
        }
    }

    private void calcM(){
        int total = 0;
        for (double nota : this.notas){
            total += nota;
        }

        this.media = (double) total / this.notas.length;

        for (AlunoList disciplina: ListagemD){
            disciplina.onAlunoChange();
        }
    }

    public double[] getNotas() {
        return notas;
    }

    public void setNotas(double[] notas) {
        this.notas = notas;
        calcM();
        calcAprovado();
    }

    public boolean getStatus() {
        return status;
    }

    private void setStatus(boolean status){
        this.status = status;
    }

    public double getPresenca() {
        return presenca;
    }

    public void setPresenca(double presenca) {
        this.presenca = presenca;
        calcAprovado();
    }

    public double getMedia() {
        return media;
    }

    public void setMedia(double media) {
        this.media = media;
    }

    @Override
    public String toString() {
        return "Aluno{" +
                " media=" + media +
                ", status=" + status +
                ", presenca=" + presenca +
                ", ano=" + ano +
                ", faltas=" + faltas +
                '}';
    }
}

