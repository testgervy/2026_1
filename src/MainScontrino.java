//main

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class MainScontrino extends JFrame implements ActionListener {
	private JTextField numM, numC, data;
	private JButton scontrino, annulla;
	private JLabel imm;
	private Scontrino s1;

	public MainScontrino() {
		super("Scontrino");
		Container co = getContentPane();
		JPanel nord, sud, centro, est;

		// nord
		JLabel tit = new JLabel("LAVANDERIA SMARTWASH");
		tit.setFont(new Font("Arial", Font.BOLD, 20));
		nord = new JPanel();
		nord.add(tit);
		co.add(nord, "North");

		// sud
		sud = new JPanel();
		scontrino = new JButton("SCONTRINO");
		annulla = new JButton("ANNULLA");
		scontrino.setFont(new Font("Arial", Font.BOLD, 20));
		annulla.setFont(new Font("Arial", Font.BOLD, 20));
		scontrino.setBackground(Color.yellow);
		annulla.setBackground(Color.yellow);
		scontrino.addActionListener(this);
		annulla.addActionListener(this);
		sud.add(scontrino);
		sud.add(annulla);
		co.add(sud, "South");

		// est
		est = new JPanel();
		imm = new JLabel(new ImageIcon("vuota.png"));
		est.add(imm);
		co.add(est, "East");

		// centro
		centro = new JPanel(new GridLayout(3, 1));
		JPanel no, ce, su;

		// centro-nord
		no = new JPanel();
		JLabel nm = new JLabel("Numero Macchinario: ");
		nm.setFont(new Font("Arial", Font.BOLD, 20));
		numM = new JTextField(10);
		no.add(nm);
		no.add(numM);
		centro.add(no);

		// centro-centro
		ce = new JPanel();
		JLabel nc = new JLabel("Numero cicli: ");
		nc.setFont(new Font("Arial", Font.BOLD, 20));
		numC = new JTextField(10);
		ce.add(nc);
		ce.add(numC);
		centro.add(ce);

		// centro-sud
		su = new JPanel();
		JLabel da = new JLabel("Data: ");
		da.setFont(new Font("Arial", Font.BOLD, 20));
		data = new JTextField(10);
		su.add(da);
		su.add(data);
		centro.add(su);

		co.add(centro);
		pack();
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}

	public void actionPerformed(ActionEvent e) {
		Object o = e.getSource();
		if (numM.getText().equals("1")||numM.getText().equals("2")||numM.getText().equals("3")) {
			String a,b;
			a = numM.getText();
			b = numC.getText();
			imm.setIcon(new ImageIcon("lavatrice.png"));
			s1 = new Scontrino(Integer.parseInt(a), Integer.parseInt(b),data.getText());
		} else if (numM.getText().equals("4")||numM.getText().equals("5")||numM.getText().equals("6")||numM.getText().equals("7")) {
			String a, b;
			a = numM.getText();
			b = numC.getText();
			imm.setIcon(new ImageIcon("asciugatrice.png"));
			s1 = new Scontrino(Integer.parseInt(a),Integer.parseInt(b),data.getText());
		} else {
			JOptionPane.showMessageDialog(this, "inserisci un numero da 1 a 7...");
			return;
		}

		if (o == scontrino) {
			JOptionPane.showMessageDialog(this,s1.toString());
		} else if (o == annulla) {
			numM.setText("");
			numC.setText("");
			data.setText("");
			imm.setIcon(new ImageIcon("vuota.png"));
		}

	}

	public static void main(String[] args) {
		new MainScontrino();

	}

}
