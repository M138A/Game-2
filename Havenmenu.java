import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Hoofdmenu van de game
 * De volgorde in het menu is :
 * Links boven : Ship Controller
 * Rechts boven : Surfer
 * Link onder : Containeroverslag
 * Rechts onder : mechanic
 * 
 * @author (your name) 
 * @version (a version number or a date)
 * 
 */
public class Havenmenu extends World
{

    /**
     * Constructor for objects of class Haven.
     * 
     */
    public Havenmenu()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(900, 900, 1);     
        prepare();
    }

    /**
     * Prepare the world for the start of the program. That is: create the initial
     * objects and add them to the world.
     */
    private void prepare()
    {
        ShipController shipcontroller = new ShipController();
        addObject(shipcontroller, 304, 250);
        Surfer surfer = new Surfer();
        addObject(surfer, 596, 250);
        Container container = new Container();
        addObject(container, 304, 542);
        Mechanic mechanic = new Mechanic();
        addObject(mechanic, 596, 542);
        addObject(new isOFF(), 774, 786);

        InfoButton infobutton = new InfoButton();
        addObject(infobutton, 596, 786);
    }
   
 

}


