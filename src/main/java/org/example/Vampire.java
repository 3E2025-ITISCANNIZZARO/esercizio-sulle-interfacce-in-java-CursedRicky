public class Vampire extends Extrahuman{
    @Override
    public void bite() {
        str -= 2;
    }

    @Override
    public String toString() {
        return "Vampire{" +
                "str=" + str +
                '}';
    }
}
