package vista;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;

import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;

import modelo.Tipo;

public class UI extends JFrame {

	protected JPanel contentPane;
	private JTextField txtRuta;
	private JTextArea txtText;
	private JComboBox<Tipo> comboTipo;
	private JLabel lblMensaje;
	private JLabel label;
	private JList list;

	/**
	 * Create the frame.
	 */
	public UI() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 631, 401);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		GridBagLayout gbl_contentPane = new GridBagLayout();
		gbl_contentPane.columnWidths = new int[] {20, 350, 60, 20};
		gbl_contentPane.rowHeights = new int[]{0, 0, 0, 234, 11, 0};
		gbl_contentPane.columnWeights = new double[]{1.0, 1.0, 1.0, 1.0};
		gbl_contentPane.rowWeights = new double[]{1.0, 0.0, 1.0, 1.0, 1.0, Double.MIN_VALUE};
		contentPane.setLayout(gbl_contentPane);
		
		JLabel lblTitulo = new JLabel("Buscador de Archivos");
		lblTitulo.setFont(new Font("Comic Sans MS", Font.PLAIN, 32));
		GridBagConstraints gbc_lblTitulo = new GridBagConstraints();
		gbc_lblTitulo.gridwidth = 2;
		gbc_lblTitulo.insets = new Insets(0, 0, 5, 5);
		gbc_lblTitulo.gridx = 1;
		gbc_lblTitulo.gridy = 0;
		contentPane.add(lblTitulo, gbc_lblTitulo);
		
		JLabel lblRutaDeBusqueda = new JLabel("Ruta de busqueda:");
		GridBagConstraints gbc_lblRutaDeBusqueda = new GridBagConstraints();
		gbc_lblRutaDeBusqueda.gridwidth = 4;
		gbc_lblRutaDeBusqueda.insets = new Insets(0, 0, 5, 0);
		gbc_lblRutaDeBusqueda.gridx = 0;
		gbc_lblRutaDeBusqueda.gridy = 1;
		contentPane.add(lblRutaDeBusqueda, gbc_lblRutaDeBusqueda);
		
		setTxtRuta(new JTextField());
		getTxtRuta().setToolTipText("Introduzca la direccion de la carpeta en donde desea buscar");
		getTxtRuta().setHorizontalAlignment(SwingConstants.LEFT);
		GridBagConstraints gbc_txtRuta = new GridBagConstraints();
		gbc_txtRuta.insets = new Insets(0, 0, 5, 5);
		gbc_txtRuta.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtRuta.gridx = 1;
		gbc_txtRuta.gridy = 2;
		contentPane.add(getTxtRuta(), gbc_txtRuta);
		getTxtRuta().setColumns(10);
		
		setComboTipo(new JComboBox<Tipo>());
		getComboTipo().setToolTipText("Seleccione tipo de archivo");
		GridBagConstraints gbc_comboTipo = new GridBagConstraints();
		gbc_comboTipo.insets = new Insets(0, 0, 5, 5);
		gbc_comboTipo.fill = GridBagConstraints.HORIZONTAL;
		gbc_comboTipo.gridx = 2;
		gbc_comboTipo.gridy = 2;
		contentPane.add(getComboTipo(), gbc_comboTipo);
		
		label = new JLabel(" ");
		GridBagConstraints gbc_label = new GridBagConstraints();
		gbc_label.insets = new Insets(0, 0, 5, 0);
		gbc_label.gridx = 3;
		gbc_label.gridy = 2;
		contentPane.add(label, gbc_label);
		
		setList(new JList());
		getList().setMaximumSize(new Dimension(1, 1));
		getList().setVisibleRowCount(0);
		getList().setValueIsAdjusting(true);
		getList().setLayoutOrientation(JList.HORIZONTAL_WRAP);

		GridBagConstraints gbc_list = new GridBagConstraints();
		gbc_list.insets = new Insets(0, 0, 5, 5);
		gbc_list.fill = GridBagConstraints.BOTH;
		gbc_list.gridx = 0;
		gbc_list.gridy = 3;
		contentPane.add(getList(), gbc_list);
		
		setTxtText(new JTextArea());
		getTxtText().setBorder(new LineBorder(Color.ORANGE, 2, true));
		getTxtText().setWrapStyleWord(true);
		getTxtText().setRows(2);
		getTxtText().setColumns(1);
		getTxtText().setTabSize(100);
		getTxtText().setFont(new Font("Times New Roman", Font.PLAIN, 12));
		getTxtText().setEditable(false);
		GridBagConstraints gbc_txtText = new GridBagConstraints();
		gbc_txtText.gridwidth = 2;
		gbc_txtText.insets = new Insets(0, 0, 5, 5);
		gbc_txtText.fill = GridBagConstraints.BOTH;
		gbc_txtText.gridx = 1;
		gbc_txtText.gridy = 3;
		contentPane.add(getTxtText(), gbc_txtText);
		
		setLblMensaje(new JLabel(""));
		getLblMensaje().setBackground(Color.CYAN);
		getLblMensaje().setForeground(Color.RED);
		getLblMensaje().setFont(new Font("Comic Sans MS", Font.BOLD, 15));
		GridBagConstraints gbc_lblMensaje = new GridBagConstraints();
		gbc_lblMensaje.gridwidth = 2;
		gbc_lblMensaje.insets = new Insets(0, 0, 0, 5);
		gbc_lblMensaje.gridx = 1;
		gbc_lblMensaje.gridy = 4;
		contentPane.add(getLblMensaje(), gbc_lblMensaje);
		

	}

	/**
	 * @return the txtText
	 */
	public JTextArea getTxtText() {
		return txtText;
	}

	/**
	 * @param txtText the txtText to set
	 */
	public void setTxtText(JTextArea txtText) {
		this.txtText = txtText;
	}

	/**
	 * @return the comboTipo
	 */
	public JComboBox<Tipo> getComboTipo() {
		return comboTipo;
	}

	/**
	 * @param comboTipo the comboTipo to set
	 */
	public void setComboTipo(JComboBox<Tipo> comboTipo) {
		this.comboTipo = comboTipo;
	}

	/**
	 * @return the lblMensaje
	 */
	public JLabel getLblMensaje() {
		return lblMensaje;
	}

	/**
	 * @param lblMensaje the lblMensaje to set
	 */
	public void setLblMensaje(JLabel lblMensaje) {
		this.lblMensaje = lblMensaje;
	}

	/**
	 * @return the txtRuta
	 */
	public JTextField getTxtRuta() {
		return txtRuta;
	}

	/**
	 * @param txtRuta the txtRuta to set
	 */
	public void setTxtRuta(JTextField txtRuta) {
		this.txtRuta = txtRuta;
	}

	/**
	 * @return the list
	 */
	public JList getList() {
		return list;
	}

	/**
	 * @param list the list to set
	 */
	public void setList(JList list) {
		this.list = list;
	}

}
