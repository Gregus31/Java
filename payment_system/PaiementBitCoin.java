package payment_system;

public class PaiementBitCoin implements Paiement {
private String key;
private double solde;

    public PaiementBitCoin(String key, double solde) {
        this.key = key;
        this.solde = solde;
    }
@Override
    public boolean payer(double montant) {
        if (montant <= solde) {
            solde -= montant;
            return true;
        }
            return false;
    }
@Override
    public double getSolde() {
        return solde;
    }
@Override
    public String getType() {
        return "BitCoin" ;
    }
    
}
