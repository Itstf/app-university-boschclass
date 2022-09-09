package App;

import Classes.*;

import java.util.ArrayList;

public class App {

    public static void main(String[] args) {

        ArrayList<Aluno> alunos = new ArrayList<>();
        ArrayList<Docente> professores = new ArrayList<>();
        ArrayList<Monitor> monitor = new ArrayList<>();

        alunos.add(new Aluno(123456789, "Bi", 28, "hotops@gmail.com",new double[]{3.00,2.00}, 10.00));
        alunos.add(new Aluno(987425511, "Thai", 15, "thai.f@gmail.com",new double[]{10.00,10.00} , 75.00));
        alunos.add(new Aluno(715486513, "Euzébio", 16, "zeze@gmail.com",new double[]{5.00,1.00} , 50.00));
        alunos.add(new Aluno(715486513, "Claudinei", 17, "meninoNey@gmail.com",new double[]{5.00,1.00} , 50.00));

        professores.add(new Professor(1234567,"Francis",20, "francisQuini@gmail.com"));
        professores.add(new Professor(1234567,"Maria-de-Lurdes",55, "maria.lurdes@gmail.com"));
        professores.add(new Professor(1234567,"Isaque",30, "isaque@gmail.com"));

        monitor.add(new Monitor(3512469,"jubileu", 37, "jubinho@gmail.com",2010,30.00));
        monitor.add(new Monitor(7845946,"Claudete", 45, "cladetelindinha@gmail.com",2018,60.00));
        monitor.add(new Monitor(2541364,"Clóvis", 33, "clovinho@gmail.com",2014,80.00));

        professores.add((new Coordenador(3461572,"Christiane",51,"chrisflor@gmail.com")));
        professores.add((new Coordenador(4478152,"Marta",47,"martinha@gmail.com")));
        professores.add((new Coordenador(3465197,"Julia",29,"julinha@gmail.com")));

        professores.add((new Coordenador(3461572,"Christiane",51,"chrisflor@gmail.com")));
        professores.add((new Coordenador(4478152,"Marta",47,"martinha@gmail.com")));
        professores.add((new Coordenador(3465197,"Julia",29,"julinha@gmail.com")));

        Disciplina porcentagem = new Disciplina("porcentagem aprovada", alunos, professores, monitor);

        Clear.clear();
        System.out.println("\nTURMA\n");
        System.out.println("Nome:" +alunos.get(0).getNome() +
                " , Email: " + alunos.get(0).getEmail() +
                " , Presença: " +alunos.get(0).getPresenca() +
                " , Media: " +alunos.get(0).getMedia() +
                " , Status: " +alunos.get(0).getStatus());

        System.out.println("Nome:" + alunos.get(1).getNome() +
                " , Email: " + alunos.get(1).getEmail() +
                ", Presença: " +alunos.get(1).getPresenca() +
                " , Media: " +alunos.get(1).getMedia() +
                " , Status: " +alunos.get(1).getStatus());

        System.out.println("Nome:" +alunos.get(2).getNome() +
                " , Email: " + alunos.get(2).getEmail() +
                " , Presença: " +alunos.get(2).getPresenca() +
                " , Media: " +alunos.get(2).getMedia() +
                " , Status: " +alunos.get(2).getStatus());

        System.out.println("\n");

        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        Clear.clear();
        System.out.println("DISCP. AND PROFESSORES\n");
        System.out.println("Matemática - "+
                "Nome:" +professores.get(0).getNome() +
                " , Email:" +professores.get(0).getEmail() +
                " , Idade:" +professores.get(0).getIdade());

        System.out.println("Inglês - "+
                "Nome:" +professores.get(1).getNome() +
                " , Email:" +professores.get(1).getEmail() +
                " , Idade:" +professores.get(1).getIdade());

        System.out.println("Geografia - "+
                "Nome:" +professores.get(2).getNome() +
                " , Email:" +professores.get(2).getEmail() +
                " , Idade:" +professores.get(2).getIdade());

        System.out.println("\n");

        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        Clear.clear();

        System.out.println("MONITORES\n");
        System.out.println("Nome:" + monitor.get(0).getNome() +
                " , Email:" + monitor.get(0).getEmail() +
                " , Ano:" + monitor.get(0).getAno() +
                " , Bolsa:" + monitor.get(0).getBolsa());

        System.out.println("Nome:" + monitor.get(1).getNome() +
                " , Email:" + monitor.get(1).getEmail() +
                " , Ano:" + monitor.get(1).getAno() +
                " , Bolsa:" + monitor.get(1).getBolsa());

        System.out.println("Nome:" + monitor.get(2).getNome() +
                " , Email:" + monitor.get(2).getEmail() +
                " , Ano:" + monitor.get(2).getAno() +
                " , Bolsa:" + monitor.get(2).getBolsa());

        System.out.println("\n");

        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        Clear.clear();
        System.out.println("AUMENTOS OU DESCONTOS\n");
        porcentagem.calcularAprovada();

        for (int i = 0; i < alunos.size(); i++) {
            alunos.get(0).getIdade();

        }

    }
}
