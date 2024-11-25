package MyMoves;

import Main.Program;
import ru.ifmo.se.pokemon.*;

public final class MetalClaw extends PhysicalMove {
    public MetalClaw(Type type, double pow, double acc){
        super(type, pow, acc);
    }

    @Override
    protected String describe(){
        return "использует Metal Claw";
    }

    @Override
    protected void applySelfEffects(Pokemon p){
        int stat_a = new Effect().stat(Stat.ATTACK);
        if(Program.check_modifier_up(stat_a)){
            stat_a++;
            Effect e = new Effect().chance(0.1).stat(Stat.ATTACK, stat_a);
            p.addEffect(e);
        }
    }
}
