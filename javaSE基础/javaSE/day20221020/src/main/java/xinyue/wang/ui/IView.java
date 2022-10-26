package xinyue.wang.ui;

public interface IView {
    void showAll();
    default void showSubMenu(){
        System.out.println("默认的子菜单");
    };
}
