import java.util.Scanner;

public class saisie_affichage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);
		
		//la saisie et affichage pour une chaine de caractaire
		System.out.print("Entrez votre nom : ");
		String str = sc.nextLine();
		System.out.println("Vous ave saisi : "+str);
		
		//la saisie et affichage un entier
		System.out.print("\n \nSaisisser un entier : ");
		int i = sc.nextInt();
		System.out.println("Vous avez saisi : "+i);

	}

}
