import greenfoot.GreenfootSound;
import greenfoot.World;





public class Shop
  extends World
{
  GreenfootSound shopmuzak = new GreenfootSound("ShopMusic.mp3");
  int time = 0;





  
  public Shop() {
    super(1200, 800, 1);
    prepare();
  }





  
  private void prepare() {
    AssaultRifle assaultRifle = new AssaultRifle();
    addObject(assaultRifle, 596, 113);
    HealthPotion healthPotion = new HealthPotion();
    addObject(healthPotion, 291, 584);
    Medicine medicine = new Medicine();
    addObject(medicine, 530, 585);
    PoisonBullets poisonBullets = new PoisonBullets();
    addObject(poisonBullets, 757, 590);
    Pistol pistol = new Pistol();
    addObject(pistol, 395, 441);
    Shotgun shotgun = new Shotgun();
    addObject(shotgun, 579, 296);
    Back2 back2 = new Back2();
    addObject(back2, 1039, 735);
    back2.setLocation(932, 728);
    BaconCountPreset baconCountPreset = new BaconCountPreset();
    addObject(baconCountPreset, 41, 765);
    ShopBaconCount1 shopBaconCount1 = new ShopBaconCount1();
    addObject(shopBaconCount1, 88, 768);
    ShopBaconCount2 shopBaconCount2 = new ShopBaconCount2();
    addObject(shopBaconCount2, 126, 767);
  }

  
  public void act() {
    if (this.time < 2)
    {
      this.shopmuzak.play();
    }
    this.time++;
    if (Back2.music == 1)
    {
      this.shopmuzak.stop();
    }
  }
}


