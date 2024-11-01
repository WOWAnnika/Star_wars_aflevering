public class Droid extends Character {
    public Droid(String name, int age) {
        super(name, age);
    }
    @Override
    public void action () {
        System.out.println("\n" + name + " is truly just trying their best.");
    }
}
