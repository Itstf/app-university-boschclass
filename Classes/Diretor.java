package Classes;

public class Diretor extends Docente {

    private double salario;

    public Diretor(int CPF, String nome, int idade, String email) {
        super(CPF, nome, idade, email);
        this.salario = 16000;
    }

    public double aumento(){
        double aumento;

        aumento =  salario * 1.20;
        return aumento;
    }

    public double desconto(){
        double desconto;

        desconto =  salario * 0.70;
        return desconto;
    }

    public double getSalarioDiretor(double salario){
        return salario;
    }

}
