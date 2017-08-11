package assignment1;

/**
 * Created by mandasu on 7/25/2017.
 */
public class SecurityService {
    public static boolean exists(String email){
        //20 loc to check in DB
        if(email.endsWith("@yahoo.com")) {
            return true;
        }else{
            return false;
        }
    }

    public static boolean checkPermission(String user){
        //20 loc to check in DB
        if(user.equals("admin")) {
            return true;
        }else{
            return false;
        }
    }

}
