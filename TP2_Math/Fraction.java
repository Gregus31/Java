public class Fraction {
    private final int num; // numérateur
    private final int den; // dénominateur (>0)

    public Fraction(int num, int den) {
        assert den!=0:"Le dénominateur ne peut pas etre nul";
        if (den<0){
            num=-num;
            den=-den;
        }
        int pgcd=MathsUtils.PGCD(num, den);
        this.num=num/pgcd;
        this.den=den/pgcd;
    }
    public Fraction add(Fraction a){
        int nouveauNum = this.num * a.den + a.num * this.den;
        int nouveauDen = this.den * a.den;
        return new Fraction(nouveauNum, nouveauDen);
    }
    public Fraction multiply(Fraction a){
        int nouveauNum = this.num * a.num;
        int nouveauDen = this.den * a.den;
        return new Fraction(nouveauNum, nouveauDen);
    }
    public double toDouble() {
        return (double) num / den;
    }
    @Override
    public String toString() {
        return num + "/" + den;
    }
    public int compareTo(Fraction a) {
    int res = this.num * a.den - a.num * this.den;
    if (res>0){
        System.out.println(this.toString() + " est superieur a " + a.toString());
        return 1;
    }
    if (res<0) {
        System.out.println(this.toString() + " est inferieur a " + a.toString());
        return -1;
    }
    else{
        System.out.println(this.toString() + " est egale a " + a.toString());
        return 0;
    }
}


    public static void main(String[] args) {
        Fraction f = new Fraction(2, 3);
        Fraction g = new Fraction(1, 6);
        System.out.println(f.add(g).toString());
        System.out.println(f.multiply(g).toString());
        System.out.println(f.compareTo(f));
        assert f.add(g).toString().equals("5/6"):"C'est pas le bon résultat";
        assert f.multiply(g).toString().equals("1/9"):"C'est pas le bon résultat";
    }
}