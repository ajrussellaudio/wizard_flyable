package wizard_management;

public class Wizard {
  String name;
  Flyable steed;

  public Wizard(String name, Flyable steed){
    this.name = name;
    this.steed = steed;
  }

  public String getName(){
    return this.name;
  }

  // public Broomstick getBroomstick(){
  //   return this.broomstick;
  // }

  public Flyable getSteed() {
    return this.steed;
  }

  public String fly(){
    return this.steed.fly();
  }

}