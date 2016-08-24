import static org.junit.Assert.*;
import org.junit.*;
import wizard_management.*;

public class WizardTest {

  Wizard wizard;
  Wizard wizardWithDragon;
  Broomstick broomstick;
  Dragon dragon;

  @Before
  public void before(){
    broomstick = new Broomstick("Nimbus", 10);
    dragon = new Dragon("Boris");
    wizard = new Wizard("Toby", broomstick);
    wizardWithDragon = new Wizard("Gandalf", dragon);
  }

  @Test
  public void hasName(){
    assertEquals("Toby", wizard.getName());
  }

  // @Test
  // public void hasBroomstick(){
  //   assertEquals("Nimbus", wizard.getBroomstick().getBrand());
  // }

  @Test
  public void hasSteed() {
    Flyable steed = wizardWithDragon.getSteed();
    Dragon original = (Dragon)steed;
    assertEquals("Boris", original.getName());
  }

  @Test
  public void canFly(){
    assertEquals(wizard.fly(),"mounting broom, running, skipping, flying!");
  }

  @Test
  public void canFlyDragon() {
    assertEquals(dragon.fly(), wizardWithDragon.fly());
  }
}