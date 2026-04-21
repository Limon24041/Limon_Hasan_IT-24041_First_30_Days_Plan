class Animal {
      String name, sound;
  }

  public class Test {
      public static void main(String[] args) {

          Animal animal1 = new Animal();
          Animal animal2 = new Animal();

          animal1.name = "Tiger";
          animal1.sound = "Halum-halum";

          animal2.name = "Cow";
          animal2.sound = "Hambah-hambah";

          System.out.println(
              animal1.name + "_ " + animal1.sound + "\n" + animal2.name + "_ " + animal2.sound );
      }
  }
