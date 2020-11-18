package therese_amj;

public class Båt extends KjøretøyMaxFart {
    public int GrossTonnage;

    protected Båt(String regNo, int effect, int maxSpeed, String maxSpeedUnit, int grossTonnage) {
        super(regNo, effect, maxSpeed, maxSpeedUnit);
        GrossTonnage = grossTonnage;
    }

    @Override
    public String Run() {
        return "BÅTEN GÅR!! FORT!!";
    }

    public String PrintInformation()
    {
       var superText =  super.PrintInformation();

    return " ** Båt **  \n"+
            superText +
            " - Bruttotonnasje =" + GrossTonnage + "kg";
    }
}
