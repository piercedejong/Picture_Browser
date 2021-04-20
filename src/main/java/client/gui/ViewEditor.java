package client.gui;
import java.awt.image.BufferedImage;
public abstract class ViewEditor implements SlideshowHandler{
	protected SlideshowHandler decoratedSlideshow;
	public ViewEditor(SlideshowHandler s) {
		this.decoratedSlideshow = s;
	}
	@Override
	public void start() {
		this.decoratedSlideshow.start();
	}
    @Override
		public void stop() {
		this.decoratedSlideshow.stop();
	}
	@Override
	public BufferedImage next() {
		return this.decoratedSlideshow.next();
	}
	@Override
	public BufferedImage previous() {
		return this.decoratedSlideshow.previous();
	}
	@Override
	public int getDelay() {
		return this.decoratedSlideshow.getDelay();
	}
}
