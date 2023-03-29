/** we use a loop to interact with the user */
import javax.swing.*;
public class TestAuto {

	public static void main(String[] args) {
		Auto car=new Auto();
		String loop ="";
		boolean moving= true;
		while(moving) {
			if(loop.equals("")) {
				String button2= JOptionPane.showInputDialog("Press OK");
				loop=button2;
				car.distanceCovered();
				car.printDistance();
					}else
				if(loop.equals("stop")) {		
			System.out.println("The car has stopped!");		
				moving=false;
			}
		}
	}

}
