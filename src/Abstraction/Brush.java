package Abstraction;

public abstract class Brush implements Canvas {

	public void paint() {
		System.out.println("we can paint on canvas");
	}
	
	public void color() {
		System.out.println("we can use color");
	}
	
	public abstract void stroke();
	public abstract void canvasPaper();
	
	
	
}
