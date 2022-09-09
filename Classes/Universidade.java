package Classes;

import java.util.ArrayList;

public class Universidade {

    private ArrayList<Instituto> institutos = new ArrayList<>();
    String nome;

    public Universidade(ArrayList<Instituto> institutos, String nome) {
        this.institutos = institutos;
        this.nome = nome;
    }

    public ArrayList<Instituto> getInstitutos() {
        return institutos;
    }

    public void setInstitutos(ArrayList<Instituto> institutos) {
        this.institutos = institutos;
    }

    public void addInstituto(Instituto instituto){
        this.institutos.add(instituto);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public String toString() {
        return "Classes.Universidade{" +
                "institutos=" + institutos +
                ", nome='" + nome + '\'' +
                '}';
    }
}
