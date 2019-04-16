import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MyWorld extends World
{

    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public MyWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(1000, 600, 1); 
        GreenfootImage bg = new GreenfootImage("background.png");
        bg.scale(getWidth(), getHeight());
        setBackground(bg);
        prepare();
    }

    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        try{
            Cactus cactus = new Cactus();
            Cactus cactus2 = cactus.clone();
            Cactus cactus3 = cactus.clone();
            addObject(cactus,75,315);
            addObject(cactus2,247,312);
            addObject(cactus3,444,311);
            Bird bird = new Bird();
            Bird bird2 = bird.clone();
            Bird bird3 = bird.clone();
            addObject(bird,100,231);
            addObject(bird2,234,231);
            addObject(bird3,500,231);
            Stones stones = new Stones();
            Stones stones2 = stones.clone();
            addObject(stones,343,348);
            addObject(stones2,164,276);
            stones.setLocation(367,257);
            CurrentScore currentScore = new CurrentScore(120,120);
            addObject(currentScore,500,100);
            cactus2.setLocation(307,319);
            cactus2.setLocation(301,319);
            cactus3.setLocation(475,313);
            Life life1 = new Life();
            addObject(life1,335,315);
            life1.setLocation(15,35);
            Life life2 = new Life();
            addObject(life2,335,315);
            life2.setLocation(45,35);
            Life life3 = new Life();
            addObject(life3,335,315);
            life3.setLocation(75,35);
            cactus3.setLocation(551,264);
            cactus2.setLocation(536,290);
            stones.setLocation(399,309);
            stones2.setLocation(433,285);
            stones2.setLocation(435,294);
            cactus.setLocation(217,280);
            cactus.setLocation(231,279);
            stones.setLocation(393,306);
            stones.setLocation(379,301);
            stones.setLocation(395,299);
            cactus2.setLocation(538,298);
            cactus2.setLocation(528,291);
            cactus2.setLocation(521,291);
            cactus3.setLocation(558,297);
            stones.setLocation(361,291);
            stones2.setLocation(395,288);
            cactus2.setLocation(557,294);
            cactus2.setLocation(538,294);
            cactus2.setLocation(538,294);
            cactus2.setLocation(543,296);
            cactus.setLocation(224,304);
            cactus2.setLocation(555,301);
            cactus2.setLocation(543,311);
            cactus2.setLocation(543,311);
            cactus2.setLocation(534,313);
            cactus2.setLocation(534,313);
            cactus2.setLocation(523,313);
            cactus2.setLocation(523,313);
            cactus2.setLocation(526,315);
            cactus.setLocation(205,304);
            cactus3.setLocation(573,283);
            cactus2.setLocation(535,295);
            cactus.setLocation(191,279);
            cactus2.setLocation(551,296);
            Dinosaur dinosaur = new Dinosaur();
            addObject(dinosaur,74,442);
            cactus.setLocation(287,286);
            stones.setLocation(439,287);
            stones.setLocation(433,285);
            stones.setLocation(433,286);
        }
        catch(CloneNotSupportedException e){
            e.printStackTrace();
        }
        Clouds clouds = new Clouds();
        addObject(clouds,156,82);
        clouds.act();
        Clouds clouds2 = new Clouds();
        addObject(clouds2,315,89);
        clouds2.setLocation(351,80);
        Food food = new Food();
        addObject(food,173,206);
        Food food2 = new Food();
        addObject(food2,530,206);
        Coin coin = new Coin();
        addObject(coin,273,205);
        coin.setLocation(272,186);
        Coin coin2 = new Coin();
        addObject(coin2,491,172);
        coin2.setLocation(577,189);
        food.setLocation(257,338);
        coin.setLocation(436,308);
        food2.setLocation(620,322);
        coin2.setLocation(804,321);
        coin2.setLocation(847,328);
        Clouds clouds3 = new Clouds();
        addObject(clouds3,884,172);
        clouds3.setLocation(729,76);
        Clouds clouds4 = new Clouds();
        addObject(clouds4,740,106);
        clouds3.setLocation(688,75);
        clouds2.setLocation(465,82);
        clouds4.setLocation(394,63);
        
    }
}
