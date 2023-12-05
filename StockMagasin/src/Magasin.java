public class Magasin implements Description,Rendement{
    public double deponces;
    public double Revenue;
    public double RevenueNet;
public ElectroMenagers[] ProduitsEM;
    public Primeurs[] ProduitsPr;
    Magasin(ElectroMenagers[] ProduitsEM,Primeurs[] ProduitsPr){
        this.ProduitsEM=ProduitsEM;
        this.ProduitsPr=ProduitsPr;
    }
   public void Description(){
        System.out.println("------------------------debut description Magasin-----------------------------");
        System.out.println("Nos produits Electromenagers: ");
        for(ElectroMenagers E:ProduitsEM){
            E.Description();
            System.out.print("taux rendement de sce produit: ");
            E.Rendement();
        }
        System.out.println("Nos Produits Primeurs: ");
        for(Primeurs E:ProduitsPr){
            E.AffichageProduit();
            System.out.println("taux rendement de se produit: ");
            E.Rendement();
        }

        System.out.println("------------------------fin description Magasin-----------------------------");
    }
    double TRT;
    public void Rendement(){
for(Primeurs p:ProduitsPr){
    TRT+=(p.prixVente-p.prixAchats)/p.prixAchats;
}
        for(ElectroMenagers E:ProduitsEM){
            TRT+=(E.prixVente-E.prixAchats)/E.prixAchats;
        }
        System.out.println("le taux du rendement Totale est: "+TRT/(ProduitsEM.length+ProduitsPr.length));
    }

}
