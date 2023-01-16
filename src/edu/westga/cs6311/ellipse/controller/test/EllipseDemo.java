package edu.westga.cs6311.ellipse.controller.test;

import java.awt.geom.Point2D;
import edu.westga.cs6311.ellipse.model.*;
/**
 * This class is used to test the Ellipse class.
 * @author Melissa Speer
 * @version September 15, 2016
 *
 */
public class EllipseDemo {
	private Ellipse ellipse;
	
	/**
	 * Creates a horizontal ellipse with a center point, a major radius on the x-axis, and a minor radius
	 * on the y-axis.
	 */
	public EllipseDemo() {
		Point2D.Double centerPoint = new Point2D.Double(10.0, 8.4);
		this.ellipse = new Ellipse(centerPoint, 8.0, 4.0);
		
	}

	/**
	 * This is a helper method used to print expected and actual coordinate Point2D.Double values
	 * @param centerPoint Point2D.Double value for centerPoint
	 * @param xValue The horizontal coordinate for the centerPoint as a double
	 * @param yValue The vertical coordinate for the centerPoint as a double
	 */
	private void displayPointInformation(Point2D.Double centerPoint, double xValue, double yValue) {
		System.out.println("\tExpected x:\t" + xValue);
		System.out.println("\tActual x:\t" + centerPoint.getX());		
		System.out.println("\n\tExpected y:\t" + yValue);
		System.out.println("\tActual y:\t" + centerPoint.getY());
	}
	/**
	 * A set of tests utilizing the ellipse class.
	 * Center Point Value, Major Radius, Minor Radius, Top Point Value,
	 * Right Point Value, Focal Length, Left Focus Point and Right Focus Point
	 */
	public void testEllipsePart01() {
		Point2D.Double centerPoint = this.ellipse.getCenterPoint();
		System.out.println("***Testing for Center Point Value***");
		this.displayPointInformation(centerPoint, centerPoint.getX(), centerPoint.getY());
		System.out.println();
		System.out.println("***Testing for Major Radius Value***");
		System.out.println("\tExpected Radius: 8.0");
		System.out.println("\tActual Radius:   " + this.ellipse.getMajorRadius());
		System.out.println();
		System.out.println("***Testing for Minor Radius Value***");
		System.out.println("\tExpected Radius: 4.0");
		System.out.println("\tActual Radius:   " + this.ellipse.getMinorRadius());
		System.out.println();
		System.out.println("***Testing for Top Point Value***");
		this.displayPointInformation(this.ellipse.getTopPoint(), centerPoint.getX(), centerPoint.getY() - this.ellipse.getMinorRadius());
		System.out.println();
		System.out.println("***Testing for Right Point Value***");
		this.displayPointInformation(this.ellipse.getRightPoint(), centerPoint.getX() + this.ellipse.getMajorRadius(), centerPoint.getY());
		System.out.println();
		System.out.println("***Testing for Focal Length Value***");
		System.out.println("\tExpected Focal Length:\t6.928 ");
		System.out.println("\tActual Focal Length:\t" + this.ellipse.getFocalLength());
		System.out.println();
		System.out.println("***Testing for Left Focus Point Value***");
		this.displayPointInformation(this.ellipse.getLeftFocusPoint(), centerPoint.getX() - this.ellipse.getFocalLength(), centerPoint.getY());
		System.out.println();
		System.out.println("***Testing for Right Focus Point Value***");
		this.displayPointInformation(this.ellipse.getRightFocusPoint(), centerPoint.getX() + this.ellipse.getFocalLength(), centerPoint.getY());
		System.out.println();
	}
	
	/**
	 * A second set of test's for an ellipse.
	 * Eccentricity, Circumference1 and Circumference2
	 */
	public void testEllipsePart02() {
		System.out.println("***Testing for Eccentricity***");
		System.out.println("\tExpected Value: 0.86602");
		System.out.println("\tActual Value: \t" + this.ellipse.getEccentricity());
		System.out.println();
		System.out.println("***Testing for Circumference 1***");
		System.out.println("\tExpected Value: 38.75368\t");
		System.out.println("\tActual Value: \t" + this.ellipse.getCircumference1());
		System.out.println();
		System.out.println("***Testing for Circumference 2***");
		System.out.println("\tExpected Value: 38.75379\t");
		System.out.println("\tActual Value:\t" + this.ellipse.getCircumference2());
		System.out.println();
	}
	
}
