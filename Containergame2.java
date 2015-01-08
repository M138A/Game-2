import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.List;
/**
 * Write a description of class Container here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Containergame2 extends Vehicle
{
    private final String bigContainerDarkImagePath = "images/Small/big-dark-empty.png";
    private final String bigContainerLightImagePath = "images/Small/big-light-empty.png";
    private final String smallContainerDarkImagePath = "images/Small/small-dark-empty.png";
    private final String smallContainerLightImagePath = "images/Small/small-light-empty.png";
    private final String bigContainerDarkImageFullPath = "images/Small/big-dark.png";
    private final String bigContainerLightImageFullPath = "images/Small/big-light.png";
    private final String smallContainerDarkImageFullPath = "images/Small/small-dark.png";
    private final String smallContainerLightImageFullPath = "images/Small/small-light.png";
    /**
     * The speed of the container
     */
    public int speed = 1;
    /**
     * True when the container is loaded
     */
    public boolean loaded = false;
    /**
     * The type of the container
     */
    public int t;

    
    public Containergame2(){

        setContainer(getRandomContainerType());
    }
    /**
     * Sets the correct image for the container
     * 
     */
    public void setContainer(int type)
    {
        t = type;
        if(loaded == false){
            switch(type)
            {
                case 0: setImage(bigContainerDarkImagePath);
                break;
                case 1: setImage(bigContainerLightImagePath);
                break;
                case 2: setImage(smallContainerDarkImagePath);
                break;
                case 3: setImage(smallContainerLightImagePath);
                break;
            }
        }
        else{
            switch(type)
            {
                case 0: setImage(bigContainerDarkImageFullPath);
                break;
                case 1: setImage(bigContainerLightImageFullPath);
                break;
                case 2: setImage(smallContainerDarkImageFullPath);
                break;
                case 3: setImage(smallContainerLightImageFullPath);
                break;
            }
        }
    }
    /**
     * returns a random number for the container type
     */
    public int getRandomContainerType(){
        return Greenfoot.getRandomNumber(4);
    }

    public void act() 
    {
        if(isAtEdge() && checkLoadingState()){
            getWorld().removeObject(this);
            return;
        }
        if(atTruckStop())
        {
            return;
        }

        if(canAddTruck())
        {
            addTruck();
        }        
        if(getTruckState())
        {
            moveContainer();
            return;
        }
        
        if(checkLoadingState())
        {
            this.allowTruckToMove();
            getPullingTruck().allowTruckToMove();
            return;
        }
        
    }    
    /**
     * returns true when the container is loaded
     */
    public boolean checkLoadingState(){
        return loaded;
    }
    /**
     * Moves the container up at a certain speed
     */
    public void moveContainer()
    {
        this.setLocation(getX(), getY() - speed);
    }
    /**
     * Returns the truck that is pulling the container forward
     */
    private Truck getPullingTruck()
    {
        return (Truck) getWorld().getObjects(Truck.class).get(0);
    }
    /**
     * Stops the truck when the Y is 450 and the container is not loaded
     */
    private boolean atTruckStop()
    {
        if(getY() == 450 && !checkLoadingState()){
            Truck x = getPullingTruck();
            if(x != null)
            {
                stopTruck();
                x.stopTruck();
                return true;                
            }
            return false;
        }
        return false;

    }
    /**
     * Creates a new truck
     */
    private void addTruck()
    {
        Truck x = new Truck(4);
        getWorld().addObject(x,108,900);
    }
    /**
     * Returns true when a new truck is needed
     */
    private boolean canAddTruck()
    {
        if(getY() == 2){
            return true;
        }
        else{
            return false;
        }

    }
}
