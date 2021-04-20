package client.gui;

public class PauseOrContinueSlideshowButtonViewEditor extends ViewEditor{

	public PauseOrContinueSlideshowButtonViewEditor(SlideshowHandler s) {
		super(s);
	}
	
	private void setPauseOrContinueSlideshowButton(SlideshowHandler s) {
		System.out.println("Showing Pause/Continue Button.");
	}
	
	public void start() {
		super.start();
		this.setPauseOrContinueSlideshowButton(super.decoratedSlideshow);
	}

}
