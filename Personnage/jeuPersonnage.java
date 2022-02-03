import java.util.Scanner;
import Personnage.*;
public class jeuPersonnage {
	public static void main(String args[]){

//Créer Bot (String name, int life, int level, int damage, int xp)
		Personnage Bot = new Personnage("DéDé", 100,1,75,0);

//Créer NewPersonnage (String name, int life, int level, int damage, int xp)
		System.out.println("\nVeuillez saisir un Pseudo :");
		try (Scanner sc = new Scanner(System.in)) {
			Personnage NewPersonnage = new Personnage(sc.nextLine(), 200,1,100,0);

//Histoire
		System.out.println(NewPersonnage.LeNom() + " ------> LIFE = " + NewPersonnage.LaVie());
		System.out.println(NewPersonnage.LeNom() + " ------> LEVEL = " + NewPersonnage.Level());
		System.out.println(NewPersonnage.LeNom() + " ------> XP = " + NewPersonnage.xp()+ "\n");
		System.out.println(Bot.LeNom() + " ------> LIFE = " + Bot.LaVie());
		System.out.println(Bot.LeNom() + " ------> LEVEL = " + Bot.Level());
		System.out.println(Bot.LeNom() + " ------> XP = " + Bot.xp());
		sc.nextLine();
		System.out.println(NewPersonnage.LeNom() + " se balade dans la forêt et croise un " + Bot.LeNom() + " colérique");
		sc.nextLine();
		System.out.println(NewPersonnage.LeNom() + " attaque " + Bot.LeNom() + " et lui infllige " + NewPersonnage.nb_degat() +" degats");
		Bot.Degat(100);
		sc.nextLine();
		System.out.println("Avant de mourir le " + Bot.LeNom() + " inflige " + Bot.nb_degat() + " degats a " + NewPersonnage.LeNom());
		NewPersonnage.Degat(75);
		sc.nextLine();
		System.out.println(NewPersonnage.LeNom() + " a " + NewPersonnage.LaVie()+ " de vie ");
		System.out.println(Bot.LeNom() + " a " + Bot.LaVie()+ " de vie ");

		//si Bot == 0LIFE alors NewPersonnage ++ 100xp and 50LIFE
		if ( Bot.LaVie() == 0){
			System.out.println("Le " + Bot.LeNom() + " vient de mourir");
			NewPersonnage.xpsup(100);
			NewPersonnage.Healer(75);
		}

		//si NewPersonnage == 100xp alors NewPersonnage ++ 1LEVEL
		if (NewPersonnage.xp() == 100) {
			NewPersonnage.Levelsup(1);
		}
		
		System.out.println("\n" + NewPersonnage.LeNom() + " ------> LIFE UP = " + NewPersonnage.LaVie());
		System.out.println(NewPersonnage.LeNom() + " ------> LEVEL UP = " + NewPersonnage.Level());
		System.out.println(NewPersonnage.LeNom() + " ------> XP = " + NewPersonnage.xp());
		}
	}
}
