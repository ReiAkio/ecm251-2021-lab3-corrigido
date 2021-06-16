package carvalho.murilo.pedra_papel_tesoura.models.classico;

import carvalho.murilo.pedra_papel_tesoura.models.Jogada;

public class Tesoura extends Jogada {

    @Override
    public boolean verificaSeGanhei(Jogada jogada) {
        return jogada instanceof Papel;
    }

    @Override
    public boolean verificaSePerdi(Jogada jogada) {
        return jogada instanceof Pedra;
    }

    @Override
    public String toString() {
        return "Tesoura";
    }
}
