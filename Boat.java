import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Boat here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Boat extends Actor
{
    private int size;
    private int speed;
    private int slow = 1;
    private boolean leeg = false;
    private int spawnCounter = 0;  
    private int id;
    private int time;
    private Exit exit;
    private Score score;

    public void act() {
        MoveBoat();
        MoveMouse();
        ExitHarbor(time);
        Dock();

        if(!Colission()){
            Exit(exit);
        }

    }
    
    private void crashedBoat()
    {
        Game1 game1world = (Game1) getWorld();
        Counter counter = game1world.getCounter();
        counter.bumpCount(1);
    }
    
    public Boat(int newSize, int i, int t, Exit out) {
        size = newSize;
        id = i;
        exit = out;
        time = t;
        setImage(id);
    }
    //boat gemaakt met size 10 id 1 en time 700
    public void setImage(int i) {
        if (!leeg) {
            setImage(new GreenfootImage("Boat"+i+".png"));
        }
        else {
            setImage(new GreenfootImage("Boatleeg"+i+".png"));
        }
    }

    public void MoveBoat() {
        move(-slow);
        if (getX() <=  300 && getY() == 61) {
            for(int i = 0; i <= 90; i++) {
                setRotation(-i);
                setLocation(getX() - slow, getY());
            }

        }
    }

    public void MoveMouse() {
        if (Greenfoot.mouseDragged(this) == true){
            MouseInfo mouse = Greenfoot.getMouseInfo();

            if (leeg){
                setLocation(getX(), mouse.getY());
            }
            else {
                setLocation(mouse.getX(),getY());
            }
        }
    }

    public boolean Colission() {
        Actor haven = getOneIntersectingObject(HavenGame1.class);
        Actor boat = getOneIntersectingObject(Boat.class);
        if (haven != null || boat != null) {
            World world;
            world = getWorld();
            crashedBoat();
            world.removeObject(this);
            return true;
        } 
        else{
            return false;
        }
    }

    public void ExitHarbor(int k)    
    {  
        if (isTouching(ColissionDock.class)){
            if (spawnCounter > k) {  
                spawnCounter = 0;
                GoToExit();
                leeg = true;
                setImage(id);
                slow = 2;
            }
            spawnCounter++;
        }

    }  

    public void Exit(Exit out) {
        World world;
        world = getWorld();
        Actor boat = getOneIntersectingObject(Exit.class);          
        if (boat == out){
            scoreUp();
            world.removeObject(this);
        }
        else if (isTouching(Exit.class)){
            world.removeObject(this);
        }
    }

    public void GoToExit() {
        slow = 1;
        setLocation(getX(), getY() - 100);
        setRotation(180); 
    }

    public void Dock() {
        Actor boats = getOneIntersectingObject(ColissionDock.class);
        if (boats != null){
            slow = 0;
        }

    }

    public void scoreUp()
    {
        Game1 game1World = (Game1) getWorld();  
        Score score = game1World.getScore();  
        score.addScore(size);
    }

 
}
