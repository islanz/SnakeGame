package org.academiadecodigo.thefellowshift;

import org.academiadecodigo.thefellowshift.field.Field;
import org.academiadecodigo.thefellowshift.field.FieldImpl;
import org.academiadecodigo.thefellowshift.game.Game;

//main
public class Main {
    public static void main(String[] args) {
        Field field = new FieldImpl();
        Game game = new Game(field);
        game.init();
    }
}