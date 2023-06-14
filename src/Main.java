public class Main {
    public static void main(String[] args) {
        //creeaza un obiect din clasa DemoClass
//        DemoClass obiect1 = new DemoClass();
//        DemoClass obiect2 = new DemoClass();
//        System.out.println(obiect1.x);
//        System.out.println(obiect2.x);
//        obiect1.x=6;
//        System.out.println(obiect1.x);
//        System.out.println(obiect2.x);
//        obiect1.afiseazaText();
//        obiect2.text = "something else";
//        System.out.println(obiect2.text);
        //DemoClass.afiseazaTextStatic();

        Human cristina = new Human();//instantiem obiect din clasa Human
        cristina.email="cristina@test.com";//atribuim valori
        cristina.verify();
        cristina.sendEmail();
        System.out.println(cristina.email);
        Human jon = new Human();//adaugam un obiect nou
        jon.address="Test Street 123";
        System.out.println(jon.address);
        System.out.println(jon.email);

        Book book1 = new Book();
        Book book2 = new Book();
        book1.author="Mihai Eminescu";
        book1.title="Poezii";
        System.out.println(book1.afiseaza());

    }
}
