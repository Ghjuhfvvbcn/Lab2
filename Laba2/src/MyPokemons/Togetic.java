package MyPokemons;

import MyMoves.*;
import ru.ifmo.se.pokemon.*;

public class Togetic extends Togepi{

    Growl growl;

    public Togetic(String name, int level){
        super(name, level);

        addType(Type.FLYING);
        setStats(55, 40, 85, 80, 105, 40);

        growl = new Growl(Type.NORMAL, 0, 100);

        setMove(shadowBall, swagger, growl);
    }

}
