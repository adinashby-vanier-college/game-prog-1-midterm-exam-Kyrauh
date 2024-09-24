// WARNING: This file is auto-generated and any changes to it will be overwritten
import lang.stride.*;
import java.util.*;
import greenfoot.*;

/**
 * 
 */
public class GameWorldLost extends World
{

    /**
     * Constructor for objects of class GameOverWorld.
     */
    public GameWorldLost()
    {
        super(560, 560, 1);
        showTextWithBigWhiteFont("Loser", 260, 260);
    }

    /**
     * //will show the text Loser and play sound when game is lost
     */
    public void showTextWithBigWhiteFont(String message, int x, int y)
    {
        GreenfootImage bg = getBackground();
        Font font =  new  Font(30);
        bg.setFont(font);
        bg.setColor(Color.WHITE);
        bg.drawString(message, x, y);
        Greenfoot.playSound("lose.wav");
    }
}
