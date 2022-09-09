package Classes;

public class Monitor extends Discente {

    private double salario;
    private int ano;
    private double bolsa;
    private boolean avaliacao;

    public Monitor(int CPF, String nome, int idade, String email, int ano, double bolsa) {
        super(CPF, nome, idade, email);
        this.ano = ano;
        this.bolsa = bolsa;
        this.salario = 2000;
    }

    public double aumento(){
        double aumento;
        aumento =  salario * 1.05;
        return aumento;
    }

    public double desconto(){
        double desconto;

        desconto =  salario * 0.95;
        return desconto;
    }

    public double getSale() {
        return salario;
    }

    public void getSale(double salario) {
        this.salario = salario;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public double getBolsa() {
        return bolsa;
    }

    public void setBolsa(double bolsa) {
        this.bolsa = bolsa;
    }

    public boolean getAvaliacao() {
        return avaliacao;
    }

    public void setAvaliacao(boolean avaliacao) {
        this.avaliacao = avaliacao;
    }
}
