package studio4;

import java.awt.Color;

import edu.princeton.cs.introcs.StdDraw;

public class Flag {
	public static void main(String[] args) {
		
	StdDraw.setPenRadius(0.01);
	StdDraw.setPenColor(100, 19, 25);
	StdDraw.filledRectangle(0.5, 0.5, 0.4, 0.3);
	double[] x = { 0.89, 0.49, 0.09, 0.49 };
	double[] y = { 0.49, 0.19, 0.49, 0.79 };
	StdDraw.polygon(x, y);
	}
}