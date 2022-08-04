import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Completado here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Completado extends Actor
{
    /**
     * Act - do whatever the Completado wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        setImage(new GreenfootImage("Game Over", 48, Color.WHITE, Color.BLACK));
    }
}
