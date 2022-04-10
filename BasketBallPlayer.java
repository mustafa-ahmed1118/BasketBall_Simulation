public class BasketBallPlayer extends Person 
{
    int intShootAbility; //shooting ability of player

    
    public BasketBallPlayer(String name)
    {
     super(name);
     
     
     
     intShootAbility = (1000-this.getAge()-this.getHeight()-this.getWeight())/10;
     
     /*
     Reasoning for the way shooting calcualtion is done:
     
     * - older players typically perform worse than younger players in general
     * - Heavier players are less agaile and will consequently have a less effective jump shot 
     * - Taller players typicaly are not as good at shooting as shorter players
     
     * By being lighter, shorter and younger, you will be have a higher chance at scoring a 3 point shot based on the factors described above.
     
     * Example of comparison: Shaquille O'Neal (48 years old, 7 foot 1, 325 lb) would have a lower chance at scoring a 3 point shot than Stephen Curry (32 years old, 6 foot 3, 185 lbs)
     
     * This calculatin only applies to the player's character for the sake of consistency in difficulty between rounds
     
     */
     
    }
    
    public BasketBallPlayer(String name, int height, int weight, int age,int shootAbility)//overload for final oppoent
    {
     super(name,height,weight,age);
     
     this.intShootAbility = shootAbility;
     
    }
    
    public int getShootAbility()
    {
        return intShootAbility;
    }
    public void setShootAbility(int factor) //for setting shooting ability stat during run time
    {
        intShootAbility = factor;
    }
    
    
}
//ShotAbility = new Shooting(this.getAge(),this.getHeight(),this.getWeight());//player has a shot ability 
     //contains is not iside constructor array