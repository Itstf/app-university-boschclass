package Classes;

import java.util.ArrayList;

public class Instituto {

    ArrayList<Disciplina> disciplinas;
    String nome;

    public Instituto(ArrayList<Disciplina> disciplinas, String nome) {
        this.disciplinas = disciplinas;
        this.nome = nome;
    }

    @Override
    public String toString() {
        return "Classes.Instituto{" +
                "disciplinas=" + disciplinas +
                ", nome='" + nome + '\'' +
                '}';
    }
}
