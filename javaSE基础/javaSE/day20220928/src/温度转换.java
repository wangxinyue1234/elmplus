public class 温度转换 {
    public static void main(String[] args){
        double sC = 23;//摄氏度
        double hF = 112;//华氏度
        System.out.println("摄氏度："+sC+"转换为华氏度为："+(sC*9/5+32));
        System.out.println("华氏度："+hF+"转换为摄氏度为："+((hF-32)*5/9));
    }
}
