import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Game1 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Game1 extends World
{
    private Exit exit1 = new Exit("paars");
    private  Exit exit2 = new Exit("groen");
    private     Exit exit3 = new Exit("geel");
    private Score score;
    private Counter theCounter;
    public Score getScore() {
        return score;
    }
/*    private boolean checkIfGameOver() {
        if () {
            return true;
        }
        return false;
    }*/
    public Game1()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(900, 900, 1); 

        prepare();
    }

    public Counter getCounter()
    {
        return theCounter;
    }
    private int spawnCounter = 0;  
    private int spawnRateCounter = 0;  
    public void act() {     
        spawnRateCounter++;
        if( spawnRateCounter <= 700)
        {
        spawnRateSlow();
        } 
       else {
            spawnRateMedium();
        }

    }

    public void spawnRateSlow()
    {
        if (spawnCounter > 500) {  
            spawnCounter = 0;
            double spawnRandom = Math.random();
            if (spawnRandom <= 0.33)
            {
                Boat b1 = new Boat(30,1,600,exit1);
                addObject(b1,800,61);
            } else if (spawnRandom >= 0.33 && spawnRandom <= 0.66)
            {
                Boat b2 = new Boat(20,2,450,exit2);
                addObject(b2, 800, 61);
            } else 
            {
                Boat b3 = new Boat(10,3,300,exit3);
                addObject(b3, 800, 61);
            }
            spawnRandom = 0;
        }  
        spawnCounter++;  
    }
    
    public void spawnRateMedium()
    {
        if (spawnCounter > 300) {  
            spawnCounter = 0;
            double spawnRandom = Math.random();
            if (spawnRandom <= 0.33)
            {
                Boat b1 = new Boat(30,1,600,exit1);
                addObject(b1,800,61);
            } else if (spawnRandom >= 0.33 && spawnRandom <= 0.66)
            {
                Boat b2 = new Boat(20,2,450,exit2);
                addObject(b2, 800, 61);
            } else 
            {
                Boat b3 = new Boat(10,3,300,exit3);
                addObject(b3, 800, 61);
            }
            spawnRandom = 0;
        }  
        spawnCounter++;  
    }



    public void prepare()
    {
        // Exit exit1 = new Exit("paars");
        addObject(exit1, 885, 615);
        //   Exit exit2 = new Exit("groen");
        addObject(exit2, 885, 472);
        //  Exit exit3 = new Exit("geel");
        addObject(exit3, 885, 340);
        Dock dock1 = new Dock();
        addObject(dock1, 335, 825);
        Dock dock2 = new Dock();
        addObject(dock2, 127, 825);
        Dock dock3 = new Dock();
        addObject(dock3, 542, 825);
        Boat boat1 = new Boat(30,1,600,exit1);
        addObject(boat1, 500,61);
        HavenGame1 havencolission = new HavenGame1("havencolission");
        addObject(havencolission, 228, 825);
        HavenGame1 havencolission2 = new HavenGame1("havencolission");
        addObject(havencolission2,  22, 825);
        HavenGame1 havencolission3 = new HavenGame1("havencolission");
        addObject(havencolission3, 436, 825 );
        HavenGame1 havenfooter = new HavenGame1("havenfooter");
        addObject(havenfooter, 771, 827);
        ColissionDock colDock1 = new ColissionDock();
        addObject(colDock1, 539, 881);
        ColissionDock colDock2 = new ColissionDock();
        addObject(colDock2, 329, 881);
        ColissionDock colDock3 = new ColissionDock();
        addObject(colDock3, 126, 881);
        HavenGame1 rightbalk1 = new HavenGame1("rightbalk");
        addObject(rightbalk1, 885, 750);
        HavenGame1 rightbalk2 = new HavenGame1("rightbalk");
        addObject(rightbalk2, 885, 700);
        HavenGame1 rightbalk3 = new HavenGame1("rightbalk");
        addObject(rightbalk3, 885, 540);
        HavenGame1 rightbalk4 = new HavenGame1("rightbalk");
        addObject(rightbalk4, 885, 405);
        HavenGame1 rightbalk5 = new HavenGame1("rightbalk");
        addObject(rightbalk5, 885, 275);
        HavenGame1 rightbalk6 = new HavenGame1("rightbalk");
        addObject(rightbalk6, 885, 200);
        HavenGame1 havenbreak = new HavenGame1("havenbreak");
        addObject (havenbreak,612, 145);
        score = new Score();
        addObject(score, 840, 790);
        theCounter = new Counter();
        addObject(theCounter, 840, 820);
    }
}
