import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class GameOver here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class GameOver extends Actor
{
    String picture;
    /**
     * Act - do whatever the GameOver wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public GameOver(String p) {
       picture = p;
       setImage(p);
    }
    public void act() 
    {
       World world = getWorld();
       world.removeObjects(getWorld().getObjects(Boat.class));
    }    
}
