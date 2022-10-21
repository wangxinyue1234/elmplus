import java.sql.Array;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;

public class 集合基础 {
    public static void main(String[] args) {
        int stu1=60;
        /*int[] scores =  {60,75,88};
        System.out.println(scores.length);
       *//* scores[3] = 99;
        System.out.println(scores.length);*/
        List ints = new ArrayList<Integer>();
        ints.add(3);
        ints.add(4);
        HashSet <Float>floats = new HashSet();
        floats.add(3.2F);
        floats.add(3.2F);
        System.out.println(floats.size());
        HashMap<String,Integer>ages = new HashMap();
        ages.put("zs",18);
        ages.put("ls",19);
        System.out.println(ages.get("zs"));

        //数组
        Number[]floats1 = new Number[3];
        floats1[0] = 97;

        List alist = new ArrayList();
        alist.add(1);
        alist.add(3.14F);
        System.out.println(alist);

        List alist1  = new ArrayList();
        alist1.add("hqw");
        alist1.add("fyc");
        alist1.add("qh");
        System.out.println(alist1);
        System.out.println();
    }
}
