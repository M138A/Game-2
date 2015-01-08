import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Vehicle here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public abstract class Vehicle extends Actor
{
    public boolean truckCanMove = true;
    public boolean trainCanMove = true;
    /**
     * Returns the condition that regulates the truck movement
     */
    public boolean getTruckState()
    {
        return truckCanMove;
    }
    /**
     * Returns the condition that regulates the train movement
     */    
    public boolean getTrainState()
    {
        return trainCanMove;
    }
    /**
     * Stops the truck
     */    
    public void stopTruck()
    {
        truckCanMove = false;
    }
    /**
     * Allows the truck to move
     */  
    public void allowTruckToMove()
    {
        truckCanMove = true;
    }
    /**
     * Stops the train
     */      
    public void stopTrain()
    {
        trainCanMove = false;
    }
    /**
     * Allows the train to move
     */      
    public void allowTrainToMove()
    {
        trainCanMove = true;
    }
}
