package edu.westga.cs6311.ellipse.model;

import java.awt.geom.Point2D;

/**
 * This class defines the parameters for an Ellipse object which can be defined as a curve on a plain
 * surrounding two focal points such that a straight line drawn from one of the focal points to any point 
 * on the curve and back to the other focal point has the same length for every point on the curve.
 * @author Melissa Speer
 * @version September 15, 2016
 *
 */
public class Ellipse {

	private Point2D.Double centerPoint;
	private double majorRadius;
	private double minorRadius;
	
	/**
	 * Creates a horizontal ellipse based on a center point, and 2 radius'
	 * @param centerPoint Point2D.Double (x,y) double value coordinates for the center of the ellipse
	 * @param minorRadius the smaller (vertical) radius as a double
	 * @param majorRadius the larger (horizontal) radius as a double
	 */
	public Ellipse(Point2D.Double centerPoint, double majorRadius, double minorRadius) {
		this.centerPoint = centerPoint;
		this.majorRadius = majorRadius;
		this.minorRadius = minorRadius;
	}
	
	/**
	 * Method to call the centerPoint coordinate values for an ellipse.
	 * @return centerPoint coordinates
	 */
	public Point2D.Double getCenterPoint() {
		return this.centerPoint;
	}
	
	/**
	 * Method to call the major radius (on the x-axis in this class) as a double value.
	 * @return major radius as a double
	 */
	public double getMajorRadius() {
		return this.majorRadius;
	}
	
	/**
	 * Method to call the minor radius (on the y-axis in this class) as a double value.
	 * @return the minor radius as a double
	 */
	public double getMinorRadius() {
		return this.minorRadius;
	}
	
	/**
	 * Method to calculate the top point coordinates which is calculated by SUBTRACTING the minor 
	 * radius double value from the Y-coordinate of the center point double value coordinates (y decreases as it goes up).
	 * @return top point coordinate as a Point2D.Double
	 */
	public Point2D.Double getTopPoint() {
		Point2D.Double topPoint = new Point2D.Double(this.centerPoint.getX(), this.centerPoint.getY() - this.minorRadius);
		return topPoint;
	}
	
	/**
	 * Method to calculate right point coordinates which is calculated by adding the major radius 
	 * double values to the X-coordinate center point double value coordinates (x increases as it goes right).
	 * @return right point coordinates as a Point2D.Double
	 */
	public Point2D.Double getRightPoint() {
		Point2D.Double rightPoint = new Point2D.Double(this.centerPoint.getX() + this.majorRadius, this.centerPoint.getY());
		return rightPoint;
	}
	
	/**
	 * Method to calculate focal length value which is defined as the two points of an ellipse on the major axis that are 
	 * equidistant from the center point. The sum of the distances from any point P on the ellipse to those two foci is 
	 * constant and equal to the major axis.
	 * @return focal length as a double
	 */
	public double getFocalLength() {
		double focalLength = (Math.sqrt(this.majorRadius * this.majorRadius - this.minorRadius * this.minorRadius));
		return focalLength;
	}
	
	/**
	 * Method to calculate left focus point coordinates of an ellipse which is calculated by subtracting the focal length from the
	 * X-coordinate double value (major axis).
	 * @return left focus point coordinates as a Point2D.Double
	 */
	public Point2D.Double getLeftFocusPoint() {
		Point2D.Double leftFocusPoint = new Point2D.Double(this.centerPoint.getX() - this.getFocalLength(), this.centerPoint.getY());
		return leftFocusPoint;
	}
	
	/**
	 * Method to calculate and return right focus point of an ellipse which is calculated by adding the focal length to the X-coordinate
	 * double value (major axis).
	 * @return right focus point coordinates as a Point2D.Double
	 */
	public Point2D.Double getRightFocusPoint() {
		Point2D.Double rightFocusPoint = new Point2D.Double(this.centerPoint.getX() + this.getFocalLength(), this.centerPoint.getY());
		return rightFocusPoint;
	}
	
	/**
	 * Method to calculate the eccentricity of an ellipse (how close the ellipse is to being a circle) which can be found by
	 * dividing the focal length by the major radius
	 * @return eccentricity as a double value
	 */
	public double getEccentricity()	{
		double focalLength = (Math.sqrt(this.majorRadius * this.majorRadius - this.minorRadius * this.minorRadius));
		double eccentricity = focalLength / this.majorRadius;
		return eccentricity;
	}
	
	/**
	 * Method to calculate the circumference (distance around the ellipse) of an ellipse based off of the first formula given
	 * @return the calculated circumference as a double value
	 */
	public double getCircumference1() {
		double circumference1 = Math.PI * (3 * (this.majorRadius + this.minorRadius) - Math.sqrt(10 * this.minorRadius * this.majorRadius + 3 * (this.majorRadius * this.majorRadius + this.minorRadius * this.minorRadius)));
		return circumference1;
	}
	
	/**
	 * Method to calculate the circumference (distance around the ellipse) of an ellipse based off of the second formula given,
	 * utilizing a local variable 'localH' to hold part of the given formula for a more readable program.
	 * @return the second circumference as a double value
	 */
	public double getCircumference2() {
		double localH = Math.pow(this.majorRadius - this.minorRadius, 2) / Math.pow(this.majorRadius + this.minorRadius, 2);
		double circumference2 = Math.PI * (this.majorRadius + this.minorRadius) * (1 + (3 * localH) / (10 + Math.sqrt(4 - 3 * localH)));
		return circumference2;
	}
	
}