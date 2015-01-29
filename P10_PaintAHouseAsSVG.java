import java.io.BufferedWriter;
import java.io.FileWriter;
import java.util.Scanner;

//this is not my solution
public class P10_PaintAHouseAsSVG {
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		BufferedWriter wr = null;
		
		try {
			wr = new BufferedWriter(new FileWriter("house.html"));
		 
		wr.write("<!DOCTYPE html>\n"
				+ "<html>\n"
				+ "<body>\n");
		wr.write("	<svg width=\"500\" height=\"400\" style=\"fill:none;stroke-width:2\">\n");
		wr.write("	<polyline points=\"250 170 350 70 450 170 250 170 250 270 350 270 "
        		+ "350 170 400 170 400 270 450 270 450 170\" "
        		+ "style=\"stroke:#00118d;fill:gray;opacity:0.7\"/>\n");
		wr.write("	<text x=\"190\"  y=\"30\" style=\"font-size:18;word-spacing:18;"
        		+ "font-family:Arial;fill:black\">10 12.5 15 17.5 20 22.5</text>\n");
		wr.write("	<line x1=\"200\" y1=\"35\" x2=\"200\" y2=\"355\" "
        		+ "style=\"stroke:blue;stroke-width:1;stroke-dasharray:2 2;opacity:0.2\"/>\n");
		wr.write("	<line x1=\"250\" y1=\"35\" x2=\"250\" y2=\"355\" "
        		+ "style=\"stroke:blue;stroke-width:1;stroke-dasharray:2 2;opacity:0.2\"/>\n");
		wr.write("	<line x1=\"300\" y1=\"35\" x2=\"300\" y2=\"355\" "
        		+ "style=\"stroke:blue;stroke-width:1;stroke-dasharray:2 2;opacity:0.2\"/>\n");
		wr.write("	<line x1=\"350\" y1=\"35\" x2=\"350\" y2=\"355\" "
        		+ "style=\"stroke:blue;stroke-width:1;stroke-dasharray:2 2;opacity:0.2\"/>\n");
		wr.write("	<line x1=\"400\" y1=\"35\" x2=\"400\" y2=\"355\" "
        		+ "style=\"stroke:blue;stroke-width:1;stroke-dasharray:2 2;opacity:0.2\"/>\n");
		wr.write("	<line x1=\"450\" y1=\"35\" x2=\"450\" y2=\"355\" "
        		+ "style=\"stroke:blue;stroke-width:1;stroke-dasharray:2 2;opacity:0.2\"/>\n");
		wr.write("	<text x=\"135\"  y=\"75\" style=\"font-size:18;"
        		+ "font-family:Arial;fill:black\">3.5</text>\n");
		wr.write("	<text x=\"145\"  y=\"125\" style=\"font-size:18;"
        		+ "font-family:Arial;fill:black\">6</text>\n");
		wr.write("	<text x=\"135\"  y=\"175\" style=\"font-size:18;"
        		+ "font-family:Arial;fill:black\">8.5</text>\n");
		wr.write("	<text x=\"140\"  y=\"225\" style=\"font-size:18;"
        		+ "font-family:Arial;fill:black\">11</text>\n");
		wr.write("	<text x=\"125\"  y=\"275\" style=\"font-size:18;"
        		+ "font-family:Arial;fill:black\">13.5</text>\n");
		wr.write("	<text x=\"140\"  y=\"325\" style=\"font-size:18;"
        		+ "font-family:Arial;fill:black\">16</text>\n");
		wr.write("	<line x1=\"165\" y1=\"70\" x2=\"480\" y2=\"70\" "
        		+ "style=\"stroke:blue;stroke-width:1;stroke-dasharray:2 2;opacity:0.2\"/>\n");
		wr.write("	<line x1=\"165\" y1=\"120\" x2=\"480\" y2=\"120\" "
        		+ "style=\"stroke:blue;stroke-width:1;stroke-dasharray:2 2;opacity:0.2\"/>\n");
		wr.write("	<line x1=\"165\" y1=\"170\" x2=\"480\" y2=\"170\" "
        		+ "style=\"stroke:blue;stroke-width:1;stroke-dasharray:2 2;opacity:0.2\"/>\n");
		wr.write("	<line x1=\"165\" y1=\"220\" x2=\"480\" y2=\"220\" "
        		+ "style=\"stroke:blue;stroke-width:1;stroke-dasharray:2 2;opacity:0.2\"/>\n");
		wr.write("	<line x1=\"165\" y1=\"270\" x2=\"480\" y2=\"270\" "
        		+ "style=\"stroke:blue;stroke-width:1;stroke-dasharray:2 2;opacity:0.2\"/>\n");
		wr.write("	<line x1=\"165\" y1=\"320\" x2=\"480\" y2=\"320\" "
        		+ "style=\"stroke:blue;stroke-width:1;stroke-dasharray:2 2;opacity:0.2\"/>\n");
		
		for (int i = 0; i < n; i++) {
			double x = scan.nextDouble();
			double y = scan.nextDouble();
			if (isPointInRectangles(x, y) == true || isPointInTriangle(x, y) == true) {
				wr.write(String.format("	<circle cx=\"%d\" cy=\"%d\" r=\"3\" style=\"stroke:black;fill:black\"/>\n", (int)(x*20), (int)(y*20)));
			} else {
				wr.write(String.format("	<circle cx=\"%d\" cy=\"%d\" r=\"3.5\" style=\"stroke:#3c3c3c;stroke-width:1;fill:gray\"/>\n", (int)(x*20), (int)(y*20)));
			}
		}
		wr.write("</svg>\n");
		wr.write("</body>\n");
		wr.write("</html>\n");
        wr.close();
		} catch (Exception e) {
			System.out.println("Error");
		}
		

	}
	
	public static Boolean isPointInRectangles(double x, double y) {
		boolean isPointInRectangles = false;
		if (x >= 12.5 && x <= 22.5 && y >= 8.5 && y <= 13.5) {
			if (x > 17.5 && x< 20 && y > 8.5) {
				isPointInRectangles = false;
			} else {
				isPointInRectangles = true;
			}
		} else {
			isPointInRectangles = false;
		}
		return isPointInRectangles;
	}
	
	public static Boolean isPointInTriangle (double x, double y) {
		Boolean isPointInTriangle = false;
		double horPosition = ((22.5-12.5)*(y-8.5) - (8.5-8.5)*(x-12.5));
		double leftPosition = ((17.5-12.5)*(y-8.5) - (3.5-8.5)*(x-12.5));
		double rightPosition = ((22.5-17.5)*(y-3.5) - (8.5-3.5)*(x-17.5));
		if (horPosition <= 0 && leftPosition >= 0 && rightPosition >= 0) {
			isPointInTriangle = true; 
		}
		return isPointInTriangle;
	}
	
}