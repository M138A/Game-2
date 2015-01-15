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
    private boolean trainSet = false;
    private Train x;
    public Wagon(MiniGame2 x)
    {
        super(x);
    }
   
    /**
     * Act - do whatever the Wagon wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.  
        if(!trainSet){
            x=(Train) getWorld().getObjects(Train.class).get(0);
            System.out.println("method trainSet() executed");
            trainSet = true;
        }
        if(x.speed == 1 ){
            moveWagon();
        }
        if(isAtEdge())
        { 
            MiniGame2 mg2 = (MiniGame2) getWorld();
            mg2.setScore(score);
            mg2.showScore();
            getWorld().removeObject(this);     
       
        }
    }    
    /**
     * Returns true when the wagon has to stop
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
