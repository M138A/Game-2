import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.ArrayList.*;
/**
 * Write a description of class Exit here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Exit extends Actor
{
    private String color;
    private int points;
    
    /**
     * Act - do whatever the Exit wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public Exit(String kleur) {
        color = kleur;
        setImage(kleur);
    }
    public void setImage(String kleur) {
        setImage(new GreenfootImage("exit"+kleur+".png"));
    }
}

         