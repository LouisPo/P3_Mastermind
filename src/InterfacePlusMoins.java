import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.GridBagLayout;
import javax.swing.JLabel;
import java.awt.GridBagConstraints;
import java.awt.Font;
import javax.swing.JTextField;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.JButton;

public class InterfacePlusMoins {

	public JFrame frame2;
	private JTextField usersaisie1;
	private JTextField usersaisie2;
	private JTextField usersaisie4;
	private JTextField usersaisie3;
	private JTextField usersaisie5;

	/**
	 * Launch the application.
	 */
	
	  public InterfacePlusMoins(final DepartPlusMoins mother) {
		    final JButton button = new JButton("Action");
		 
		    frame2.setTitle("Fille n°");
		    frame2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		    frame2.setSize(170, 150);
		    frame2.setLocationByPlatform(true);
		    frame2.setLocationRelativeTo(mother.getFrame());
		 
		    button.addActionListener(new ActionListener() {
		      public void actionPerformed(ActionEvent event) {
		        mother.openFrame();
		        frame2.dispose();
		      }
		    });
		    frame2.getContentPane().add(button);
		 
		    frame2.setVisible(true);
		  }
	
	
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					InterfacePlusMoins window = new InterfacePlusMoins();
					window.frame2.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public InterfacePlusMoins() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame2.
	 */
	public void initialize() {
		frame2 = new JFrame();
		frame2.setBounds(100, 100, 489, 339);
		frame2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		GridBagLayout gridBagLayout = new GridBagLayout();
		gridBagLayout.columnWidths = new int[]{0, 0, 0, 0, 0, 0, 0, 0};
		gridBagLayout.rowHeights = new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
		gridBagLayout.columnWeights = new double[]{0.0, 1.0, 0.0, 1.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		gridBagLayout.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		frame2.getContentPane().setLayout(gridBagLayout);
		
		
		JLabel lblJeuPlusMoins = new JLabel("Jeu Plus Moins");
		lblJeuPlusMoins.setFont(new Font("Tahoma", Font.PLAIN, 14));
		GridBagConstraints gbc_lblJeuPlusMoins = new GridBagConstraints();
		gbc_lblJeuPlusMoins.insets = new Insets(0, 0, 5, 5);
		gbc_lblJeuPlusMoins.gridx = 3;
		gbc_lblJeuPlusMoins.gridy = 0;
		frame2.getContentPane().add(lblJeuPlusMoins, gbc_lblJeuPlusMoins);
		
		
		JLabel lblEssayezUneValeur = new JLabel("Essai 1");
		lblEssayezUneValeur.setFont(new Font("Tahoma", Font.PLAIN, 14));
		GridBagConstraints gbc_lblEssayezUneValeur = new GridBagConstraints();
		gbc_lblEssayezUneValeur.insets = new Insets(0, 0, 5, 5);
		gbc_lblEssayezUneValeur.gridx = 1;
		gbc_lblEssayezUneValeur.gridy = 1;
		frame2.getContentPane().add(lblEssayezUneValeur, gbc_lblEssayezUneValeur);
		
		usersaisie1 = new JTextField();
		usersaisie1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		
		GridBagConstraints gbc_usersaisie1 = new GridBagConstraints();
		gbc_usersaisie1.insets = new Insets(0, 0, 5, 5);
		gbc_usersaisie1.fill = GridBagConstraints.HORIZONTAL;
		gbc_usersaisie1.gridx = 3;
		gbc_usersaisie1.gridy = 1;
		frame2.getContentPane().add(usersaisie1, gbc_usersaisie1);
		usersaisie1.setColumns(10);
		
		JLabel oldresult = new JLabel("");
		oldresult.setFont(new Font("Tahoma", Font.PLAIN, 14));
		GridBagConstraints gbc_oldresult = new GridBagConstraints();
		gbc_oldresult.insets = new Insets(0, 0, 5, 5);
		gbc_oldresult.gridx = 4;
		gbc_oldresult.gridy = 1;
		frame2.getContentPane().add(oldresult, gbc_oldresult);
		
		JLabel result = new JLabel("");
		result.setFont(new Font("Tahoma", Font.PLAIN, 14));
		GridBagConstraints gbc_result = new GridBagConstraints();
		gbc_result.insets = new Insets(0, 0, 5, 0);
		gbc_result.gridx = 6;
		gbc_result.gridy = 1;
		frame2.getContentPane().add(result, gbc_result);
		
		JLabel lblEssai = new JLabel("Essai 2");
		GridBagConstraints gbc_lblEssai = new GridBagConstraints();
		gbc_lblEssai.insets = new Insets(0, 0, 5, 5);
		gbc_lblEssai.gridx = 1;
		gbc_lblEssai.gridy = 2;
		frame2.getContentPane().add(lblEssai, gbc_lblEssai);
		
		usersaisie2 = new JTextField();
		usersaisie2.setFont(new Font("Tahoma", Font.PLAIN, 14));
		usersaisie2.setColumns(10);
		GridBagConstraints gbc_usersaisie2 = new GridBagConstraints();
		gbc_usersaisie2.insets = new Insets(0, 0, 5, 5);
		gbc_usersaisie2.fill = GridBagConstraints.HORIZONTAL;
		gbc_usersaisie2.gridx = 3;
		gbc_usersaisie2.gridy = 2;
		frame2.getContentPane().add(usersaisie2, gbc_usersaisie2);
		
		JLabel label_1 = new JLabel("");
		label_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		GridBagConstraints gbc_label_1 = new GridBagConstraints();
		gbc_label_1.insets = new Insets(0, 0, 5, 0);
		gbc_label_1.gridx = 6;
		gbc_label_1.gridy = 2;
		frame2.getContentPane().add(label_1, gbc_label_1);
		
		JLabel text3 = new JLabel("Essai 3");
		GridBagConstraints gbc_text3 = new GridBagConstraints();
		gbc_text3.insets = new Insets(0, 0, 5, 5);
		gbc_text3.gridx = 1;
		gbc_text3.gridy = 3;
		frame2.getContentPane().add(text3, gbc_text3);
		
		usersaisie3 = new JTextField();
		usersaisie3.setFont(new Font("Tahoma", Font.PLAIN, 14));
		usersaisie3.setColumns(10);
		GridBagConstraints gbc_usersaisie3 = new GridBagConstraints();
		gbc_usersaisie3.insets = new Insets(0, 0, 5, 5);
		gbc_usersaisie3.fill = GridBagConstraints.HORIZONTAL;
		gbc_usersaisie3.gridx = 3;
		gbc_usersaisie3.gridy = 3;
		frame2.getContentPane().add(usersaisie3, gbc_usersaisie3);
		
		JLabel result3 = new JLabel("");
		result3.setFont(new Font("Tahoma", Font.PLAIN, 14));
		GridBagConstraints gbc_result3 = new GridBagConstraints();
		gbc_result3.insets = new Insets(0, 0, 5, 0);
		gbc_result3.gridx = 6;
		gbc_result3.gridy = 3;
		frame2.getContentPane().add(result3, gbc_result3);
		
		JLabel lblVousNavezDroit = new JLabel("Essai 4");
		lblVousNavezDroit.setFont(new Font("Tahoma", Font.PLAIN, 14));
		GridBagConstraints gbc_lblVousNavezDroit = new GridBagConstraints();
		gbc_lblVousNavezDroit.insets = new Insets(0, 0, 5, 5);
		gbc_lblVousNavezDroit.gridx = 1;
		gbc_lblVousNavezDroit.gridy = 5;
		frame2.getContentPane().add(lblVousNavezDroit, gbc_lblVousNavezDroit);
		
		usersaisie4 = new JTextField();
		usersaisie4.setFont(new Font("Tahoma", Font.PLAIN, 14));
		usersaisie4.setColumns(10);
		GridBagConstraints gbc_usersaisie4 = new GridBagConstraints();
		gbc_usersaisie4.insets = new Insets(0, 0, 5, 5);
		gbc_usersaisie4.fill = GridBagConstraints.HORIZONTAL;
		gbc_usersaisie4.gridx = 3;
		gbc_usersaisie4.gridy = 5;
		frame2.getContentPane().add(usersaisie4, gbc_usersaisie4);
		
		frame2.validate();
		frame2.setVisible(true);
		//variable comptant le nombre d'essai
		
		int compteur=0;
		
		//creation nombre aléatoire à 4 chiffres
		
		Random r = new Random();
		int ordi1 = r.nextInt(9);
		int ordi2 = r.nextInt(9);
		int ordi3 = r.nextInt(9);
		int ordi4 = r.nextInt(9);
		System.out.println("nombre aleatoire "+ordi1+""+ordi2+""+ordi3+""+ordi4);
				
		System.out.println("ttt"+frame2.getContentPane());
		
		JButton btnJouez = new JButton("Jouez");
		btnJouez.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnJouez.addActionListener(new ActionListener() {
			int compteur=0;
			public void actionPerformed(ActionEvent arg0) {
				compteur=compteur+1;

				String recup=usersaisie1.getText();
				String essai1;
				String essai2;
				String essai3;
				String essai4;
				essai1 = recup.substring(0,1);
				essai2 = recup.substring(1,2);
				essai3 = recup.substring(2,3);
				essai4 = recup.substring(3,4);
				
				System.out.println("essai1debut"+essai1+"fin");
				System.out.println("essai2debut"+essai2+"fin");
				System.out.println("essai3debut"+essai3+"fin");
				System.out.println("essai4debut"+essai4+"fin");
				System.out.println("ca vaut "+recup);
				System.out.println(recup);
				
				String resultat="";
				
				if(compteur==3){
					btnJouez.setVisible(false);
					
				}else{
				
				if(ordi1==Integer.parseInt(essai1)){
					resultat="=";
				}else if(ordi1>Integer.parseInt(essai1)){
					resultat="+";
				}else{
					resultat="-";
				}
				if(ordi2==Integer.parseInt(essai2)){
					resultat=resultat+"=";
				}else if(ordi2>Integer.parseInt(essai2)){
					resultat=resultat+"+";
				}else{
					resultat=resultat+"-";
				}
				if(ordi3==Integer.parseInt(essai3)){
					resultat=resultat+"=";
				}else if(ordi3>Integer.parseInt(essai3)){
					resultat=resultat+"+";
				}else{
					resultat=resultat+"-";
				}if(ordi4==Integer.parseInt(essai4)){
					resultat=resultat+"=";
				}else if(ordi4>Integer.parseInt(essai4)){
					resultat=resultat+"+";
				}else{
					resultat=resultat+"-";
				}
				result.setText(resultat);
				oldresult.setText(essai1+essai2+essai3+essai4);
				usersaisie1.setText("");
				System.out.println(compteur);
			}
				}
			
		});
		
		JLabel label = new JLabel("Essai 5");
		label.setFont(new Font("Tahoma", Font.PLAIN, 14));
		GridBagConstraints gbc_label = new GridBagConstraints();
		gbc_label.insets = new Insets(0, 0, 5, 5);
		gbc_label.gridx = 1;
		gbc_label.gridy = 7;
		frame2.getContentPane().add(label, gbc_label);
		
		usersaisie5 = new JTextField();
		usersaisie5.setFont(new Font("Tahoma", Font.PLAIN, 14));
		usersaisie5.setColumns(10);
		GridBagConstraints gbc_usersaisie5 = new GridBagConstraints();
		gbc_usersaisie5.insets = new Insets(0, 0, 5, 5);
		gbc_usersaisie5.fill = GridBagConstraints.HORIZONTAL;
		gbc_usersaisie5.gridx = 3;
		gbc_usersaisie5.gridy = 7;
		frame2.getContentPane().add(usersaisie5, gbc_usersaisie5);
		
		
			
		GridBagConstraints gbc_btnJouez = new GridBagConstraints();
		gbc_btnJouez.gridx = 6;
		gbc_btnJouez.gridy = 9;
		frame2.getContentPane().add(btnJouez, gbc_btnJouez);
	}

}
