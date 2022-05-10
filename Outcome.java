public class Outcome{
  int choice;
  public Outcome(int choice){
    this.choice = choice;
  }
  public String toString(int choice){
    if (choice == 0) return "attack";
    if (choice == 1) return "block";
    if (choice == 2) return "grab";
    else return "error";
  }
  public String maybeWork(){
    if (0 == 0) return "piss";
    else return "error";
  }
  
}