package studio4;

import java.awt.Color;

import edu.princeton.cs.introcs.StdDraw;

public class Flag {
	public static void main(String[] args) {
		StdDraw.setPenColor(255, 255, 0);
		double[] x = {0.5, 0.42, 0.5};
   		double[] y = {0.5, 0.525, 0.55};
   		StdDraw.filledPolygon(x, y);
		StdDraw.setPenColor(0,104,71);
		StdDraw.filledRectangle(0.1,0.5,0.225,0.3);
		StdDraw.setPenColor(206, 17, 38);
		StdDraw.filledRectangle(0.9,0.5,0.225,0.3);
		StdDraw.setPenColor(Color.BLACK);
		StdDraw.rectangle(0.5, 0.5, 0.5, 0.3);
		StdDraw.setPenColor(150, 75, 0);
		StdDraw.filledCircle(0.5, 0.525, 0.05);
		StdDraw.setPenColor(61, 130, 136);
		StdDraw.setPenRadius(0.015);
		StdDraw.arc(0.5, 0.54, 0.08, 200, 290);
		StdDraw.setPenColor(129, 134, 81);
		StdDraw.setPenRadius(0.015);
		StdDraw.arc(0.5, 0.53, 0.1, 185, 355);
		StdDraw.setPenColor(161, 160, 114);
		StdDraw.setPenRadius(0.005);
		StdDraw.line(0.42, 0.525, 0.42, 0.5);
	}
}