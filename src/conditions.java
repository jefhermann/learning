import java.util.Scanner;

public class conditions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//déclaration de la methode de saisie
		Scanner sc = new Scanner (System.in);
		
		
		//condition if
		System.out.print("entre un chiffre : ");
		int nb = sc.nextInt();
		
		if (nb == (int)nb)
		{
			if (nb < 0)
			{
				System.out.print("\nVous avez saisi : "+nb+" est négatif");
			}
			else
			{
				if (nb == 0)
					System.out.print("\nVous avez saisi : "+nb+" est null");
				else
					System.out.print("\nVous avez saisi : "+nb+" est positif");					
			}
		}
		else
		{
			System.out.print("\nVous n'avez un entier");
		}
		
		//switch case 
		System.out.print("\n Faites un choix entre un chiffre entre 1 et 3 : ");
		int nb1 = sc.nextInt();
			
		switch (nb1)
		{
		case 1:
		System.out.print("\nC'est bien vous êtes patient et vous avez choisi : "+nb1);
		break;
		case 2:
		System.out.print("\nVous aimez briser les codes de la vie et vous avez choisi : "+nb1);
		break;
		case 3:
		System.out.print("\nVous voyez les choses en grand et vous avez choisi : "+nb1);
		break;
		default:
		System.out.print("\nVotre choix n'est pas entre 1 et 3");
		}
		
	}

}
