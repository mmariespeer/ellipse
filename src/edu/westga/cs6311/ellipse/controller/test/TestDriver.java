/**
 * 
 */
package edu.westga.cs6311.ellipse.controller.test;
/**
 * This program is used to run the tests created in the ellipse demo.
 * @author Melissa Speer
 * @version September 15, 2016
 *
 */
public class TestDriver {

	/**
	 * This program will test the EllipseDemo methods
	 * @param args no args
	 */
	public static void main(String[] args) {
		System.out.println("Ellipse Demo Tests");
		System.out.println();
		EllipseDemo ellipseDemo = new EllipseDemo();
		ellipseDemo.testEllipsePart01();
		ellipseDemo.testEllipsePart02();
	}
}
