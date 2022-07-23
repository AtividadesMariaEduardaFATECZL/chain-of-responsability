package candidato;

public abstract class PontosCandidato {
    protected PontosCandidato proximo;

    public PontosCandidato(PontosCandidato proximo) {
        this.proximo = proximo;
    }

    public void calcularPontos(Candidato candidato) {
        if (deveAplicarPara(candidato)) {
            acrescentaPonto(candidato);
        }
        if (naoEOFinalDaCadeiaDeExecucao()) {
            proximo.calcularPontos(candidato);
        }
    }

    private boolean naoEOFinalDaCadeiaDeExecucao() {
        return proximo != null;
    }

    public abstract void acrescentaPonto(Candidato candidato);
    public abstract boolean deveAplicarPara(Candidato candidato);
}
