/**
 * Created by mandasu on 7/25/2017.
 */
import java.lang.annotation.*;

class YearValues {
    public static  final int Y1= 2015;
    public static  final int Y2= 2016;
    public static  final int Y3= 2017;
    public static  final int Y4= 2018;
    public static  final int Y5= 2019;
    public static  final int Y6= 2020;
}

enum Day {
    MONDAY,TUESDAY,WEDNESDAY, THUHRSDAY, FRIDAY, SATURDAY, SUNDAY
}
enum Month {
    jan, feb, mar,apr,may,jun,jul,aug,sep,oct,nov,dec
}
enum Year {
    Y1,Y2,Y3,Y4,Y5,Y6
}

@Retention(value = RetentionPolicy.SOURCE)
@Target(ElementType.TYPE)
@interface TimeStamp {
    Day day();
    Month month();
    Year year();
}

