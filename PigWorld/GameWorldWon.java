// WARNING: This file is auto-generated and any changes to it will be overwritten
import lang.stride.*;
import java.util.*;
import greenfoot.*;

/**
 * 
 */
public class GameWorldWon extends World
{

    /**
     * Constructor for objects of class GameWonWorld.
     */
    public GameWorldWon()
    {
        super(560, 560, 1);
        showText("Winner", 260, 260);
    }

    /**
     * //will showcase the texts in the GameWorldWon world and play the sound when game is won
     */
    public void showTextWithBigBlackFont(String message, int x, int y)
    {
        GreenfootImage bg = getBackground();
        Font font =  new  Font(50);
        bg.setFont(font);
        bg.setColor(Color.BLACK);
        bg.drawString(message, x, y);
        Greenfoot.playSound("win.wav");
    }
}
