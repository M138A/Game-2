import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
/**
 * Write a description of class Wagon here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Wagon extends Containergame2
{    
    private int keepMoving ;
    private int stoppingMarker;
    private int speed = 1;

    public Wagon(int addedPosition)
    {
        stoppingMarker = addedPosition;
        setContainer(getRandomContainerType());

    }
    /**
     * Act - do whatever the Wagon wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.  
        Train x = (Train) getWorld().getObjects(Train.class).get(0);
        if(x.speed == 1 ){
            moveWagon();
        }
        if(isAtEdge())
        {
            getWorld().removeObject(this);     

        }
    }    
    /**
     * Checks if the wagon has arrived at it's stopping point
     */
    private boolean wagonHasToStop()
    {
        if(stoppingMarker == 850 && getY() == 550)
        {
            return true;
        }
        else if(stoppingMarker == 750 && getY() == 620)
        {
            return true;
        }
        else if (stoppingMarker == 650 && getY() == 690)
        {
            return true;
        }
        else{
            return false;
        }
    }
    /**
     * Moves the wagon at a certain speed
     */
    private void moveWagon()
    {
        setLocation(getX(), getY() - speed);
    }

 
   
}
