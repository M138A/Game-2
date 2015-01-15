import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * The class Container shows a menu button for the 'Containeroverslag' mini-game.
 * 
 * @author (Mark Hartgring) 
 * @version (1.0)
 */
public class Container extends Buttons
{
    public void act() 
    {
        //replaces image with description when hovered
        onMouseHover(Container.class, "images/Game-icon-04.png");
               if (Greenfoot.mouseClicked(this)){
         Greenfoot.setWorld(new InstructionsGame2());     
        }
    }    
}
