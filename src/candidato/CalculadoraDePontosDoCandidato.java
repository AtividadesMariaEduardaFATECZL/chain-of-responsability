package candidato;

public class CalculadoraDePontosDoCandidato {
    public int calcular(Candidato candidato) {
        PontosCandidato pontosCandidato = new PontosPorEnsinoMedioCompleto(
                new PontosPorEnsinoSuperiorCompleto(
                        new PontosPorExperienciaNaArea(
                                new PontosPorRegistroEmEntidadeDeClasse())));
        return pontosCandidato.acrescentaPonto(candidato);
    }
}
