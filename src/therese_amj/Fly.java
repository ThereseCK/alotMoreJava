package therese_amj;

public class Fly extends  Kjøretøy {
    public double VingeSpenn;
    public double Lasteevne;
    public double EgenVekt;


    public Fly(String kjennemerke, double vingespenn, double lasteevne, double egenVekt,  double effekt, double maksFart, TransportKlasse type) {
        super(kjennemerke, effekt, maksFart, type);
        this.VingeSpenn = vingespenn;
        this.Lasteevne = lasteevne;
        this.EgenVekt = egenVekt;
    }
    public void Test(){

        Enheter.put("vingespenn", "m");
        Enheter.put("Lasteevne: ", "tonn");
        Enheter.put("Egenvekt: ", "tonn");
    }

    public void toStringOptional(StringBuilder text)
    {
        super.toStringOptional(text);
        Add(text,"vingespenn: ", VingeSpenn);
        Add(text, "lasteevne", Lasteevne);
        Add(text, "egenvekt: ", EgenVekt);
    }

    public void StartFly()
    {
        System.out.println("fly " + Kjennemerke + " har fått bedskjed om å fly ! " );
       System.out.println("-----------------------------");

    }
}

