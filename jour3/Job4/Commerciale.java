package jour3.Job4;

import java.util.Vector;
import java.util.Scanner;

public class Commerciale {
    private Vector<Article> articles = new Vector<>();
    private Vector<Client> clients = new Vector<>();
    private Vector<Commande> commandes = new Vector<>();
    private Vector<Ligne> lignes = new Vector<>();

    public void ajouterArticle(Article a) {
        articles.add(a);
    }

    public void supprimerArticle(Article a) {
        articles.remove(a);
    }

    public void ajouterClient(Client c) {
        clients.add(c);
    }

    public void supprimerClient(Client c) {
        clients.remove(c);
    }

    public void passerCommande(Commande c) {
        commandes.add(c);
    }

    public void annulerCommande(Commande c) {
        commandes.remove(c);
    }

    public static void main(String[] args) {
        Commerciale gestion = new Commerciale();
        Scanner scanner = new Scanner(System.in);
        int choix = -1;

        while (choix != 0) {
            System.out.println("----------Gestion commerciale----------");
            System.out.println("1) Ajouter un article");
            System.out.println("2) Supprimer un article");
            System.out.println("3) Ajouter un client");
            System.out.println("4) Supprimer un client");
            System.out.println("5) Passer une commande");
            System.out.println("6) Annuler une commande");
            System.out.println("0) Quitter");
            System.out.print("\nEntrer un choix : ");

            if (scanner.hasNextInt()) {
                choix = scanner.nextInt();
                scanner.nextLine();
            } else {
                scanner.nextLine();
                continue;
            }

            switch (choix) {
                case 1:
                    System.out.print("Reference : ");
                    int ref = scanner.nextInt();
                    scanner.nextLine();
                    System.out.print("Designation : ");
                    String des = scanner.nextLine();
                    System.out.print("Prix Unitaire : ");
                    double pu = scanner.nextDouble();
                    System.out.print("Quantite en stock : ");
                    int qs = scanner.nextInt();
                    scanner.nextLine();
                    gestion.ajouterArticle(new Article(ref, des, pu, qs));
                    break;
                case 2:
                    System.out.print("Reference de l'article à supprimer : ");
                    int refSupp = scanner.nextInt();
                    scanner.nextLine();
                    Article artSupp = null;
                    for (Article a : gestion.articles) {
                        if (a.getReference() == refSupp) {
                            artSupp = a;
                            break;
                        }
                    }
                    if (artSupp != null) gestion.supprimerArticle(artSupp);
                    break;
                case 3:
                    System.out.print("Identite : ");
                    int id = scanner.nextInt();
                    scanner.nextLine();
                    System.out.print("Nom Social : ");
                    String ns = scanner.nextLine();
                    System.out.print("Adresse : ");
                    String adr = scanner.nextLine();
                    System.out.print("Chiffre d'Affaire : ");
                    double ca = scanner.nextDouble();
                    scanner.nextLine();
                    gestion.ajouterClient(new Client(id, ns, adr, ca));
                    break;
                case 4:
                    System.out.print("Identite du client à supprimer : ");
                    int idSupp = scanner.nextInt();
                    scanner.nextLine();
                    Client cliSupp = null;
                    for (Client c : gestion.clients) {
                        if (c.getIdentite() == idSupp) {
                            cliSupp = c;
                            break;
                        }
                    }
                    if (cliSupp != null) gestion.supprimerClient(cliSupp);
                    break;
                case 5:
                    if (gestion.clients.isEmpty()) {
                        System.out.println("Ajoutez un client d'abord.");
                        break;
                    }
                    System.out.print("Numero de commande : ");
                    int numC = scanner.nextInt();
                    scanner.nextLine();
                    System.out.print("Date (JJ/MM/AAAA) : ");
                    String date = scanner.nextLine();
                    System.out.println("Clients disponibles :");
                    for (int i = 0; i < gestion.clients.size(); i++) {
                        System.out.println(i + ") " + gestion.clients.get(i).getNomSocial());
                    }
                    System.out.print("Choisir client (index) : ");
                    int idxCli = scanner.nextInt();
                    scanner.nextLine();
                    if (idxCli >= 0 && idxCli < gestion.clients.size()) {
                        gestion.passerCommande(new Commande(numC, date, gestion.clients.get(idxCli)));
                    }
                    break;
                case 6:
                    System.out.print("Numero de la commande à annuler : ");
                    int numSupp = scanner.nextInt();
                    scanner.nextLine();
                    Commande comSupp = null;
                    for (Commande c : gestion.commandes) {
                        if (c.getNumeroCommande() == numSupp) {
                            comSupp = c;
                            break;
                        }
                    }
                    if (comSupp != null) gestion.annulerCommande(comSupp);
                    break;
                case 0:
                    System.out.println("Au revoir !");
                    break;
                default:
                    System.out.println("Choix invalide.");
            }
        }
        scanner.close();
    }
}
