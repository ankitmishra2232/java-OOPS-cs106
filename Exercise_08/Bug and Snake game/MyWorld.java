import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (2125_Ankit) 
 * @version (a version number or a date)
 */
public class MyWorld extends World
{
    public static int score=0;
    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public MyWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1); 
        prepare();
    }
    public void act()
    {
        showText("Score:"+score,50,25);
    }
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        bug bug = new bug();
        addObject(bug,75,189);
        food food = new food();
        addObject(food,300,82);
        food food2 = new food();
        addObject(food2,364,217);
        food food3 = new food();
        addObject(food3,468,83);
        food food4 = new food();
        addObject(food4,139,269);
        food food5 = new food();
        addObject(food5,434,323);
        food food6 = new food();
        addObject(food6,91,118);
        Snake snake = new Snake();
        addObject(snake,380,38);
        Snake snake2 = new Snake();
        addObject(snake2,328,320);
        food food7 = new food();
        addObject(food7,144,30);
        food food8 = new food();
        addObject(food8,516,200);
        food food9 = new food();
        addObject(food9,72,346);
        food food10 = new food();
        addObject(food10,247,152);
    }
}
