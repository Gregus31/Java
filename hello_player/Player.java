public class Player {

 private final String name;
 private int hp;

 public Player(String name) {
 this.name = name;
 this.hp = 100;
 }

 public void greet() {
 System.out.println("Bonjour, je suis "
+ name + " !");
 }

 public void takedamage(int dm){
   
   assert this.isAlive() :"Le player " + name + " aurait du etre KO, ne peut donc pas reprendre de degats"; // faux →AssertionError si -ea
    this.hp=this.hp-dm;
 }

  public void HP() {
 System.out.println("J'ai "
+ hp + " points de vie !");
 }
 public boolean isAlive() {
    return ((this.hp>0));
 }
 public static void main(String[] args) {
 Player p = new Player("Greg");
 p.greet();
 p.HP();
 p.takedamage(15);
 p.HP();
 System.out.println(p.isAlive());
 p.takedamage(85);
 System.out.println(p.isAlive());
 p.takedamage(22);
 p.HP();
 Player bob = new Player("Bob");
bob.takedamage(85);
assert bob.isAlive(); // doit être vrai → Bob survit
bob.takedamage(14);
assert !bob.isAlive() : "Bob aurait pas du etre KO"; // faux →AssertionError si -ea
 }
}
