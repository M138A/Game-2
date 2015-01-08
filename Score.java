import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.awt.Color;
import java.util.List;
/**
 * Write a description of class Score here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Score extends Actor
{
    int score = 0;
    boolean gameIsDone;
    /**
     * Act - do whatever the Score wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public Score ()
    { 
        setImage(new GreenfootImage("Score : 0", 20, Color.WHITE, Color.BLACK));
    }
    public void act() {
            if (gameIsDone == true){
                 World world =  getWorld();
                 world.addObject (new GameOver("Won.png"),900/2,900/2);
                 world.addObject (new BackButton("win"),450,667);
                 gameIsDone = false;
            }
    }
    public void addScore(int points) {
        score += points;
        setImage(new GreenfootImage("Score : " + score, 24, Color.WHITE, Color.BLACK));
        if (score >= 120)
        {
            gameIsDone = true;
        }
    }

}
