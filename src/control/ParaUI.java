package control;

import javax.swing.DefaultComboBoxModel;

import modelo.Tipo;
import vista.UI;

public class ParaUI extends UI {
	public ParaUI() {
		super();
		MyActionListener listener = new MyActionListener(this);
		getComboTipo().setModel(new DefaultComboBoxModel<Tipo>(Tipo.values()));
		getTxtRuta().addActionListener(listener);
	}
}
