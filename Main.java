import java.util.Scanner;
import java.util.Random;
class Main {
  public static void main(String[] args) {
    //CREATE
    boolean battle = true;
    Scanner scn = new Scanner(System.in);
    Creature baddie = new Creature(1,12,"Grayson");
    Creature player = new Creature(2,20,"Hero");
    Random rand = new Random();
    

    System.out.println("Attack beats grab, grab beats block, block beats attack.");
    
    

    
    System.out.println("Jeepers! a wild "+baddie.name+" has appeared!");
    while (battle){
      
      
      System.out.println("YOUR MOVE [Health: "+player.health()+"]\n----------\n[0]Attack\n[1]Block\n[2]Grab");
      
      int playerChoice = scn.nextInt();
      int baddieChoice = rand.nextInt(3);
      Outcome pChoice = new Outcome(playerChoice);
      Outcome bChoice = new Outcome(baddieChoice);

      boolean playWinner = winner(playerChoice, baddieChoice);

      
      
      //check for the winner
      //player wins
      if(playWinner){
        System.out.println("You succesfully "+pChoice.toString(playerChoice)+" your opponet who tried to "+bChoice.toString(baddieChoice)+"\n");
        baddie.health -= player.attackPwr;
        
      }
        //ties
      else if(playerChoice == baddieChoice){
        System.out.println("You both clash at each other with a "+pChoice.toString(playerChoice)+"!\n");
      }
        //player lose
      else{
        System.out.println("Your opponet gets the better of you and counters your "+pChoice.toString(playerChoice)+" with a "+bChoice.toString(baddieChoice)+"!\n");
        player.health -= baddie.attackPwr;
      }
      
        
      
    

      if(baddie.health <= 0) battle = false;
    }
    
    
    
  }
  public static boolean winner(int play, int bad){
    if(play == 0 && bad == 2)return true;
    if(play == 1 && bad == 0)return true;
    if(play == 2 && bad == 1)return true;
    else{return false;}
  }
}
