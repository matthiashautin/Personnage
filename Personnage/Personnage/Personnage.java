package Personnage;
public class Personnage {
	// Le constructeur
		public Personnage(String name, int life, int level, int damage, int xp){
			this.nom = name;
			this.vie = life;
			this.niveau = level;
			this.nb_degat = damage;
			this.xp = xp;
	}
	//Degat
	public void Degat(int nb_degat) {
		this.vie = this.vie - nb_degat;
	}
	//Healer
	public void Healer(int nb_Healer) {
		this.vie = this.vie + nb_Healer;
	}
	//Levelsup
	public void Levelsup(int nb_levelsup) {
		this.niveau = this.niveau + nb_levelsup;
	}
	//XP Sup
	public void xpsup(int xp_sup) {
		this.xp = this.xp + xp_sup;
	}
	//Ascesseur
	public int xp(){
		return this.xp;
	}
	public String LeNom(){
		return this.nom;
	}
	public int LaVie(){
		return this.vie;
	}
	public int Level(){
		return this.niveau;
	}
	public int nb_degat(){
		return this.nb_degat;
	}
	
	//Les Attributs
		private String nom;
		private int vie;
		private int niveau;
		private int nb_degat;
		private int xp;
	}
	
