package therese_amj;

public abstract class Kjøretøy {
    public String RegNo;
    public int Effect;

    protected Kjøretøy(String regNo, int effect)
    {
        RegNo = regNo;
        Effect = effect;
    }

    public String PrintInformation()
    {
    return "- Reg.nr =" + RegNo + "\n- Effekt =" + Effect;
    }

    public String Run(){
        return "";
    }
}




