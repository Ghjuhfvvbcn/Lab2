package Main;

import MyPokemons.*;
import ru.ifmo.se.pokemon.Battle;

public class Program {
    public static void main(String[] args){
        Battle b = new Battle();

        Dialga p1 = new Dialga("Alga", 32);
        Snubbull p2 = new Snubbull("Snub", 7);
        Granbull p3 = new Granbull("Gran", 7);
        Togepi p4 = new Togepi("Pi", 1);
        Togetic p5 = new Togetic("Tic", 1);
        Togekiss p6 = new Togekiss("Kiss", 1);

        b.addAlly(p1);
        b.addAlly(p3);
        b.addAlly(p5);

        b.addFoe(p2);
        b.addFoe(p4);
        b.addFoe(p6);

        b.go();
    }

    public static boolean check_chance(double d){
        return d > Math.random();
    }
    public static boolean check_modifier_up(int m){
        return m < 6;
    }
    public static boolean check_modifier_down(int m){
        return m > -6;
    }
}
