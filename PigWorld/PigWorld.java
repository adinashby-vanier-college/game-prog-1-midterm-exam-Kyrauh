// WARNING: This file is auto-generated and any changes to it will be overwritten
import lang.stride.*;
import greenfoot.*;

/**
 * Write a description of class MyWorld here.
 * @author (Kyra Durrant) @version (24/09/2024)
 */
public class PigWorld extends World
{

    /**
     * Constructor for objects of class CrabWorld.
     */
    public PigWorld()
    {
        super(560, 560, 1);
        prepare();
    }

    /* (World, Actor, GreenfootImage, Greenfoot and MouseInfo)*/

    /**
     * 
     */
    public void prepare()
    {
        Pig pig =  new  Pig();
        addObject(pig, 180, 334);
        pig.setLocation(201, 331);
        Pig pig2 =  new  Pig();
        addObject(pig2, 485, 117);
        Pig pig3 =  new  Pig();
        addObject(pig3, 365, 423);
        removeObject(pig3);
        removeObject(pig2);
        Burger burger =  new  Burger();
        addObject(burger, 388, 83);
        Burger burger2 =  new  Burger();
        addObject(burger2, 98, 86);
        Burger burger3 =  new  Burger();
        addObject(burger3, 534, 368);
        Burger burger4 =  new  Burger();
        addObject(burger4, 270, 230);
        Burger burger5 =  new  Burger();
        addObject(burger5, 100, 485);
        Snake snake =  new  Snake();
        addObject(snake, 375, 456);
    }
}
