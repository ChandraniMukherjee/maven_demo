package food.dimpi.accounts;

public class PriceAll {

	public static double bill(String item) {
		double price = switch (item) {
		case "cbiriani" -> 120.00;
		case "mbiriani" -> 220.00;
		case "pbiriani" -> 80.00;
		default -> 0.00;
		};
		return price;
	}

}
