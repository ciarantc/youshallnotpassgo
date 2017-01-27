package practical2;

import javax.swing.JOptionPane;

public class circlearea {

	public static void main(String[] args)
	{
		String radius;
		Double numrad;
		Double area;
		radius = JOptionPane.showInputDialog(null,"Enter the radius of a circle:");
		numrad = Double.parseDouble(radius);
		area = (numrad*numrad*3.1416);
		JOptionPane.showMessageDialog(null,"Circle of radius " +numrad + " is " + area);
		System.exit(0);
	}

}
