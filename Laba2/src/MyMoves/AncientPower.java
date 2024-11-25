package MyMoves;

import Main.Program;
import ru.ifmo.se.pokemon.*;

public final class AncientPower extends SpecialMove {
    public AncientPower(Type type, double pow, double acc){
        super(type, pow, acc);
    }

    @Override
    protected String describe(){
        return "использует Ancient Power";
    }

    @Override
    protected void applySelfEffects(Pokemon p){
        if(Program.check_chance(0.1)){
            Effect e;

            int stat_a = new Effect().stat(Stat.ATTACK);
            if(Program.check_modifier_up(stat_a)){
                stat_a++;
                e = new Effect().stat(Stat.ATTACK, stat_a);
                p.addEffect(e);
            }

            int stat_d = new Effect().stat(Stat.DEFENSE);
            if(Program.check_modifier_up(stat_d)){
                stat_d++;
                e = new Effect().stat(Stat.DEFENSE, stat_d);
                p.addEffect(e);
            }

            int stat_sa = new Effect().stat(Stat.SPECIAL_ATTACK);
            if(Program.check_modifier_up(stat_sa)){
                stat_sa++;
                e = new Effect().stat(Stat.SPECIAL_ATTACK, stat_sa);
            }

            int stat_sd = new Effect().stat(Stat.SPECIAL_DEFENSE);
            if(Program.check_modifier_up(stat_sd)){
                stat_sd++;
                e = new Effect().stat(Stat.SPECIAL_DEFENSE, stat_sd);
            }

            int stat_s = new Effect().stat(Stat.SPEED);
            if(Program.check_modifier_up(stat_s)){
                stat_s++;
                e = new Effect().stat(Stat.SPEED, stat_s);
            }
        }
    }
}
