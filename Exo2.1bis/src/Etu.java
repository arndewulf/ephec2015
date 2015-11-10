import javax.swing.JOptionPane;


public class Etu {
	private String nom;
	private String prenom;
	private int nb_calculs = 0;
	private int nb_bonnes_reponses = 0;
	
	public Etu(){
		this.nom = JOptionPane.showInputDialog("Entrez le nom");
		this.prenom = JOptionPane.showInputDialog("Entrez le prénom");
	}
	
	public Etu(String nom, String prenom){
		this.nom = nom;
		this.prenom = prenom;
	}
	
	public void calcul(){
		for(int i=0; i<5; i++){
			int op1 = (int)(Math.random()*100);
			int op2 = (int)(Math.random()*100);
			int  reponse = Integer.parseInt(JOptionPane.showInputDialog(null, "Que vaut "+op1+" + "+op2+" ?"));
			this.nb_calculs++;
			if(reponse == (op1+op2)){
				this.nb_bonnes_reponses ++;
				JOptionPane.showMessageDialog(null, "Bravo!", "Résultat", JOptionPane.WARNING_MESSAGE);
			}else{
				JOptionPane.showMessageDialog(null, "Faux !", "Résultat", JOptionPane.ERROR_MESSAGE);
			}
		}
		JOptionPane.showMessageDialog(null, this.prenom+" "+this.nom+", tu as obtenu: "+this.nb_bonnes_reponses+"/"+this.nb_calculs);
	}
	
	public double moyenne(){
		return ((double)this.nb_bonnes_reponses/this.nb_calculs);
	}
	
	public String toString(){
		return ("Nom: "+this.nom+" Prénom: "+this.prenom +"\nMoyenne: "+this.moyenne());
	}
}
