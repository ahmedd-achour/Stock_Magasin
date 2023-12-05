public  class Article implements Rendement {
    Article(double prixAchats,double prixVente,String Nom,String Fourniseur){
        this.prixVente=prixVente;
        this.prixAchats=prixAchats;
        this.Nom=Nom;
        this.Fourniseur=Fourniseur;

    }
    protected double prixAchats;
    protected double prixVente;
    protected String Nom;
    protected String Fourniseur;

    public void Rendement(){
        System.out.println((prixVente-prixAchats)/prixAchats);
    }
    protected void AffichageProduit(){
        System.out.println("ce produit "+Nom+" de fourniseur "+Fourniseur+" "+" prix d'achat est "+prixAchats+" prixVente est "+prixVente);
    }
}
