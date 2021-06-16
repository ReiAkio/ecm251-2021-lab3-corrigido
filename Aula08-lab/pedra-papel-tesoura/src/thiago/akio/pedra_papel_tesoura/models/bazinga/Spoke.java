package carvalho.murilo.pedra_papel_tesoura.models.bazinga;

import carvalho.murilo.pedra_papel_tesoura.enumeracoes.Resultado;
import carvalho.murilo.pedra_papel_tesoura.models.Jogada;
import carvalho.murilo.pedra_papel_tesoura.models.classico.Papel;
import carvalho.murilo.pedra_papel_tesoura.models.classico.Pedra;
import carvalho.murilo.pedra_papel_tesoura.models.classico.Tesoura;

public class Spoke extends Jogada {

    @Override
    public boolean verificaSeGanhei(Jogada jogada) {
        return (jogada instanceof Pedra) || (jogada instanceof Tesoura);
    }

    @Override
    public boolean verificaSePerdi(Jogada jogada) {
        return (jogada instanceof Papel) || (jogada instanceof Lagarto);
    }

    @Override
    public String toString() {
        return "Spoke";
    }
}
