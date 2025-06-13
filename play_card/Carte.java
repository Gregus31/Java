package play_card;
public abstract class Carte {
protected final String nom;
protected final int valeur;
public Carte(String nom, int valeur) {
this.nom = nom;
this.valeur = valeur;
}
public abstract void jouer();

public static void main(String[] args) {
        Carte[] main = new Carte[3];
main[0] = new CarteChiffre("Coeur", 7);
main[1] = new CarteSpecial("Joker", "Change la couleur");
main[2] = new CarteChiffre("Pique", 1);
for (Carte c : main) {
c.jouer();
}
}
}