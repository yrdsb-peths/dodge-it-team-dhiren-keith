import greenfoot.*;

public class MyWorld extends World {
    public MyWorld() 
    {
        super(600, 400, 1);
        
        Hero hero = new Hero();
        addObject(hero, 100, 100);
        
        Fish fish = new Fish();
        addObject(fish, 600, 100);
    }
}
