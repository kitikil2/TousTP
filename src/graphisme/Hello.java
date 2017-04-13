package graphisme;

import java.awt.BorderLayout;
import java.awt.Container;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Hello extends JFrame {

	// Constructeur
	public Hello() {
		super("Titre de la JFrame");
		// Si on appuie sur la croix, le programme s'arrete
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

                // On récupère le conteneur de la JFrame (this est
                // une JFrame car Hello hérite de JFrame)
		Container contentPane = this.getContentPane();
		// Choix du gestionnaire de disposition
		BorderLayout layout = new BorderLayout();
		contentPane.setLayout(layout);

		JPanel panel = new JPanel();

		JLabel label = new JLabel(
			"Bonjour, ceci est une JFrame qui contient"+
                        " un JPanel qui contient un JLabel");
		panel.add(label);
		// Ici ne sert pas car le panel est seul
		contentPane.add(panel, BorderLayout.CENTER);
		this.pack();
		this.setVisible(true);
	}

	// Méthode principale : démarrage du programme
	public static void main(String[] args) {
		new Hello();
	}
}
