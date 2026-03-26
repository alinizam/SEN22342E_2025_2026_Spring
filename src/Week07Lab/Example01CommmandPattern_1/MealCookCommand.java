package Week07Lab.Example01CommmandPattern_1;

public class MealCookCommand implements Command {
    Meal meal;
    MealCookCommand(Meal meal){
        this.meal = meal;
    }
    @Override
    public void execute() {
        meal.cook();
    }
}
