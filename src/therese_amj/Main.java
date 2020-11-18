package therese_amj;

public class Main {

    public static void main(String[] args) {
        var plane = new Fly("LN1234", 1000, 30, 2, 10);
        System.out.println(plane.PrintInformation());
        System.out.println(plane.Run());

        var boat = new Båt("ABC123", 100, 30, "Knop", 300);
        System.out.println(boat.PrintInformation());
        System.out.println(boat.Run());

        var car1 = new Bil(
                "NF123456",
                147,
                200,
                "KM/T",
                "grønn",
                true);
        car1.PrintInformation();

        var car2 = new Bil(
                "NF654321",
                150,
                195,
                "km/t",
                "blå",
                true);

        System.out.println(car1.PrintInformation());
        System.out.println(car1.Run());

        System.out.println(car2.PrintInformation());
        System.out.println(car2.Run());



        var testing = new KjøretøyMaxFart("obs", 8769, 98, "knop");

        System.out.println(testing.PrintInformation());
    }


}
