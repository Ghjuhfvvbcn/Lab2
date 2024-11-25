package MyMoves;

import Main.Program;
import ru.ifmo.se.pokemon.*;

public final class Growl extends StatusMove {
    public Growl(Type type, double pow, double acc){
        super(type, pow, acc);
    }

    @Override
    protected String describe(){
        return "использует Growl";
    }

    @Override
    protected void applyOppEffects(Pokemon p){
        int stat_a = new Effect().stat(Stat.ATTACK);
        if(Program.check_modifier_down(stat_a)){
            stat_a--;
            Effect e = new Effect().stat(Stat.ATTACK, stat_a);
            p.addEffect(e);
        }
    }
}
