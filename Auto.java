import javax.swing.JOptionPane; 
public class Auto {
	private String velocity=JOptionPane.showInputDialog("Type an initial velocity:");
	private String accelerationString=JOptionPane.showInputDialog("Type an acceleration:");
	private int initialVelocity=Integer.valueOf(velocity);
	private int acceleration=Integer.valueOf(accelerationString);
	private int time=1;
	private double distance;

	public void distanceCovered() {
		distance=initialVelocity*time+(acceleration*(Math.pow(time, 2))/2);
		time++;
	}
public void printDistance() {
	System.out.println("Distance covered:"+distance+"m");
}
}

