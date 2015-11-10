package be.ephec.exo14bis;

import javax.swing.JOptionPane;

public class Etu {
	private String nom;
	private String prenom;
	private int num;
	
	Etu(String nom, String prenom, int num){
		this.nom = nom;
		this.prenom = prenom;
		this.num = num;
	}
	
	Etu(){
		this.nom = JOptionPane.showInputDialog("Entrez le nom!");
		this.prenom = JOptionPane.showInputDialog("Entrez le pr�nom!");
		this.num = Integer.parseInt(JOptionPane.showInputDialog("Entrez le num�ro"));
	}
	
	Etu(String nom, String prenom){
		this.nom = nom;
		this.prenom = prenom;
		this.num = Integer.parseInt(JOptionPane.showInputDialog("Entrez le num�ro"));
	}
	
	public String getNom(){
		return this.nom;
	}
	
	public void setNom(String nom){
		this.nom = nom;
	}

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}
	
	public String toString(){
		return ("Nom: "+this.nom+"\nPr�nom: "+this.prenom+"\nNum: "+this.num);
	}
}
