package MyMoves;

import Main.Program;
import ru.ifmo.se.pokemon.*;

public final class ShadowBall extends SpecialMove {
    public ShadowBall(Type type, double pow, double acc){
        super(type, pow, acc);
    }

    @Override
    protected String describe(){
        return "использует Shadow Ball";
    }

    @Override
    protected void applyOppEffects(Pokemon p){
        int stat_sd = new Effect().stat(Stat.SPECIAL_DEFENSE);
        if(Program.check_modifier_down(stat_sd)){
            stat_sd--;
            Effect e = new Effect().chance(0.2).stat(Stat.SPECIAL_DEFENSE, stat_sd);
            p.addEffect(e);
        }
    }
}