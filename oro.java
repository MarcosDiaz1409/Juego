import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class oro here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class oro extends Actor
{
    MiMundo mundo;
    /**
     * Act - do whatever the oro wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        image();
        
        if(isTouching(adventurer.class))
        {
            Greenfoot.playSound("oro.wav");
            getWorld().removeObject(this);
            mundo.puntos = mundo.puntos + 3;
        }
    }
    
    public void image()
    {
        GreenfootImage image = getImage();
        image.scale(30,30);
        setImage(image);
    }
}
