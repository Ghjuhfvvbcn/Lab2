package MyMoves;

import Main.Program;
import ru.ifmo.se.pokemon.Effect;
import ru.ifmo.se.pokemon.PhysicalMove;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

public final class Bite extends PhysicalMove {
    public Bite(Type type, double pow, double acc){
        super(type, pow, acc);
    }

    @Override
    protected String describe(){
        return "использует Bite";
    }

    @Override
    protected void applyOppEffects(Pokemon p){
        if(Program.check_chance(0.3)){
            Effect.flinch(p);
        }
    }
}
