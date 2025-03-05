


import java.util.Scanner;

public class etudient {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // q1
        System.out.print("entrez le nombre d'étudiants : ");
        int nombreEtudiants = scanner.nextInt();
        scanner.nextLine();

        String[] noms = new String[nombreEtudiants]; 
        double[] notes = new double[nombreEtudiants];

        // q2
        for (int i = 0; i < nombreEtudiants; i++) {
            System.out.print("entrez le nom de l'étudiant " + (i + 1) + " : ");
            noms[i] = scanner.nextLine();

            System.out.print("entrez la note de l'étudiant " + (i + 1) + " : ");
            notes[i] = scanner.nextDouble();
            scanner.nextLine(); 
        }

        // q3
        System.out.println("\nla liste des notes :");
        for (int i = 0; i < nombreEtudiants; i++) {
            System.out.println(noms[i] + " : " + notes[i]);
        }

        //q4
        double somme = 0;
        for (double note : notes) {
            somme += note;
        }
        double moyenne = somme / nombreEtudiants;
        System.out.println("\nla moyenne de la classe : " + moyenne);

        // q5
        double noteMax = notes[0];
        double noteMin = notes[0];
        String nomMax = noms[0];
        String nomMin = noms[0];

        for (int i = 1; i < nombreEtudiants; i++) {
            if (notes[i] > noteMax) {
                noteMax = notes[i];
                nomMax = noms[i];
            }
            if (notes[i] < noteMin) {
                noteMin = notes[i];
                nomMin = noms[i];
            }
        }
        System.out.println("la note maximale : " + noteMax + " (" + nomMax + ")");
        System.out.println("la note minimale : " + noteMin + " (" + nomMin + ")");

        // q6
        System.out.println("\nles etudiants avec une note supérieure à la moyenne ("+moyenne+"):");
        for (int i = 0; i < nombreEtudiants; i++) {
            if (notes[i] > moyenne) {
                System.out.println(noms[i] + " : " + notes[i]);
            }
        }

        // q7
        boolean trouve = false;
        int i = 0;
        System.out.print("\nentrez le nom de l'étudiant pour rechercher sa note : ");
        String nomRecherche = scanner.nextLine();
        while (trouve == false && i<nombreEtudiants){
            
            if (noms[i].equalsIgnoreCase(nomRecherche)) {
                System.out.println("Note de " + noms[i] + " : " + notes[i]);
                trouve = true;
                break;
            }
            else if (!trouve && i == nombreEtudiants - 1) {
            System.out.println("l'etudiant non trouvé.");
            }
            else{
                i++;
            }
        }

        // q8
        trierParNotesDecroissantes(noms, notes);
        System.out.println("\nles etudiants classés par ordre décroissant de leur note :");
        for (i = 0; i < nombreEtudiants; i++) {
            System.out.println(noms[i] + " : " + notes[i]);
        }

        // q9
        
        trouve = false;
        System.out.print("\nentrez le nom de l'étudiant pour modifier sa note : ");
           String nomModification = scanner.nextLine();
           for (i = 0; i < nombreEtudiants; i++) {
            if (noms[i].equalsIgnoreCase(nomModification)) {
                System.out.print("entrez la nouvelle note pour " + noms[i] + " : ");
                notes[i] = scanner.nextDouble();
                System.out.println("la note mise à jour pour " + noms[i] + " : " + notes[i]);
                break;
            }
          }
          if (!trouve && i == nombreEtudiants - 1){
            System.out.println("etudiant non trouvé."); 
          }
        scanner.close();
    }

    //methode de trie
    public static void trierParNotesDecroissantes(String[] noms, double[] notes) {
        for (int i = 0; i < notes.length - 1; i++) {
            for (int j = i + 1; j < notes.length; j++) {
                if (notes[i] < notes[j]) {
                    // Échanger les notes
                    double temp = notes[i];
                    notes[i] = notes[j];
                    notes[j] = temp;

                    
                    String tempN = noms[i];
                    noms[i] = noms[j];
                    noms[j] = tempN;
                }
            }
        }
    }
}
