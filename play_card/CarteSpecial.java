package play_card;

public class CarteSpecial extends Carte {
private final String effet;
public CarteSpecial(String nom, String effet) {
super(nom, 0);
this.effet = effet;
}
@Override
public String toString() {
    return new String(nom + effet);
}
@Override
public void jouer() {
System.out.println("J'active l'effet : " + effet);
}
}
