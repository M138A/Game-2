import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.List;
import java.awt.Color;
/**
 * In the class Buttons are all the functions that the menu buttons need.
 * 
 * @author (Mark Hartgring) 
 * @version (1.0)
 */
public class Buttons extends Actor
{
    /**The function onMouseHover replaces the image with text when the mouse hovers over it*/
    public void onMouseHover(Class HoverClass, String OrgPath){
        MouseInfo mouse = Greenfoot.getMouseInfo();  
        if (mouse != null) { 
            setImage(OrgPath);  
            List objects = getWorld().getObjectsAt(mouse.getX(), mouse.getY(), HoverClass);  
            for (Object object : objects)  
            {  
                if (object == this)  
                {  
                    // Replace the image of the hovered button with the generated image, which contains the description of the mini-game.
                    setImage(DisplayDescription(HoverClass));  
                }  
            }  
        }  

    }

    /**The function DisplayDescription returns an images with the description of the mini-game. */
    public GreenfootImage DisplayDescription(Class DT){
        String message = "";
        if (DT == Mechanic.class){
            message = "In deze game is het \n de bedoeling dat je zo \n snel mogelijk boten repareert. \n Het beroep dat hierbij \n hoort is monteur.";
        }
        else if (DT == Container.class){
            message = "In deze game moet je \n containers overslaan naar \n verschillende schepen. \n Een van de beroepen \n is kraanmachinist.";
        }
        else if (DT == ShipController.class){
            message = "In deze game moet je \n de binnenkomende schepen \n een aanlegplaats toewijzen. \n In deze game heb je de \n rol van coordinator.";        
        }
        else if (DT == Surfer.class){
            message = "In deze game is het de \n bedoeling dat  je rotsen \n vermijdt en prijzen oppakt. \n Dit simuleert het open \n houden van de vaargeul";        
        }

        GreenfootImage image = new GreenfootImage(message, 28, Color.black, null);
        return image;
    }

}
