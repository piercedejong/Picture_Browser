package client.gui;
public class ImageSizeControllerViewEditor extends ViewEditor {
	public ImageSizeContraollerViewEditor(SlideshowHandler s) {
		super(s);
	}
	private void setImageSizeController(SlideshowHandler s) {
		System.out.println("Showing image size controller.");
	}

	public void start() {
		super.start();
		this.setImageSizeController(super.decoratedSlideshow);
	}
}
