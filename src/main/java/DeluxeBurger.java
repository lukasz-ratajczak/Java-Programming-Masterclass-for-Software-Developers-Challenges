public class DeluxeBurger extends Hamburger {
    @Override
    public void getAdditions() {
        setRoll();
        setMeat();
        setFries();
        setSoda();
        setPrice();
    }
}
