package MyMoves;

import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.SpecialMove;
import ru.ifmo.se.pokemon.Type;

public final class AuraSphere extends SpecialMove {
    public AuraSphere(Type type, double pow, double acc){
        super(type, pow, acc);
    }

    @Override
    protected String describe(){
        return "использует Aura Sphere";
    }

    @Override
    protected boolean checkAccuracy(Pokemon att, Pokemon def){
        return true;
    }
}