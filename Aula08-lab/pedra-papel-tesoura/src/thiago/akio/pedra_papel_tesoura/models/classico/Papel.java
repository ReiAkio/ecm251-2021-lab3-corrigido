package carvalho.murilo.pedra_papel_tesoura.models.classico;

import carvalho.murilo.pedra_papel_tesoura.models.Jogada;
import carvalho.murilo.pedra_papel_tesoura.models.bazinga.Lagarto;
import carvalho.murilo.pedra_papel_tesoura.models.bazinga.Spoke;

public class Papel extends Jogada {

    @Override
    public boolean verificaSeGanhei(Jogada jogada) {
        return (jogada instanceof Pedra) || (jogada instanceof Spoke);
    }

    @Override
    public boolean verificaSePerdi(Jogada jogada) {
        return (jogada instanceof Tesoura) || (jogada instanceof Lagarto);
    }

    @Override
    public String toString() {
        return "Papel";
    }
}
