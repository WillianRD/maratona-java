package main.javacore.Gassociacao.teste;

import main.javacore.Gassociacao.dominio.Escola;
import main.javacore.Gassociacao.dominio.Professor;

public class EscolaTest01 {
    public static void main(String[] args) {
        Professor professor = new Professor("Willian");

        Professor professor1 = new Professor("Alberto");

        Professor[] professores = {professor};
        Professor[] profesoresEscola2 = {professor1};

        Escola escola = new Escola("Alisa",professores);
        Escola escola1 = new Escola("João", profesoresEscola2);

        escola.imprime();
        System.out.println("--------------");
        escola1.imprime();
    }
}