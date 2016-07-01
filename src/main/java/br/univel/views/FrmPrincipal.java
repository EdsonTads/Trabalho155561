package br.univel.views;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;

public class FrmPrincipal extends JFrame{
	
	public void chamarTela(){
		JFrame jf = new JFrame();
		jf.setSize(900, 900);
		jf.setVisible(true);
		jf.setLocationRelativeTo(null);
		jf.setExtendedState(MAXIMIZED_BOTH);
		jf.setTitle("ESoft Sistemas");
		jf.setJMenuBar(new Menu().Menu());
	}
	
	class Menu extends JFrame {

		public JMenuBar Menu(){
			
			JMenu item;
			JMenuBar menu = new JMenuBar();
			setJMenuBar(menu);
			
			
			item = new JMenu("Clientes");
			menu.add(item);

			item = new JMenu("Produtos");
			menu.add(item);
			
			item = new JMenu("Vendas");
			menu.add(item);
			
			item = new JMenu("Relatórios");
			menu.add(item);
			
			return menu;
			
		}
		
		
	}
	
	
}

