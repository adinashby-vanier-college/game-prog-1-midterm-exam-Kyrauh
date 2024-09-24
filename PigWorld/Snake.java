// WARNING: This file is auto-generated and any changes to it will be overwritten
import lang.stride.*;
import greenfoot.*;

/**
 * Write a description of class Snake here.
 * @author (your name) @version (a version number or a date)
 */
public class Snake extends Actor
{

    /* (World, Actor, GreenfootImage, Greenfoot and MouseInfo)*/

    /**
     * Act - do whatever the Snake wants to do. This method is called whenever the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        moveAndTurn();
        eat();
        if (isGameOver()) {
            transitionToGameWorldLost();
        }
    }

    /**
     * //allows the snake to move around
     */
    public void moveAndTurn()
    {
        move(4);
        if (Greenfoot.isKeyDown("left")) {
            turn(5);
        }
        if (Greenfoot.isKeyDown("right")) {
            turn(-4);
        }
    }

    /**
     * //allows the snake to eat the pig
     */
    public void eat()
    {
        Actor pig = getOneIntersectingObject(Pig.class);
        if (pig != null) {
            World world = getWorld();
            world.removeObject(pig);
            Greenfoot.playSound("eating.wav");
        }
    }

    /**
     * //transitons to GameWorldLost
     */
    public void transitionToGameWorldLost()
    {
        World gameOverWorld =  new  GameWorldLost();
        Greenfoot.setWorld(gameOverWorld);
    }

    /**
     * //allows java to know when the game is Lost
     */
    public boolean isGameOver()
    {
        World world = getWorld();
        if (world.getObjects(Pig.class).isEmpty()) {
            return true;
        }
        else {
            return false;
        }
    }
}
