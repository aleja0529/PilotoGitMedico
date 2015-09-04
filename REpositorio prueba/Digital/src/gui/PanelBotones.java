package gui;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import controlador.Controlador;

public class PanelBotones extends JPanel implements ActionListener{

	private JButton accion;
	private JButton borrar;
	private JTextField numeroN;
	private JTextField numeroS;
	private Controlador controlar;
	
	public PanelBotones(Controlador controlar){
		this.controlar= controlar;
		setBorder(BorderFactory.createTitledBorder("Panel Botones"));
		setLayout(new GridLayout(3, 2));
		accion = new JButton("accion");
		accion.addActionListener(this);
		accion.setActionCommand("accion");
		
		borrar = new JButton("borrar");
		borrar.addActionListener(this);
		borrar.setActionCommand("borrar");
		
		numeroN = new JTextField("");
		
		numeroS = new JTextField("");
		
		
		add(new JLabel("S: "));
		add(numeroN);
		add(new JLabel("N: "));
		add(numeroS);
		add(accion);
		add(borrar);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		String msg = e.getActionCommand();
		
		if(msg.equals("accion")){
			try {
				controlar.Accion(Integer.parseInt(numeroN.getText()),numeroS.getText());
			} catch (Exception e2) {
			}
		}
		if(msg.equals("borrar")){
			controlar.Borrar();
		}
	}
	
}
