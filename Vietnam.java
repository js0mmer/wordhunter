import greenfoot.*;

public class Vietnam extends World
{
    public static int enemiesDefeated;
    public int shooters = 0;
    private int waveDelay = 2;
    private int time = 0;
    public int score = 0;
    public static int grenadeCount = 1;
    public static int grenade1Progress;
    public static int grenade2Progress;
    public static int reloadGrenade;
    private int grenadeDelay = 0;

    public Vietnam()
    {    
        super(1000, 600, 1);

        setStaticVariables();

        Soldier soldier = new Soldier();
        addObject(soldier, 500, 300);

        HealthBar healthBar = new HealthBar();
        addObject(healthBar,948,15);
        StatusBar statusBar = new StatusBar();
        addObject(statusBar,900,15);

        GrenadeAmmo grenadeAmmo1 = new GrenadeAmmo();
        addObject(grenadeAmmo1,865,15);
        GrenadeAmmo grenadeAmmo2 = new GrenadeAmmo();
        addObject(grenadeAmmo2,885,15);
        GrenadeAmmoPLH grenadeAmmoPLH1 = new GrenadeAmmoPLH();
        addObject(grenadeAmmoPLH1,865,15);
        GrenadeAmmoPLH grenadeAmmoPLH2 = new GrenadeAmmoPLH();
        addObject(grenadeAmmoPLH2,885,15);
        GrenadeAmmoProgress grenadeAmmoProgress1 = new GrenadeAmmoProgress();
        addObject(grenadeAmmoProgress1,865,3);
        GrenadeAmmoProgress grenadeAmmoProgress2 = new GrenadeAmmoProgress();
        addObject(grenadeAmmoProgress2,885,3);

        sceneSetup();

        spawnEnemyAllSides();

        setPaintOrder(Gameover.class,Reloading.class,GrenadeAmmoPLH.class,GrenadeAmmoProgress.class,GrenadeAmmo.class,HealthBar.class,
        StatusBar.class,Explosion.class,JungleSetup.class,Rock.class,IndicateAttack.class,Enemy.class,Soldier.class,Medkit.class);

        score(0);
    }

    public void setStaticVariables()
    {
        enemiesDefeated = 0;
        ActorMethods.health = 3;
        ActorMethods.getSoldierX = 500;
        ActorMethods.getSoldierY = 300;
        ActorMethods.getSoldierRotation = 0;
        grenadeCount = 1;
        reloadGrenade = 50;
        grenade1Progress = 50;
        grenade2Progress = 50;
        GrenadePath.rotation = 0;
    }

    public void act()
    {
        if(enemiesDefeated>waveDelay)
        {
            spawnEnemyWave(Greenfoot.getRandomNumber(8)+1);
            waveDelay=waveDelay+Greenfoot.getRandomNumber(2)+2;
        }
        time++;

        score(0);

        displayGrenades();
    }
    
    public void enemyAttack(int shooter)
    {
        if(shooters<2) shooters += shooter;
    }

    public void sceneSetup()
    {
        PlantC plant15 = new PlantC();
        addObject(plant15,800,585);
        plant15.setRotation(180);
        plant15.image.mirrorHorizontally();
        PlantB plant10 = new PlantB();
        addObject(plant10,835,565);
        plant10.setRotation(170);
        PlantC plant13 = new PlantC();
        addObject(plant13,75,575);
        plant13.setRotation(180);
        PlantB plant12 = new PlantB();
        addObject(plant12,50,575);
        plant12.setRotation(210);
        PlantB plant14 = new PlantB();
        addObject(plant14,250,575);
        plant14.setRotation(-15);
        PlantD plant11 = new PlantD();
        addObject(plant11,425,585);
        plant11.setRotation(60);
        PlantD plant16 = new PlantD();
        addObject(plant16,30,420);
        plant16.setRotation(90);
        PlantD plant17 = new PlantD();
        addObject(plant17,15,315);
        plant17.image.mirrorVertically();
        plant17.setRotation(260);
        plant17.image.scale(150,200);
        PlantB plant18 = new PlantB();
        addObject(plant18,0,190);
        plant18.image.scale(200,150);
        PlantB plant19 = new PlantB();
        addObject(plant19,50,30);
        plant19.setRotation(-25);
        PlantC plant21 = new PlantC();
        addObject(plant21,220,10);
        plant21.image.scale(240,100);
        PlantA plant20 = new PlantA();
        addObject(plant20,200,25);
        plant20.image.scale(125,125);
        plant20.setRotation(310);
        PlantA plant1 = new PlantA();
        addObject(plant1,25,100);
        PlantA plant2 = new PlantA();
        addObject(plant2,25,275);
        plant2.setRotation(150);
        PlantA plant3 = new PlantA();
        addObject(plant3,25,475);
        plant3.setRotation(45);
        PlantA plant4 = new PlantA();
        addObject(plant4,350,575);
        PlantA plant5 = new PlantA();
        addObject(plant5,950,575);
        plant5.setRotation(30);
        plant5.image.scale(175,175);
        PlantA plant6 = new PlantA();
        addObject(plant6,975,250);
        PlantA plant7 = new PlantA();
        addObject(plant7,925,25);
        PlantA plant8 = new PlantA();
        addObject(plant8,700,25);
        PlantA plant9 = new PlantA();
        addObject(plant9,250,25);
        plant9.setRotation(215);
    }

    public void displayGrenades()
    {
        if(reloadGrenade>=50)
        {
            grenadeCount=1;
            if(reloadGrenade>=100)
            {
                grenadeCount=2;
            }
        }
        else grenadeCount=0;
        if(reloadGrenade<100 && grenadeDelay>=7)
        {
            reloadGrenade++;
            grenadeDelay=0;
        }
        if(reloadGrenade<50) grenade1Progress=50-reloadGrenade;
        else if(reloadGrenade>=50) grenade1Progress=1;
        if(reloadGrenade<=50) grenade2Progress=50;
        else if(reloadGrenade==100) grenade2Progress=1;
        else if(reloadGrenade>50) grenade2Progress=100-reloadGrenade;
        grenadeDelay++;
    }

    public void score(int points)
    {
        score=score+points;
        showText("Score: "+ score,60,20);
    }

    public void spawnEnemyWave(int waveType)
    {
        if(waveType==0) spawnEnemyAllSides();
        for(int i=0; i<3; i++)
        {
            if(waveType==1||waveType==2) spawnEnemyTop();
            if(waveType==3||waveType==4) spawnEnemyBottom();
            if(waveType==5||waveType==6) spawnEnemyLeft();
            if(waveType==7||waveType==8) spawnEnemyRight();
        }
    }

    public void spawnEnemyTop()
    {
        EnemySpawn enemySpawn = new EnemySpawn();
        addObject(enemySpawn, 50+Greenfoot.getRandomNumber(900),0);
    }

    public void spawnEnemyBottom()
    {
        EnemySpawn enemySpawn = new EnemySpawn();
        addObject(enemySpawn, 50+Greenfoot.getRandomNumber(900), 600);
    }

    public void spawnEnemyLeft()
    {
        EnemySpawn enemySpawn = new EnemySpawn();
        addObject(enemySpawn, 0, 50+Greenfoot.getRandomNumber(500));
    }

    public void spawnEnemyRight()
    {
        EnemySpawn enemySpawn = new EnemySpawn();
        addObject(enemySpawn, 1000, 50+Greenfoot.getRandomNumber(500));
    }

    public void spawnEnemyAllSides()
    {
        spawnEnemyTop();
        spawnEnemyBottom();
        spawnEnemyLeft();
        spawnEnemyRight();
    }
}
