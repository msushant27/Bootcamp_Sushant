/**
 * Created by mandasu on 7/25/2017.
 */
import java.lang.annotation.*;

@Retention(RetentionPolicy.CLASS)
@Target(ElementType.TYPE)
@interface Company {
    String name();
    String location();
}
