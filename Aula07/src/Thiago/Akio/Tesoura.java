package Thiago.Akio;

import Thiago.Akio.Jogada;
import Thiago.Akio.Papel;
import Thiago.Akio.Pedra;

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
        return "Thiago.Akio.Tesoura";
    }
}