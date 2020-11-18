package therese_amj;

public class KjøretøyMaxFart extends Kjøretøy{
    public int MaxSpeed;
    public String MaxSpeedUnit;

    protected KjøretøyMaxFart(String regNo, int effect, int maxSpeed, String maxSpeedUnit) {
        super(regNo, effect);
        MaxSpeed = maxSpeed;
        MaxSpeedUnit = maxSpeedUnit;
    }

    @Override
    public String PrintInformation()
    {
        var test= super.PrintInformation();
        return  test + "\n- Maksfart = " + MaxSpeed+  MaxSpeedUnit;
    }

    @Override
    public String Run() {
        return " ";

    }
}
