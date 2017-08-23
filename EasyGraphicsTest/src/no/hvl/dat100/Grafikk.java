package no.hvl.dat100;
import easygraphics.*;

public class Grafikk extends EasyGraphics {
	public static void main(String[] args) {
		launch(args);
	} //random comment
	public void run() {
		makeWindow("Grafikk", 500, 350);
		drawCircle(150, 130, 60);
		drawCircle(150, 250, 60);
	}
}