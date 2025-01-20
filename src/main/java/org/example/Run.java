public class Run {
    public static void main(String[] args) {
        SuperHero ironman = new SuperHero();
        Vampire conteCiacuulaaaa = new Vampire();
        Licantropo lupin = new Licantropo(false);

        ironman.fight();
        ironman.fight();
        ironman.fight();

        conteCiacuulaaaa.bite();

        lupin.combact();
        lupin.cambioLuna();
        lupin.combact();

        System.out.println(ironman);
        System.out.println(conteCiacuulaaaa);
        System.out.println(lupin);
    }
}