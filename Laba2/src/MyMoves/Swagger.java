package MyMoves;

import Main.Program;
import ru.ifmo.se.pokemon.*;

public final class Swagger extends StatusMove {
    public Swagger(Type type, double pow, double acc){
        super(type, pow, acc);
    }

    @Override
    protected String describe(){
        return "использует Swagger";
    }

    @Override
    protected void applyOppEffects(Pokemon p){
        Effect.confuse(p);

        int stat_a = new Effect().stat(Stat.ATTACK);
        Effect e = new Effect().stat(Stat.ATTACK, stat_a);

        for(int i = 0; i<2; i++){
            if(Program.check_modifier_up(stat_a)){
                stat_a++;
                p.addEffect(e);
            }
        }
    }
}