package br.univel;

import javax.swing.JFrame;

public class Frame extends JFrame{

	public void criarFrame(){
		JFrame jf = new JFrame();
		jf.setSize(600, 600);
		jf.setBounds(300,300, 300, 300);
		jf.setVisible(true);
		criarFrameCima();
	}
	
	public void criarFrameCima(){
		JFrame jf = new JFrame();
		jf.setSize(600, 600);
		jf.setBounds(300,300, 300, 300);
		jf.setVisible(true);
		jf.setExtendedState(MAXIMIZED_BOTH);
	}
	
}
