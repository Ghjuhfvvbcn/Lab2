package MyPokemons;

import ru.ifmo.se.pokemon.*;
import MyMoves.*;

public final class Dialga extends Pokemon{

    FlashCannon flashCannon;
    DragonBreath dragonBreath;
    AncientPower ancientPower;
    MetalClaw metalClaw;

    public Dialga(String name, int level){
        super(name, level);

        setType(Type.STEEL, Type.DRAGON);
        setStats(100, 120, 120, 150, 100, 90);

        flashCannon = new FlashCannon(Type.STEEL, 80, 100);
        dragonBreath = new DragonBreath(Type.DRAGON, 60, 100);
        ancientPower = new AncientPower(Type.ROCK, 60, 100);
        metalClaw = new MetalClaw(Type.STEEL, 50, 95);

        if(level >= 32){
            setMove(flashCannon, dragonBreath, ancientPower, metalClaw);
        }
        else if(level >= 16){
            setMove(dragonBreath, ancientPower, metalClaw);
        }
        else if(level >= 8){
            setMove(dragonBreath, metalClaw);
        }
        else{
            setMove(metalClaw);
        }

    }

}
