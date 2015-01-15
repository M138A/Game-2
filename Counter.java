import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.awt.Color;
import java.util.List;
/**
 * Write a description of class Counter here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Counter extends Actor
{
    /**
     * Act - do whatever the Counter wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    private int totalCount = 3;
    boolean gameIsDone;
    public void act() {
        if (gameIsDone == true){
            World world =  getWorld();
            world.addObject (new GameOver("Lost.png"),900/2,900/2);
            world.addObject (new BackButton("lose"),450,667);
            gameIsDone = false;
        }
    }

    public Counter() 
    {
        setImage(new GreenfootImage("Levens : 3", 20, Color.WHITE, Color.BLACK));
    }    

    public void bumpCount(int amount)
    {
        totalCount -= amount;
        setImage(new GreenfootImage("Levens: " + totalCount, 20, Color.WHITE, Color.BLACK));
        if (totalCount < 0)
        {
            gameIsDone = true;
        }

    }
}
