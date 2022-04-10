/**
 *Mustafa Ahmed
 * October 14, 2020
 * Object interaction
 */
import java.io.*;
public class BallGame 
{
 public static void main(String[] args) throws IOException
 {
     BufferedReader myInput = new BufferedReader (new InputStreamReader(System.in));
     
    Simulation();//run simulation
   
 }   
 
 /******************************************MAIN GAME CODE****************************************/
 
 public static void Simulation() throws IOException
 {
      BufferedReader myInput = new BufferedReader (new InputStreamReader(System.in));
     
     int intPlayerScore=0, intCompScore=0;//count the 3 points for player and computer
     
     //game variables
     int intRandomScoreNum=0;
     int intRandomPlayerShot=0;
     int intRandomCompShot=0;
     
     boolean blnNextRound = false;//determine if user gets to go to next round
     boolean blnFinalRound=false;//determine  if user makes it to champion rouns
     boolean blnChamp=false;//dtermine if user wins championship
     
     System.out.println("3-POINT SIMULATION GAME\n");//title
     
     System.out.println("Rules: Get 3 scores before your opponent and move on to the next round. Press enter to continue.");
     System.in.read();
     
     System.out.print("Enter your player name: ");//prompt for name
     String strPlayerName = myInput.readLine();
     
     BasketBallPlayer user = new BasketBallPlayer(strPlayerName);//insntiate the user a character
     
     //output the user's stats
     System.out.println("\nYour character summary:\n");
     System.out.println("Name: "+user.getName());
     System.out.println("Age: "+user.getAge());
     System.out.println("Height : "+user.getHeight()+" in");
     System.out.println("Weight : "+user.getWeight()+" lbs");
     System.out.println("Shooting Ability: "+user.getShootAbility());//user's chance at scoring
     System.in.read();
    
     
     /***************************************************ROUND 1 CODE****************************************************************/
     
     BasketBallPlayer Thomas = new BasketBallPlayer("Thomas");//first  opponent named thomas
     
     Thomas.setShootAbility(50);//thomas has 50% chance at scoring (does not use shooting ability calculation so first round is beatable most of the time)
     
     //output Thomas' stats
     System.out.println("\nYour first opponent:\n");
     System.out.println("Name: Thomas");
     System.out.println("Age: "+Thomas.getAge());
     System.out.println("Height: "+Thomas.getHeight()+" in");
     System.out.println("Weight: "+Thomas.getWeight()+" lbs");
     System.out.println("Shooting Ability: "+Thomas.getShootAbility()+"\n");
     System.out.println("Press enter to begin the round");
     System.in.read();
     
     
    
     while(intPlayerScore<4||intCompScore<4)//loop between player and thomas shots until someone scores 3 times
     {
        //PLAYER'S TURN
          intRandomScoreNum = (int) (Math.random()*(100));//randomize winning range
          //System.out.println(intRandomScoreNum); for testing
         
         intRandomPlayerShot = (int) (Math.random()*(user.getShootAbility()));//randomize a number for player's attempt based on their shooting ability
         System.out.println(strPlayerName+" took a shot...");//message
         System.in.read();
         
         if(intRandomScoreNum<=user.getShootAbility())//user's shooting ability acts as a probability spinner in comparison to the scoring number
         {
             System.out.println(strPlayerName+" Scored!");
             intPlayerScore++;
             System.in.read();
             
            if(intPlayerScore == 3)//check if player won the round with 3 scores
            {
             System.out.println(strPlayerName+" has beat thomas and will move on to the next round");
             blnNextRound = true;//player moves on to next round
             
             //reset score for next round
             intPlayerScore=0;
             intCompScore=0;
             
             System.in.read();
             break;
            }
         }
         else//if player did not score 
         {
             System.out.println(strPlayerName+" Missed");
             System.in.read();
         }
         
         //THOMAS' TURN
         
            intRandomScoreNum = (int) (Math.random()*(100));//randomize winning range again
            //System.out.println(intRandomScoreNum); for testing
            
            intRandomCompShot = (int) (Math.random()*(Thomas.getShootAbility()));//randomize thomas prbability of getting shot based on his shooting ability
            System.out.println("Thomas took a shot... ");
            System.in.read();
            
            if(intRandomScoreNum<=Thomas.getShootAbility())//if thomas shot lands within scoring range
            {
                System.out.println("Thomas scored!");//message
                intCompScore++;//add to opponent score
                System.in.read();
                
              if(intCompScore == 3)//check if thomas won
              {
               System.out.println("Thomas won... "+strPlayerName+" was eliminated (Game Over)");//game ends becuasue user was eliminated
               
               //reset scores if user decides to play again
               intCompScore = 0;
               intPlayerScore=0;
               break;
              }
            }
            else //if thomas shot does not land within scoring range
            {
                System.out.println("Thomas missed.");
                System.in.read();
            }
       
     }
     
     /******************************************ROUND 2 CODE****************************************/
     
     if(blnNextRound==true)//if player beats first round they proceed to second round
     {
       
         
       BasketBallPlayer Larry = new BasketBallPlayer("Larry");//instantiate second  opponent named Larry
     
       Larry.setShootAbility(60);//Larry has 60% chance at scoring (does not use shooting ability calculation so second round is still consistently beatable)
     
       //output Larry's stats
       System.out.println("\nYour next opponent:\n");
       System.out.println("Name: Larry");
       System.out.println("Age: "+Larry.getAge());
       System.out.println("Height: "+Larry.getHeight()+" in");
       System.out.println("Weight: "+Larry.getWeight()+" lbs");
       System.out.println("Shooting Ability: "+Larry.getShootAbility()+"\n");
       System.out.println("Press enter to begin the round");
       
       System.in.read();
       
       while(intPlayerScore<4||intCompScore<4)//loop between player and larry shots until someone scores 3 times
     {
        //PLAYER'S TURN
        
          intRandomScoreNum = (int) (Math.random()*(100));//randomize winning range
          //System.out.println(intRandomScoreNum);for testing
         
         intRandomPlayerShot = (int) (Math.random()*(user.getShootAbility()));//randomize a number for player's attempt based on their shooting ability
         System.out.println(strPlayerName+" took a shot...");//message
         System.in.read();
         
         if(intRandomScoreNum<=user.getShootAbility())//user's shooting ability acts as a probability spinner in comparison to the scoring number
         {
             System.out.println(strPlayerName+" Scored!");
             intPlayerScore++;
             System.in.read();
             
            if(intPlayerScore == 3)//check if player won the round with 3 scores
            {
             System.out.println(strPlayerName+" has beat Larry and will move on to the next round");
             blnFinalRound = true;//player moves on to next round
             
             //reset score for next round
             intPlayerScore=0;
             intCompScore=0;
             
             System.in.read();
             break;
            }
         }
         else//if player did not score 
         {
             System.out.println(strPlayerName+" Missed");
             System.in.read();
         }
         
         //LARRY'S TURN
         
            intRandomScoreNum = (int) (Math.random()*(100));//randomize winning range again
            //System.out.println(intRandomScoreNum); for testing
            
            intRandomCompShot = (int) (Math.random()*(Larry.getShootAbility()));//randomize larry prbability of getting shot based on his shooting ability
            System.out.println("Larry took a shot... ");
            System.in.read();
            
            if(intRandomScoreNum<=Larry.getShootAbility())//if Larry shot lands within scoring range
            {
                System.out.println("Larry scored!");//message
                intCompScore++;//add to opponent score
                System.in.read();
                
              if(intCompScore == 3)//check if larry won
              {
               System.out.println("Larry won... "+strPlayerName+" was eliminated (Game Over)");//game ends becuasue user was eliminated
               
               //reset scores if user decides to play again
               
               intCompScore = 0;
               intPlayerScore=0;
               break;
              }
            }
            else //if larry shot does not land within scoring range
            {
                System.out.println("Larry missed.");
                System.in.read();
            }
       
       }
       
       
    }
     
     /*******************************************FINAL ROUND CODE***********************************************************/
     
    if(blnFinalRound==true)//if player passed first and second round
    {
        
         
       BasketBallPlayer Curry = new BasketBallPlayer("Stephen Curry",73,185,32,80);//instantiate the finale opponent stephen curry. uses his measurements according to his NBA profile
       
     //Curry has 80% chance at scoring (does not use shooting ability calculation so that curry is guaranteed to be best shooter and hardest to beat)
     
       //output Curry's stats
       System.out.println("\nTHE CHAMPIONSHIP ROUND\n");
       System.out.println("\nYour opponent:\n");
       System.out.println("Name: Stephen Curry");
       System.out.println("Age: "+Curry.getAge());
       System.out.println("Height: "+Curry.getHeight()+" in");
       System.out.println("Weight: "+Curry.getWeight()+" lbs");
       System.out.println("Shooting Ability: "+Curry.getShootAbility()+"\n");
       System.out.println("Press enter to begin the round");
       
       System.in.read();
       
       while(intPlayerScore<4||intCompScore<4)//loop between player and curry shots until someone scores 3 times
     {
        //PLAYER'S TURN
        
          intRandomScoreNum = (int) (Math.random()*(100));//randomize winning range
          //System.out.println(intRandomScoreNum); fo testing
         
         intRandomPlayerShot = (int) (Math.random()*(user.getShootAbility()));//randomize a number for player's attempt based on their shooting ability
         System.out.println(strPlayerName+" took a shot...");//message
         System.in.read();
         
         if(intRandomScoreNum<=user.getShootAbility())//user's shooting ability acts as a probability spinner in comparison to the scoring number
         {
             System.out.println(strPlayerName+" Scored!");
             intPlayerScore++;
             System.in.read();
             
            if(intPlayerScore == 3)//check if player won the round with 3 scores
            {
             System.out.println(strPlayerName+" has beat Stephen Curry and is the new champion!");
             blnChamp = true;//for alternate ending message
             
             //reset score for next round
             intPlayerScore=0;
             intCompScore=0;
             
             System.in.read();
             break;
            }
         }
         else//if player did not score 
         {
             System.out.println(strPlayerName+" Missed");
             System.in.read();
         }
         
         //CURRY'S TURN
         
            intRandomScoreNum = (int) (Math.random()*(100));//randomize winning range again
            
            //System.out.println(intRandomScoreNum); for testing
            
            intRandomCompShot = (int) (Math.random()*(Curry.getShootAbility()));//randomize larry prbability of getting shot based on his shooting ability
            System.out.println("Stephen Curry took a shot... ");
            System.in.read();
            
            if(intRandomScoreNum<=Curry.getShootAbility())//if Curry shot lands within scoring range
            {
                System.out.println("Stephen Curry scored!");//message
                intCompScore++;//add to opponent score
                System.in.read();
                
              if(intCompScore == 3)//check if curry won
              {
               System.out.println("Stephen Curry won and will remain as champion... Game over");//game ends becuasue user was eliminated
               
               //reset scores if user decides to play again
               intCompScore = 0;
               intPlayerScore=0;
               break;
              }
            }
            else //if curry shot does not land within scoring range
            {
                System.out.println("Stephen Curry missed.");
                System.in.read();
            }
       
       }
       
    }
    
    if(blnChamp == true)//if player beat the champ
    {
        System.out.println("Congrats, you are the new champion of the 3-point simulation!\n");
        System.out.println("Would you like to play again?\n\n");//prompt user to play again once simulation is done
        System.out.print("Enter \"yes\" to play again or any other key to quit: ");
    }
    else
    {
     System.out.println("Would you like to play again?\n\n");//prompt user to play again once simulation is done
     System.out.print("Enter \"yes\" to play again or any other key to quit: ");
    }
     String strUserCoice=myInput.readLine().toUpperCase();
     
     if(strUserCoice.equals("YES"))//if user chooses to play again
     {
         System.out.println("\n\n\n\n\n");
         
         //reset conditions and scores
         intPlayerScore=0;
         intCompScore=0;
         
        blnNextRound=false;
        blnFinalRound=false;
        blnChamp=false;
        
         Simulation();//run simulation again
     }
     else
     {
         System.out.println("Thank you for playing");//ending message
     }
    
 }
}
