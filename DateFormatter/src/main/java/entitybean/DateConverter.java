package entitybean;

import org.springframework.beans.factory.FactoryBean;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
public class DateConverter {
    public Date parse(String data) throws ParseException {
        String[] data1 = data.split("\\|");
        String date = data1[0];
        String format = data1[1];
        SimpleDateFormat formatter = new SimpleDateFormat(format);
        Date dateobj = formatter.parse(date);
        return dateobj;

    }
    }

