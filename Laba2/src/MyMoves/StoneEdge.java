package MyMoves;

import ru.ifmo.se.pokemon.PhysicalMove;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

public final class StoneEdge extends PhysicalMove {
    public StoneEdge(Type type, double pow, double acc){
        super(type, pow, acc);
    }

    @Override
    protected String describe(){
        return "использует Stone Edge";
    }

    @Override
    protected double calcCriticalHit(Pokemon att, Pokemon def){
        return 0.125;
    }
}
