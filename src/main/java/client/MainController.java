package client;

import java.awt.DisplayMode;

import javax.swing.JFrame;

import client.bll.SlideshowController;
import client.gui.*;

/**
 * This class initializes all that is necessary to run the
 * slide show
 * 
 * @author Stian Sandve <stian@sandve.org>
 *
 */

public class MainController {
	
	private static SlideshowController slideshow;
	private static MainWindow wnd;
	
	public static void main(String[] args) {
		initializeSlideshow();
		//Edited code for SENG 401 Project///////////////////////////////////////
		//Add decorator image size controller and decorator pause/continue button to slide show
		SlideshowHandler slideshowWithImageSizeController = new ImageSizeContraollerViewEditor
				(new PauseOrContinueSlideshowButtonViewEditor(slideshow));
        /////////////////////////////////////////////////////////////////////////
		setFullScreenMode();
		setVisible();
		//Edited code for SENG 401 Project///////////////////////////////////////
		//startSlideshow();
		slideshowWithImageSizeController.start();//Start decorated slideshow
        /////////////////////////////////////////////////////////////////////////
		
	}
	
	private static void initializeSlideshow() {
		slideshow = new SlideshowController();
		wnd = new MainWindow(slideshow.getView());
		wnd.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}
	
	private static void setVisible() {
		wnd.pack();
		wnd.setVisible(true);
	}
	
	private static void setFullScreenMode() {
		DisplayMode dm=new DisplayMode(800, 600, 16, DisplayMode.REFRESH_RATE_UNKNOWN);
		wnd.setFullScreenMode(dm);
	}
	
	private static void startSlideshow() {
		slideshow.start();
	}
}
