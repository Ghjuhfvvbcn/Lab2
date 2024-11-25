package MyPokemons;

import ru.ifmo.se.pokemon.*;
import MyMoves.*;

public class Togepi extends Pokemon {
    ShadowBall shadowBall;
    Swagger swagger;

    public Togepi(String name, int level){
        super(name, level);

        setType(Type.FAIRY);
        setStats(35, 20, 65, 40, 65, 20);

        shadowBall = new ShadowBall(Type.GHOST, 80, 100);
        swagger = new Swagger(Type.NORMAL, 0, 85);

        setMove(shadowBall, swagger);
    }

}
