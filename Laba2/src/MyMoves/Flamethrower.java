package MyMoves;

import Main.Program;
import ru.ifmo.se.pokemon.Effect;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.SpecialMove;
import ru.ifmo.se.pokemon.Type;

public final class Flamethrower extends SpecialMove {
    public Flamethrower(Type type, double pow, double acc){
        super(type, pow, acc);
    }

    @Override
    protected String describe(){
        return "использует Flamethrower";
    }

    @Override
    protected void applyOppEffects(Pokemon p){
        if(Program.check_chance(0.1)){
            Effect.burn(p);
        }
    }
}
