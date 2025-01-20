public class Licantropo implements Pg{
    protected int str = 15;
    private boolean fullMoon = false;
    Licantropo(boolean fullMoon) {
        str = (fullMoon) ? 15 : 10;
    }

    public void cambioLuna() {
        fullMoon = !fullMoon;
    }

    public void combact() {
        if (fullMoon) {
            bite();
            return;
        }
        fight();
    }

    @Override
    public void fight() {
        str -= 2;
    }
    @Override
    public void bite() {
        str -= 3;
    }

    @Override
    public String toString() {
        return "Licantropo{" +
                "str=" + str +
                ", fullMoon=" + fullMoon +
                '}';
    }
}
