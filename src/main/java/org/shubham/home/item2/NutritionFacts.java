package org.shubham.home.item2;

/*
 * Consider a builder when faced with many constructor parameters
 * 
 * Consider the case of a class representing the 
 * Nutrition Facts label that appears on packaged foods. These labels have a few 
 * required fields—serving size, servings per container, and calories per serving— 
 * and over twenty optional fields—total fat, saturated fat, trans fat, cholesterol,
 *  sodium, and so on. Most products have nonzero values for only a few of these 
 *  optional fields.
 */

//Builder Pattern
public class NutritionFacts {
	private final int servingSize;
	private final int servings;
	private final int calories;
	private final int fat;
	private final int sodium;
	private final int carbohydrate;

	public static class Builder {
//Required parameters
		private final int servingSize;
		private final int servings;

		/**Optional parameters initialized to default values*/
		
		private int calories;
		private int fat;
		private int carbohydrate;
		private int sodium;
		
		public Builder(int servingSize, int servings) {
			this.servingSize = servingSize;
			this.servings = servings;
		}

		public Builder calories(int val) {
			calories = val;
			return this;
		}

		public Builder fat(int val) {
			fat = val;
			return this;
		}

		public Builder carbohydrate(int val) {
			carbohydrate = val;
			return this;
		}

		public Builder sodium(int val) {
			sodium = val;
			return this;
		}

		public NutritionFacts build() {
			return new NutritionFacts(this);
		}
	}

	private NutritionFacts(Builder builder) {
		servingSize = builder.servingSize;
		servings = builder.servings;
		calories = builder.calories;
		fat = builder.fat;
		sodium = builder.sodium;
		carbohydrate = builder.carbohydrate;
	}
	
	public static void main(String[] args) {
		NutritionFacts cocaCola = new NutritionFacts.Builder(240, 8).
				calories(100).sodium(35).carbohydrate(27).build();
	}
}