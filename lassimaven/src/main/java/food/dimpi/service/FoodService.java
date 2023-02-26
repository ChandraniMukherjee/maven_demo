package food.dimpi.service;

import java.util.UUID;

import food.dimpi.accounts.PriceAll;
import food.dimpi.model.Item;

public class FoodService {

	public Item createOrder(String itemname) {
		return new Item(UUID.randomUUID(), itemname, PriceAll.bill(itemname));
	}

}
