package control;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.util.Iterator;
import java.util.LinkedList;

public class MyActionListener implements ActionListener {

	private ParaUI paraUI;
	private LinkedList<Object> listilla=new LinkedList<Object>();

	public MyActionListener(ParaUI paraUI) {
		this.paraUI = paraUI;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		paraUI.getLblMensaje().setText("");
		paraUI.getTxtText().setText("");
		String ruta = paraUI.getTxtRuta().getText();
		if (!ruta.isEmpty()) {

			File directorio = new File(ruta);
			if (directorio.exists()) {
				recorrerSistema(directorio);
			} else {
				paraUI.getLblMensaje().setText("La ruta dada no existe en el sistema");
			}

		} else {
			paraUI.getLblMensaje().setText("Introduzca una ruta a buscar");
		}
	}

	private void recorrerSistema(File elemento) {
		if (elemento.canRead()) {
			if (elemento.exists()) {
				if (elemento.isDirectory()) {
					File[] listFiles = elemento.listFiles();
					try {
						for (int i = 0; i < listFiles.length; i++) {
							recorrerSistema(listFiles[i]);
							
							String tipoArchivo = paraUI.getComboTipo().getSelectedItem().toString();
							if (listFiles[i].toString().endsWith(tipoArchivo)) {
								String text = paraUI.getTxtText().getText();
								paraUI.getTxtText().setText(text + listFiles[i].getName() + "\n");
								listilla.add(listFiles[i]);
							}
						}
					} catch (Exception e) {
					}

				}
			}
		} else {
			paraUI.getLblMensaje().setText("no tienes permisos de acceso en esa ruta");
		}
		Object[] temp= new Object[listilla.size()];
		int i = 0;
		for (Iterator iterator = listilla.iterator(); iterator.hasNext();) {
			Object object = (Object) iterator.next();
			temp[i]=object;
			i++;
		}

		paraUI.getList().setListData(temp);

	}

}
