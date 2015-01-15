import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class InstructionsGame2 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class InstructionsGame2 extends World
{

    /**
     * Constructor for objects of class InstructionsGame2.
     * 
     */
    public void act() {
        if (Greenfoot.isKeyDown("enter")){
        Greenfoot.setWorld(new MiniGame2());
    }
    
    }
    public InstructionsGame2()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(900, 900, 1); 
                BackButton button1 = new BackButton("win");
        addObject(button1,30,30);
    }
}
