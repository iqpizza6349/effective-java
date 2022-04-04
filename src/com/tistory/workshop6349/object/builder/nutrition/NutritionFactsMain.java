package com.tistory.workshop6349.object.builder.nutrition;

public class NutritionFactsMain {

    public static void main(String[] args) {
        NutritionFactsGradual nutritionFacts =
                new NutritionFactsGradual(0, 0, 0, 0, 0, 0);

        NutritionFactsJavaBeans nutritionFactsJavaBeans = new NutritionFactsJavaBeans();
        nutritionFactsJavaBeans.setCalories(0);
        nutritionFactsJavaBeans.setFat(0);
        nutritionFactsJavaBeans.setCarbohydrate(0);
        nutritionFactsJavaBeans.setServings(0);
        nutritionFactsJavaBeans.setSodium(0);
        nutritionFactsJavaBeans.setServingSize(0);

        NutritionBuilder builder = new NutritionBuilder.Builder(0, 0)
                .sodium(0)
                .calories(0)
                .carbohydrate(0)
                .fat(0)
                .build();
    }

}
