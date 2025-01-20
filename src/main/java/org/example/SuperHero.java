public class SuperHero extends Human{
    @Override
    public void fight() {
        str -= 3;
    }

    @Override
    public String toString() {
        return "Super Hero{" +
                "str=" + str +
                '}';
    }
}
