package Auto_set_alarm;

//Project for auto set an alarm based on the next day in a calender.
public class Ast_Main {
    public static void main(String[] args){
        DayOfWeek weekday=new DayOfWeek();
        int day=weekday.dayOfWeek();
        Alarm aAlarm=new Alarm();

        aAlarm.setAlarm(day);
        System.out.println(aAlarm.getAlarm());
    }
}