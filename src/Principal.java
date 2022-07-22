import candidato.CalculadoraDePontosDoCandidato;
import candidato.Candidato;

public class Principal {
    public static void main(String[] args) {
        Candidato candidatoComMaximoDePontos = new Candidato(true, true, 2,
                5);

        new CalculadoraDePontosDoCandidato().calcular(candidatoComMaximoDePontos);
        System.out.println(candidatoComMaximoDePontos);

        Candidato candidatoComOMinimoDePontos = new Candidato(false, false, 0,
                0);
        new CalculadoraDePontosDoCandidato().calcular(candidatoComOMinimoDePontos);
        System.out.println(candidatoComOMinimoDePontos);

        Candidato candidatoComAnosDeExperienciaEEnsinoMedio = new Candidato(true, false, 0,
                2);
        new CalculadoraDePontosDoCandidato().calcular(candidatoComAnosDeExperienciaEEnsinoMedio);
        System.out.println(candidatoComAnosDeExperienciaEEnsinoMedio);
    }
}
