
public class Main {
  public static void main(String[] args) {
    Human kinjal = new Human(25, "kinjal", 15000, false);
    Human kriisha = new Human(55, "krishha", 13000, true);
    Human williaam = new Human(65, "Williaam", 20000, true);
    Human renee = new Human(35, "renee", 25000, false);

    System.out.println(kinjal.name);
    System.out.println(kriisha.population);
    Main funn = new Main();
    funn.fun2();
  }
  
  static void fun() {
    Main obj = new Main();
    obj.greeting();
  }

  void fun2() {
    greeting();
  }

  void greeting() {
    System.out.println("greetings");
  }
}
