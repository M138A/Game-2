import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Truck here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Truck extends Vehicle
{
    private final int speed = 1;
    private final String truckImagePath = "images/Small/truck.png";
    
    /**
     * Act - do whatever the Truck wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */   
    public Truck(int type){

        if (type == 4){
            setImage(truckImagePath);
        }

    }

    public void act()  
    {
        if(getTruckState()){
            moveTruck();    
        }
        spawnContainer();    
        if(isAtEdge())
        {
            getWorld().removeObject(this);
        }

    }    
    /**
     * Moves the truck at a certain speed
     */
    public void moveTruck() 
    {
        setLocation(getX(), getY() - speed);
    }
    /**
     * Adds a new contianer to the world when needed
     */
    private void spawnContainer()
    {
        if(getY() == 850){
            Containergame2 c = new Containergame2();
            getWorld().addObject(c,108,900);
        }
    }

}
