package name.abhijitsarkar.algorithms.restaurant;

import java.util.List;

public class Food {
	private Category category;
	private List<String> ingredients;

	private enum Category {
		VEGATERIAN, NON_VEGETERIAN, VEGAN;
	}
}
