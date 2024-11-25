package MyMoves;

import Main.Program;
import ru.ifmo.se.pokemon.*;

public final class DoubleTeam extends StatusMove {
    public DoubleTeam(Type type, double pow, double acc){
        super(type, pow, acc);
    }

    @Override
    protected String describe(){
        return "использует Double Team";
    }

    @Override
    protected void applySelfEffects(Pokemon p){
        int stat_e = new Effect().stat(Stat.EVASION);
        if(Program.check_modifier_up(stat_e)){
            stat_e++;
            Effect e = new Effect().stat(Stat.EVASION, stat_e);
            p.addEffect(e);
        }
    }
}