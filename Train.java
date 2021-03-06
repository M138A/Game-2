import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Train here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Train extends Vehicle
{    
    public int speed = 1;

    /**
     * Act - do whatever the Train wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        moveTrain();
        requestNewWagon();
        if(trainHasToStop())
        {
            speed = 0;
        }
        if(allWagonsLoaded()){
            speed = 1;
        }
        if(isAtEdge())
        {

            addNewTrain();

        }
    }  

    /**
     * Adds a new train to the world when there are 3 or more containers on the ship
     */
    private void addNewTrain()
    {
        MiniGame2 game = (MiniGame2) getWorld();
        int sz = (game.getContainerList()).size();
        if(sz >= 3){
            Train t = new Train();
            getWorld().addObject(t,40,900);
            getWorld().removeObject(this);
        }
        else{
            getWorld().removeObject(this);
        }

    }

    /**
     * Creates a new wagon and adds it to the world
     */

    private void createNewWagon(int spawnPoint)
    {
        Containergame2 w = new Wagon((MiniGame2) getWorld());
        getWorld().addObject(w,40,900);
    }

    /**
     * Returns true when all the wagons are loaded
     */
    private boolean allWagonsLoaded()
    {
        boolean condition = true;
        java.util.List listOfWagons = getWorld().getObjects(Wagon.class);
        if(listOfWagons.size() > 0){
            for(int i = 0; i < listOfWagons.size(); i++)
            {
                Wagon x =(Wagon) listOfWagons.get(i);
                if(!x.checkLoadingState()){
                    condition = false;

                }

            }
            if(condition){
                //all wagons are loaded
                return true;
            }
            else{
                //not all wagons are loaded
                return false;
            }
        }
        else{
            //there are no containers
            return false;
        }
    }

    /**
     * Returns true when the train has arrived at it's stopping point
     */
    private boolean trainHasToStop(){
        if(getY() == 480)
        {
            return true;
        }
        else{
            return false;
        }
    }

    /**
     * Creates a new wagon if needed
     */
    private void  requestNewWagon()
    {
        if(getY() == 850)
        {
            createNewWagon(850);
        }
        else if(getY() == 750)
        {
            createNewWagon(750); 
        }
        else if(getY() == 650)
        {
            createNewWagon(650);
        }

    }

    /**
     * Moves the train at a certain speed
     */
    private void moveTrain()
    {
        setLocation(getX(), getY() - speed);
    }

}
