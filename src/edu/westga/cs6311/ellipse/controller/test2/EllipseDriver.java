package edu.westga.cs6311.ellipse.controller.test2;

/**
 *This driver will run the EllipseController.
 * @author Melissa Speer
 * @version September 19, 2016
 */
public class EllipseDriver {

	/**
	 *This is the entry point of the program.
	 * @param args no args
	 */
	public static void main(String[] args) {
		System.out.println("Ellipse Input Demo Tests");
		System.out.println();
		EllipseController ellipseDemo = new EllipseController();
		ellipseDemo.inputEllipseValues();
		System.out.println();
		ellipseDemo.initializeEllipse();
		ellipseDemo.demoEllipse();

	}

}
