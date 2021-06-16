package carvalho.murilo.pedra_papel_tesoura_2.models.classico;

import carvalho.murilo.pedra_papel_tesoura_2.models.Jogada;
import carvalho.murilo.pedra_papel_tesoura_2.models.bazinga.Lagarto;
import carvalho.murilo.pedra_papel_tesoura_2.models.bazinga.Spoke;

public class Tesoura extends Jogada {

    @Override
    public Jogada[] jogadasQueGanho() {
        return new Jogada[]{new Lagarto(), new Papel()};
    }

    @Override
    public Jogada[] jogadasQuePerco() {
        return new Jogada[] {new Pedra(), new Spoke()};
    }
    @Override
    public String toString() {
        return "Tesoura";
    }
}
