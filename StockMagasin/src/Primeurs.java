public class Primeurs extends  Article implements VendableParKilo{
    public double Stock;
    Primeurs(double prixAchats,double prixVente,String Nom,String Fourniseur){
        super(prixAchats,prixVente,Nom,Fourniseur);
    }
    public double Vendre(double qte){
        if(Stock>=qte){
            Stock-=qte;
            return qte*super.prixVente;
        }
        else {
            return 0;
        }
    }
    void  RemplirStock(double Stock){
        this.Stock=Stock;
    }
}
