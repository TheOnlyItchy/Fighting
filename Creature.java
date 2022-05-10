public class Creature{
  public int attackPwr;
  public int health;
  public String name;
  //a enemy has, Attack pwr, health
  public Creature(int attackPwr, int health, String name){
    this.attackPwr = attackPwr;
    this.health = health;
    this.name = name;
    

    
    
  }
  public String attributes(){
    return "Attack: " +attackPwr+ "\nHealth: "+health+"\nName: "+name;
  }
  public int health(){return health;}
  public int attackPwr(){return attackPwr;}
}