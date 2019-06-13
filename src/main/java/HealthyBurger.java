public class HealthyBurger extends Hamburger {

    private int maxValue = 6;

    @Override
    public void getAdditions() {
        chooseAdditions(maxValue);
    }

    @Override
    public void setRoll() {
        super.setRoll();
        super.setRoll();
    }
}
