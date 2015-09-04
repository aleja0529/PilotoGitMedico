package gui;

import java.awt.Color;
import java.awt.LayoutManager;

import javax.swing.BorderFactory;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.ScrollPaneConstants;

import controlador.Controlador;

public class PanelDigital extends JPanel {

	private JTextArea panel;
	private JScrollPane linea;
	
	public PanelDigital() {
		
		setBorder(BorderFactory.createTitledBorder("Panel Digital"));
		setLayout(null);
		panel= new JTextArea();
		
		linea =  new JScrollPane(panel);
		linea.setBounds(5,15,275,340);
		linea.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
		linea.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_ALWAYS);
		add(linea);
		
	}

	public void actualizar(String mensaje) {
		panel.setText(mensaje);
	}

	public void borrar() {
		panel.setText("");
	}


		

}
