import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * The class Surfer shows a menu button for the 'Zandsurfer' mini-game.
 * 
 * @author (Mark Hartgring) 
 * @version (1.0)
 */
public class Surfer extends Buttons
{
    public void act() 
    {
        //replaces image with description when hovered
        onMouseHover(Surfer.class, "images/Game-icon-03.png");      
    }    
}
