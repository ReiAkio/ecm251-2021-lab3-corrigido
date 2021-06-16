package carvalho.murilo.pedra_papel_tesoura_2.models.bazinga;

import carvalho.murilo.pedra_papel_tesoura_2.models.Jogada;
import carvalho.murilo.pedra_papel_tesoura_2.models.classico.Papel;
import carvalho.murilo.pedra_papel_tesoura_2.models.classico.Pedra;
import carvalho.murilo.pedra_papel_tesoura_2.models.classico.Tesoura;

public class Lagarto extends Jogada {
    @Override
    public Jogada[] jogadasQueGanho() {
        return new Jogada[]{new Papel(), new Spoke()};
    }

    @Override
    public Jogada[] jogadasQuePerco() {
        return new Jogada[] {new Pedra(), new Tesoura()};
    }

    @Override
    public String toString() {
        return "Lagarto";
    }
}
