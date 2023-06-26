public class Patruped extends Animal{
    String numePatruped;

    public Patruped(String nume, String culoare, boolean isVegetarian, String numePatruped) {
        super(nume, culoare, isVegetarian);
                this.numePatruped = numePatruped;

    }

    public Patruped(String numePatruped) {
        this.numePatruped = numePatruped;
        nrPicioare = 4;
    }

}
