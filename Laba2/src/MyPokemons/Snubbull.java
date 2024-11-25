package MyPokemons;

import MyMoves.*;
import ru.ifmo.se.pokemon.*;


public class Snubbull extends Pokemon {

    DoubleTeam doubleTeam;
    Bite bite;
    Flamethrower flamethrower;

    public Snubbull(String name, int level){
        super(name, level);

        setType(Type.FAIRY);
        setStats(60, 80, 50, 40, 40, 30);

        doubleTeam = new DoubleTeam(Type.NORMAL, 0, 0);
        bite = new Bite(Type.DARK, 60, 100);
        flamethrower = new Flamethrower(Type.FIRE, 90, 100);

        if(level >= 7){
            setMove(bite, doubleTeam, flamethrower);
        }
        else{
            setMove(doubleTeam, flamethrower);
        }

    }

}
