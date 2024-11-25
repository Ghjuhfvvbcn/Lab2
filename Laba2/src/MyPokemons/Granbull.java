package MyPokemons;

import MyMoves.*;
import ru.ifmo.se.pokemon.Type;

public final class Granbull extends Snubbull{

    StoneEdge stoneEdge;

    public Granbull(String name, int level){
        super(name, level);

        setStats(90, 120, 75, 60, 60, 45);

        stoneEdge = new StoneEdge(Type.ROCK, 100, 80);

        if(level >= 7){
            setMove(bite, doubleTeam, flamethrower, stoneEdge);
        }
        else{
            setMove(doubleTeam, flamethrower, stoneEdge);
        }
    }

}
