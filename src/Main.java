import java.util.ArrayList;
public class Main {
    public static void main(String[] args) {
    // Min ArrayListe..<Character> får den vidst til at tage fra name og age fra superklasse
    ArrayList<Character> characters = new ArrayList<>();

    characters.add(new Jedi("Ahsoka Tano", 17));
    characters.add(new Sith("General Grievous", 30));
    characters.add(new Droid("C-3PO", 22));
    characters.add(new Sith("Darth Maul", 34));

    // magi der får den til at gennemgå min action og info om character..
        //det virker... men ikke en 'for' jeg har set før
    for (Character character : characters) {
        character.action();
        character.showInfo();
    }
    //OKAY, arrayliste indholder ting fra Character, character er navnet, characters er navnet på ArrayListe..
        //får den til at køre igennem Arraylisten og loopet stopper når den har kørt hele listen igennem
    for (Character character : characters) {
        if (character instanceof Jedi) {
            Jedi jedi = (Jedi) character;
            System.out.println("\n" + jedi.name + " is a jedi! being a good guy doing good stuff!");
        }
        else if (character instanceof Sith) {
            Sith sith = (Sith) character;
            System.out.println("\n" + sith.name + " is a bad guy! a villian doing cool bad guy stuff!");
        }
        else if (character instanceof Droid) {
            Droid droid = (Droid) character;
            System.out.println("\n" + droid.name + " is a robo guy and just wanna live");
        }
    }

    }
}