package candidato;

public class CalculadoraDePontosDoCandidato {
    public void calcular(Candidato candidato) {
        PontosCandidato pontosCandidato = new PontosPorEnsinoMedioCompleto(
                new PontosPorEnsinoSuperiorCompleto(
                        new PontosPorExperienciaNaArea(
                                new PontosPorRegistroEmEntidadeDeClasse())));
        pontosCandidato.calcularPontos(candidato);
    }
}
