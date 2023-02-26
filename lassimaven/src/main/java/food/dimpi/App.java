package food.dimpi;

import javax.swing.JOptionPane;

import food.dimpi.model.Item;
import food.dimpi.service.FoodService;

public class App {
	public static void main(String[] args) {
		System.out.println("Hello USER!!!!!");

		// String itemname = JOptionPane.showInputDialog("enter menu", "type here");
		Item inThePlate = new FoodService().createOrder(JOptionPane.showInputDialog("enter menu", "type here"));
		JOptionPane.showMessageDialog(null, "your bill is " + inThePlate.getPrice());
	}
}
