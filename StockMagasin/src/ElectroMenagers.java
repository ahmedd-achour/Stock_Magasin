public class ElectroMenagers extends Article implements VendableParPiece,VenduEnSolde,Description{
    public int Stock=0;
    ElectroMenagers(double prixAchats,double prixVente,String Nom,String Fourniseur){
        super(prixAchats,prixVente,Nom,Fourniseur);
    }


    public double vendre(int qte){
        if(Stock>=qte){
            Stock-=qte;
            return qte*super.prixVente;
        }
        else {
            return 0;
        }

    }
    public void LanserSolde(double pourcentage){
        super.prixVente= (super.prixVente*(100-pourcentage))/100;
    }
    public void TerminerSolde(double pourcentage){
        super.prixVente= (super.prixVente*(100+pourcentage))/100;
    }
    public void  RemplirStock(int Stock){
        this.Stock=Stock;
    }
    public void Description(){
        super.AffichageProduit();
        System.out.print("le taux de rendement est: ");
        super.Rendement();


    }

}
