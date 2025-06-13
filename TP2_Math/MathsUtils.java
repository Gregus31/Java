public class MathsUtils {
    public static int PGCD(int a, int b){
        int i = 1;
        if (a>=b){
            i = b;
            while (i>0) {
                i--;
                if (b%i==0){
                    if (a%i==0){
                        return i;
                    }
                }
            }
        }
        else{
            i=a;
            while (i>0) {
                i++;
                if (b%i==0){
                    if (a%i==0){
                        return i;
                    }
                }
            }
        }
        i=0;
        assert i !=0;
        return i;
    }
    public static void main(String[] args) {
        System.out.println(PGCD(13,50));
 }
}

