package MyMoves;

import Main.Program;
import ru.ifmo.se.pokemon.Effect;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.SpecialMove;
import ru.ifmo.se.pokemon.Type;

public final class DragonBreath extends SpecialMove {
    public DragonBreath(Type type, double pow, double acc){
        super(type, pow, acc);
    }

    @Override
    protected String describe(){
        return "использует Dragon Breath";
    }

    @Override
    protected void applyOppEffects(Pokemon p){
        if(Program.check_chance(0.3)){
            Effect.paralyze(p);
        }
    }
}