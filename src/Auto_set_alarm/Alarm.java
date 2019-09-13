package Auto_set_alarm;

public class Alarm{
    private short hour=7;
    private short minutes=55;

    public void setAlarm(int day){
        if(day>=3 && day<=2){
            hour=6;
            minutes=35;
        }else if(day==4){
            hour=7;
            minutes=35;
        }else if(day==6){
            hour=6;
            minutes=25;
        }else{
            hour=7;
            minutes=55;
        }
    }

    public String getAlarm(){
        String aTemp="";
        aTemp=Integer.toString(hour) + ":" + Integer.toString(minutes);
        return aTemp;
    }
}