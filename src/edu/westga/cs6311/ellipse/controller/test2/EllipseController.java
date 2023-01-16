package edu.westga.cs6311.ellipse.controller.test2;

import java.awt.geom.Point2D;
import java.util.Scanner;
import edu.westga.cs6311.ellipse.model.Ellipse;

/**
 * This class defines the parameters for an Ellipse object which can accept user input
 * and calculate values based on the user input values.
 * @author Melissa Speer
 * @version September 19, 2016
 */

public class EllipseController {
	private Ellipse ellipse;
	private Point2D.Double centerPoint;
	private double xValue;
	private double yValue;
	private double majorRadius;
	private double minorRadius;
	
	/**
	 * Creates a horizontal ellipse object based on a center point, and 2 radius'
	 */
	public EllipseController() {
		this.ellipse = null;
		this.centerPoint = new Point2D.Double(0.0, 0.0);
		this.majorRadius = 0.0;
		this.minorRadius = 0.0;
	}
	
	/**
	 * Scanner method accepts and stores user input for the ellipse
	 */
	public void inputEllipseValues() {
		
		Scanner input = new Scanner(System.in);
		System.out.print("Enter x-coordinate value for the centerpoint: ");
		this.xValue = input.nextDouble();
		System.out.print("Enter y-coordinate value for the centerpoint: ");
		this.yValue = input.nextDouble();
		this.centerPoint = new Point2D.Double(this.xValue, this.yValue);
		System.out.print("Enter a value for the major radius: ");
		this.majorRadius = input.nextDouble();
		System.out.print("Enter a value for the minor radius: ");
		this.minorRadius = input.nextDouble();
		input.close();
	}
	
	/**
	 * Initialize ellipse with user input values
	 */
	public void initializeEllipse() {
		this.ellipse = new Ellipse(this.centerPoint, this.majorRadius, this.minorRadius);
	}
	
	/**
	 * Calcualte and display user input values
	 */
	public void demoEllipse() {
		System.out.println("The values of your new ellipse are: ");
		System.out.println("Center Point Coordinates: " + this.ellipse.getCenterPoint());
		System.out.println("Major Radius: " + this.ellipse.getMajorRadius());
		System.out.println("Minor Radius: " + this.ellipse.getMinorRadius());
		System.out.println("Top Point Coordinates: " + this.ellipse.getTopPoint());
		System.out.println("Right Point Coordinates: " + this.ellipse.getRightPoint());
		System.out.println("Focal Length: " + this.ellipse.getFocalLength());
		System.out.println("Left Focus Point Coordinates: " + this.ellipse.getLeftFocusPoint());
		System.out.println("Right Focus Point Coordinates: " + this.ellipse.getRightFocusPoint());
		System.out.println("Eccentricity Value: " + this.ellipse.getEccentricity());
		System.out.println("Circumference Value (formula 1): " + this.ellipse.getCircumference1());
		System.out.println("Circumference Value (formula 2): " + this.ellipse.getCircumference2());
	}
	
}	


