package MyPokemons;

import ru.ifmo.se.pokemon.*;
import MyMoves.*;

public final class Togekiss extends Togetic{

    AuraSphere auraSphere;

    public Togekiss(String name, int level){
        super(name, level);

        setStats(85, 50, 95, 120, 115, 80);

        auraSphere = new AuraSphere(Type.FIGHTING, 80, 0);

        setMove(shadowBall, swagger, growl, auraSphere);
    }


}