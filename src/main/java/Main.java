
public class Main {

  public static void main(String[] args) {
    String argument1 = args[0];
    String argument2 = args[1];

    App app = new App(argument1, argument2);
    app.start();

    System.out.print(app.getThing());
  }

}
