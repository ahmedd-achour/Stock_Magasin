import java.util.Scanner;

public class Test_ArticlesMagasin {
    public static void main(String[] args){


    //les champs de classe EM: double prixAchats,double prixVente,String Nom,String Fourniseur
   ElectroMenagers frigidaire=new ElectroMenagers(2400,3600,"frigidaire Condor","Amin");
   ElectroMenagers E=(ElectroMenagers)frigidaire;
    ElectroMenagers laveVesselles=new ElectroMenagers(1800,2200,"laveV LG","Asma");
    ElectroMenagers laveMachine=new ElectroMenagers(1200,1650,"lave Condor","Ahmed");
    //les champs du classe Primeurs: double prixAchats,double prixVente,String Nom,String Fourniseur
    Primeurs A=new Primeurs(1400,3600,"Primeurs A","Aman");
    Primeurs B=new Primeurs(400,1500,"Primeurs B","Ali");
    Primeurs C=new Primeurs(700,750,"Primeurs C","salih");
    Primeurs D=new Primeurs(3400,7500,"Primeurs D","oumayma");


    ElectroMenagers[] tabEM={frigidaire,laveVesselles,laveMachine};



    Primeurs[] tabPr={A,B,C,D};
    Magasin carrefour=new Magasin(tabEM,tabPr);
    Scanner scanf =new Scanner(System.in);
     for(Primeurs A7:carrefour.ProduitsPr) {

         System.out.println("veileur entrer un double (stock du "+A7.Nom+"): ");
         double read=scanf.nextInt();
         A7.RemplirStock(read);
         carrefour.deponces+=read*A7.prixAchats;
         carrefour.Revenue+=read* A7.prixVente;
     }
       for(ElectroMenagers A7:carrefour.ProduitsEM){
           System.out.println("veileur entrer un entier (stock du " + A7.Nom + "): ");
           int read = scanf.nextInt();
           A7.RemplirStock(read);
           carrefour.deponces+=read*A7.prixAchats;
           carrefour.Revenue+=read* A7.prixVente;
         }
       carrefour.Description();
       carrefour.Rendement();
        System.out.println("les deponces totaux de cette magasin est (le capitale  d'achat): "+carrefour.deponces+" DT");
        System.out.println("Les revenus brut sont: "+carrefour.Revenue);
        for (ElectroMenagers A7:carrefour.ProduitsEM){

            String reductionConfirmee;
            do {
                System.out.println("est ce que vous Vouler Modifiez le prix de vente du produit "+A7.Nom+"? (y/n) ");
            reductionConfirmee=scanf.next();
            }while (!(reductionConfirmee.equals("y") || reductionConfirmee.equals("n")));
            scanf.nextLine();

            if(reductionConfirmee.equals("y")){
                String choice;
                do {
                    System.out.println("Vouler vous :");
                    System.out.println("1- baisser le prix(reduction) .....................pour ce choix taper 1");
                    System.out.println("2- augmenter le prix(augmentation) ................pour ce choix taper 2");
                    choice = scanf.next();
                } while (!(choice.equals("1") || choice.equals("2")));

                double pourcentage = 0;
                do {
                    System.out.println("entrer la pourcentage de votre modification");
                    pourcentage = scanf.nextDouble();
                } while (!(0 < pourcentage && pourcentage < 80));

                if(choice.equals("1")){
                    A7.LanserSolde(pourcentage);
                } else {
                    A7.TerminerSolde(pourcentage);
                }
            }

            else {
                continue;
            }
        }
        for(ElectroMenagers A7:carrefour.ProduitsEM){
            carrefour.RevenueNet+=A7.Stock * A7.prixVente;
        }
        for(Primeurs A7:carrefour.ProduitsPr) {
            carrefour.RevenueNet+=A7.Stock* A7.prixVente;
        }
        double RN=carrefour.RevenueNet-carrefour.deponces;
        System.out.println("Les revenue Net sont: "+RN+" DT");








    }

}
