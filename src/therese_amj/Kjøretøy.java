package therese_amj;


import java.lang.annotation.Target;
import java.util.HashMap;
import java.util.Map;


public class Kjøretøy {
    public String Kjennemerke;
    public double Effekt;
    public double MaksFart;
    public TransportKlasse type;
    public HashMap<String,String> Enheter;

    public Kjøretøy(String kjennemerke, double effekt, double maksFart, TransportKlasse type){
        this.Kjennemerke = kjennemerke;
        this.Effekt = effekt;
        this.MaksFart = maksFart;
        this.type = type;
    }
        public void Test() {
        Enheter = new HashMap<>();
        Enheter.put("maksfart", "km/t");
        Enheter.put("Effekt", "kw");
        }


        /*
        {nameof(MaksFart), "km/t" },
        {nameof(Effekt), "kw" },*/


    public String toString() {
        return "Kjøretøy= " +
                "Kjennemerke='" + Kjennemerke + '\'' +
                ", Effekt=" + Effekt +
                ", MaksFart=" + MaksFart +
                ", type=" + type +
                ' ';
    }

   /* public Override String ()
    {

        var text = new StringBuilder();
        text.AppendLine(GetType().Name);
        Add(text, nameof(Kjennemerke), Kjennemerke);
        Add(text, nameof(MaksFart), MaksFart);
        Add(text, nameof(Effekt), Effekt);
        ToStringOptional(text);
        return text.ToString();
    }*/
    protected void Add(StringBuilder text, String name, Object value)
    {
        if (value == null) return;
        text.append("  ");
        text.append(name);
        text.append("=");
        text.append(value);
        if (Enheter.containsKey(name)) text.append(Enheter);
        System.out.println();
    }
    public void toStringOptional(StringBuilder text)
    {
        Add(text, "TransportKlasse", type);
    }

    public void Print()
    {
        System.out.println(toString());
    }
    public void Sammenligne(Kjøretøy kjøretøy2, String prefix)
    {
        var erLike = Kjennemerke.equals(kjøretøy2.Kjennemerke);
        var erLikeTekst = erLike ? "" : "ikke ";
        System.out.println(prefix);
        System.out.println("Det er " + erLikeTekst + "samme kjøretøy."  );

        System.out.println();
    }
}


