package Auto_set_alarm;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class DayOfWeek{
    public int dayOfWeek(){
        String dateFormat="yyyyMMdd";
        SimpleDateFormat dF=new SimpleDateFormat(dateFormat);
        Date date=new Date();
        Calendar c=Calendar.getInstance();
        String currentDate=dF.format(date);

        try{
            c.setTime(dF.parse(currentDate));//The compiler/Intellij requires a try/catch around a parse.
        }catch(ParseException e){
            e.printStackTrace();
        }

        c.add(Calendar.DAY_OF_MONTH,1);

        return c.get(Calendar.DAY_OF_WEEK);
    }
}