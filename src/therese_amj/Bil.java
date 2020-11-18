package therese_amj;

public class Bil extends KjøretøyMaxFart{
    public String Color;
    public Boolean IsLightVehicle;

        protected Bil(String regNo, int effect, int maxSpeed, String maxSpeedUnit, String color, Boolean isLightVehicle) {
        super(regNo, effect, maxSpeed, maxSpeedUnit);
        Color = color;
        IsLightVehicle = isLightVehicle;

    }

    @Override
    public String PrintInformation(){
        var lettOrNot = IsLightVehicle == true ? "- Lett Kjøretøy" : " ";
        var superText = super.PrintInformation();
        var bilText =   "** Bil **\n"+
                 superText +
                 "\n- Farge = " + Color +
                 "\n" +lettOrNot;

        /*if(IsLightVehicle) System.out.println( " - Lett Kjøretøy");*/
        return bilText;

    }

    @Override
    public String Run(){
        return  " BILEN KJØRER!!!";
    }

}
