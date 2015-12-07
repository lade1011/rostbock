package libraries;

import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

import com.apple.eawt.Application;

public class LookAndFeel {
	/**
	 * @author: Simon Holzmayer
	 */
	public LookAndFeel() {
		// set the name of the application menu item
		System.setProperty("com.apple.mrj.application.apple.menu.about.name", "goShare");
		// take the menu bar off the jframe
		System.setProperty("apple.laf.useScreenMenuBar", "true");

		// set the look and feel
		Application application = Application.getApplication();

		try {
			UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());

		} catch (ClassNotFoundException e) {
			System.out.println("[ERR] - LookAndFeel (1)");
		} catch (InstantiationException e) {
			System.out.println("[ERR] - LookAndFeel (2)");
		} catch (IllegalAccessException e) {
			System.out.println("[ERR] - LookAndFeel (3)");
		} catch (UnsupportedLookAndFeelException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}