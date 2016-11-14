import com.jacob.activeX.ActiveXComponent;
import com.jacob.com.Dispatch;
import spark.Spark;

/**
 * Created by Leo on 2016/11/14.
 */
public class Main {

    private static ActiveXComponent com;
    private static Dispatch disp;
    public static void main(String[] args){
        com = new ActiveXComponent("CLSID:0F55CC69-97EF-42A9-B63D-D1831CB2B3B9");
        disp = (Dispatch)com.getObject();
        String name=Dispatch.call(disp,"Name").getString().trim();
        System.out.println(name);
    }
}
