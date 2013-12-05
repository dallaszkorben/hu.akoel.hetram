package hu.akoel.hetram.test;

import hu.akoel.hetram.gui.MainPanel;

import java.util.Locale;

import javax.swing.SwingUtilities;

public class Test{

	public static void main(String[] args) {
		Locale.setDefault(new Locale("en", "US"));
		
		SwingUtilities.invokeLater( new Runnable(){

			@Override
			public void run() {
				new MainPanel();				
			}			
		});		
	}	
}

