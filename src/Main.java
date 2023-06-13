public class Main {
    public static void main(String[] args) {
        //creeaza un obiect din clasa DemoClass
        DemoClass obiect1 = new DemoClass();
        DemoClass obiect2 = new DemoClass();
        System.out.println(obiect1.x);
        System.out.println(obiect2.x);
        obiect1.x=6;
        System.out.println(obiect1.x);
        System.out.println(obiect2.x);
        obiect1.afiseazaText();
        obiect2.text = "something else";
        System.out.println(obiect2.text);
        //DemoClass.afiseazaTextStatic();
    }
}
