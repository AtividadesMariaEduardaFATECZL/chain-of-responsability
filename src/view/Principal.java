package view;

import controller.EnsinoSuperiorCompleto;
import model.Candidato;

public class Principal {
    public static void main(String[] args) {
        Candidato candidato = new Candidato();
        candidato.setAnosDeExperiencia(10);
        candidato.setAnosEmEntidadeDeClasse(1);
        candidato.setEnsinoSuperiorcompleto(true);

        EnsinoSuperiorCompleto ensinoSuperiorCompleto = new EnsinoSuperiorCompleto();
        ensinoSuperiorCompleto.proximaAdicao(candidato);
        System.out.print(candidato.toString());
    }
}
