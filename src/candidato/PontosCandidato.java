package candidato;

public abstract class PontosCandidato {
    protected  PontosCandidato proximo;

    public PontosCandidato(PontosCandidato proximo) {
        this.proximo = proximo;
    }

    public abstract int acrescentaPonto(Candidato candidato);
}
