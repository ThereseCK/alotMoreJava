package therese_amj;

public class Main {

    public static void main(String[] args) {
        var test = new Kjøretøy( "båt2", 2002.2, 202, TransportKlasse.jetfly);
        var test2 = new Kjøretøy( "båt", 2002.2, 202, TransportKlasse.jetfly);

        System.out.println(test);
        System.out.println(test2);
        test.Sammenligne(test2, "er kjøretøyene like? ");

        var fly1 = new Fly("bil", 20.00, 90, 8, 20, 20, TransportKlasse.lettKjøretøy );
        var fly2 = new Fly("bil", 20.00, 90, 8, 20, 20, TransportKlasse.lettKjøretøy );

        fly1.StartFly();
        fly1.toStringOptional(StringBuilder(fly1));
        System.out.println(fly1);
        System.out.println(fly2);

        fly1.Sammenligne(fly2, "er kjøretøyene like? ");


    }


}
