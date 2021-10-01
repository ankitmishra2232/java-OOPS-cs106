import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class bug here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */

public class bug extends Actor
{
    /**
     * Act - do whatever the bug wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    MyWorld thisGame;
    public void act()
    {
        move(4);
        if(Greenfoot.isKeyDown("left"))
            turn(-4);
        if(Greenfoot.isKeyDown("right"))
            turn(4);
        eatfood();
    }
    
    public void eatfood()
    {
        if(isTouching(food.class))
            {
             removeTouching(food.class);
             thisGame.score++;
             //getWorld().showText("Score:"+score,100,30);
            }
    }    
}
