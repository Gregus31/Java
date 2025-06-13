import java.util.Random;

public class Weapon {
    private final int minDamage; 
    private final int maxDamage;
    public Weapon (int minDamage, int maxDamage) {
        this.minDamage = minDamage;
        this.maxDamage= maxDamage;
    }
    public int RollDamage(){
        Random randomNumbers = new Random();
        return randomNumbers.nextInt(minDamage,maxDamage);
    }
}