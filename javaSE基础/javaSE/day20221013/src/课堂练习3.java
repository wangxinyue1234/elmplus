import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class 课堂练习3 {
    public static void main(String[] args) {
       /* List<StudentLists> Lists= new LinkedList();
        Lists.add(new StudentLists("zhangsan",18,true));
        Lists.add(new StudentLists("lisi",17,false));
        Lists.add(new StudentLists("hanqianwen",25,false));*/
        Stu u1 = new Stu("u1",18,false);
        Stu u2 = new Stu("u2",17,true);
        Stu u3 = new Stu("u3",20,false);
        Stu u4 = new Stu("u4",19,true);
        Stu u5 = new Stu("u5",18,true);
        System.out.println("======================学生信息管理系统==================");
        //1 创建登记表
        List<Stu>stuList = new ArrayList<>();
        //2 注册学员
        stuList.add(u1);
        stuList.add(u2);
        stuList.add(u3);
        stuList.add(u4);
        //3 查询人数
        System.out.println("当前共有学生人数："+stuList.size());
        //4 展示所有学生
        System.out.println("姓名\t\t\t年龄\t\t\t性别");
        for (int i = 0; i < stuList.size(); i++) {
            System.out.println(stuList.get(i));
        }
        //5 查找是否包含指定学生
        System.out.println("是否存在u2:"+stuList.contains(u2));
        System.out.println("是否存在u5:"+stuList.contains(u5));
        System.out.println("---------------------------------");
        //6 查找所有的男生
        List<Stu>roomStus = new LinkedList<>();
        for (int i = 0; i < stuList.size(); i++) {
            if (stuList.get(i).isGender()){
                //System.out.println(stuList.get(i));
                roomStus.add(0,stuList.get(i));
                System.out.println(stuList.get(i));
            }
        }
        System.out.println("----------我是有底线的-------------");
    }
}
class Stu{
    private String name;
    private int age;
    private boolean gender;

    public String getName() {
        return name;
    }
    public int getAge() {
        return age;
    }
    public boolean isGender() {
        return gender;
    }
    public void setGender(boolean gender) {
        this.gender = gender;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Stu(String name, int age, boolean gender){
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    @Override
    public String toString() {
        return this.name+"\t\t\t"+this.age+"\t\t\t"+(this.gender?"男":"女");
    }
}

