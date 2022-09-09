package Classes;

import Classes.Docente;

public class Professor extends Docente {

    private double salario;


    public Professor(int CPF, String nome, int idade, String email) {
        super(CPF, nome, idade, email);
        this.salario = 7000;

    }

    public double aumento(){
        double aumento;

        aumento =  salario * 1.10;
        return aumento;
    }

    public double desconto(){
        double desconto;

        desconto =  salario * 0.85;
        return desconto;
    }

    public double getSalarioProf(double salario){
        return salario;
    }

}
