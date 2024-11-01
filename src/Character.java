public class Character {
    protected String name;
    protected int age;

    //Dette er din konstruktør, void fucker det vidst op
    public Character(String name, int age) {
        this.name = name;
        this.age = age;
    }
    //methode, der sker noget her. handling!
    public void action() {
        System.out.println("En karakter gør noget!");
    }
    public void showInfo () {
        System.out.println("Navn: " + name + ", Alder: " + age);
    }
}
