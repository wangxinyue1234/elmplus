public class 数组的操作 {
    public static void main(String[] args){
        int[] ages = {29,28,26,27};//声明ages数组，定义空间为4个整数长度
        //int[] dst ;//声明一个空数组
        int[] dst = new int [4];

        System.out.println(ages);//[I@7c30a502
        System.out.println(dst);//[I@49e4cb85

        //数组名称直接赋给另外一个数组，本质上仅仅把数组地址赋值给另一个数组变量
        //意味着 有两个变量指向同一个数组地址空间,数组也是对象，数组名是数组空间的地址
//        dst = ages;
//        System.out.println(dst);//[I@7c30a502
//        System.out.println(dst[0]);//29
//        ages[0]=33;
//        System.out.println(dst[0]);//33


        //数组的操作，可以使用第三方包相关方法完成
        System.arraycopy(ages,1,dst,0,2);
        System.out.println(dst[0]);
        System.out.println(dst[1]);
        System.out.println(dst[2]);



        int[] srcArr ={10,2,3,4};
        int[] dstArr = new int[4];
        System.arraycopy(srcArr,0,dstArr,0,srcArr.length);
        for (int i = 0; i < dstArr.length; i++) {
            System.out.println(dstArr[i]);
        }
    }
}
