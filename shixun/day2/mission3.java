import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;
public class mission3 {
    public static void main(String []args){
        //主菜单功能
        System.out.print("*********************************\n");
        System.out.print("悦茶点餐系统->主菜单\n");
        System.out.print("*********************************\n");
        System.out.print("         1.会员管理\n         2.菜单管理\n         3.结算\n         4.积分消费\n         5.注销\n");
        System.out.print(">>>>>>>>>>\n");
        System.out.print("请选择，请输入数字:");
        int a = new Scanner(System.in).nextInt();
        if (a==2){
            System.out.print("悦茶点餐系统->主菜单->菜单管理\n*********************************\n");
            System.out.print("         1.菜品查询\n         2.修改菜品\n         3.添加菜品\n>>>>>>>>>>\n");
            System.out.print("请选择，请输入数字：");
            int menu = new Scanner(System.in).nextInt();
            if (menu==1) {
                System.out.print("*********************************\n");
                System.out.print("悦茶点餐系统->主菜单->菜单管理->菜品查询\n>>>>>>>\n\r");
                System.out.print("菜单编号     菜名     价格\n");
                System.out.print("   01        烤肉    10元/份\n");
                System.out.print("   02        烧鸡    20元/只\n");
                System.out.print("   03       啤酒鸭   23元/只\n");
                System.out.print("   04       炒青菜    7元/份\n");
                System.out.print("   05      虎皮尖椒   10元/份\n");
                System.out.print("   06      蔬菜沙拉   13元/份\n");
                System.out.print("   07        可乐     3元/瓶\n");
                System.out.print("   08        雪碧     3元/瓶\n");
                System.out.print("   09        椰汁     7元/盒\n");
                System.out.print("   10        橙汁     4元/瓶\n");
            } 
            else if (menu==2){
                System.out.print("*********************************\n");
                System.out.print("悦茶点餐系统->主菜单->菜单管理->修改菜品\n>>>>>>>\n\r");
                System.out.print("请输入菜品编号\n");
                new Scanner(System.in).nextInt();
                System.out.print("请输入修改菜品编号\n");
                new Scanner(System.in).nextInt();
                System.out.print("修改成功\n");
            }
            else if (menu==3){
                System.out.print("*********************************\n");
                System.out.print("悦茶点餐系统->主菜单->菜单管理->添加菜品\n>>>>>>>\n\r");
                System.out.print("请输入要添加的菜品\n");
                new Scanner(System.in).nextInt();
                System.out.print("添加成功！\n");
            }
            System.out.print("回车返回上一级>>>");
            new Scanner(System.in).nextInt();
        }
    }
}
