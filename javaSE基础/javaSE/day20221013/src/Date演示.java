import java.util.Date;

public class Date演示 {
    public static void main(String[] args) {
        /*Date date = new Date();
        System.out.println(date);
        Date date1 = new Date(178988456);
        System.out.println(date1);*/
        long startTime = System.currentTimeMillis();    //获取开始时间

        Date date = new Date();
        int sum =0;
        for(int i=1;i<=10000;i++){
            sum += i;}
        long endTime = System.currentTimeMillis();    //获取结束时间
        System.out.println("程序运行时间：" + (endTime - startTime) + "ms");
    }
}
