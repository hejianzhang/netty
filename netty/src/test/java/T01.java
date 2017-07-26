import java.util.ArrayList;
import java.util.List;

/**
 * Created by Administrator on 2017-06-28.
 */
public class T01 {
    static int count=0;
    static void r(){
        count++;
        r();
    }

    public static void main(String[] args){
        try{
            r();
        } catch(Throwable e){
            System.out.println("aaaaaaaaaaaaaaaaaaaaa"+count);
            e.printStackTrace();
        }
        }

}
