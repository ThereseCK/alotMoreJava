package therese_amj;

public  class Fly extends Kjøretøy {
    public int WingSpan;
    public int LoadCapacity;
    public int Weight;


    protected Fly(String regNo, int effect, int wingSpan, int loadCapacity, int weight) {
        super(regNo, effect);
        this.WingSpan = wingSpan;
        this.LoadCapacity = loadCapacity;
        this.Weight = weight;
    }

    public String PrintInformation()
    {
        var superText = super.PrintInformation();
        return " ** Fly **  \n"+
                    superText +
                "\n - Vingespenn " + WingSpan + "m \n"+
                " - Vingespenn " + LoadCapacity + "tonn\n"+
                " - Vingespenn " + Weight + "tonn";
    }

    public String Run()
    {
        return "Nå Tar flyet av!!!";
    }
}

