import java.util.Scanner;
public class day2 {
    public static void main(String []args){
        //主菜单功能
        System.out.print("*********************************\n");
        System.out.print("悦茶点餐系统->主菜单\n");
        System.out.print("*********************************\n");
        System.out.print("         1.会员管理\n         2.菜单管理\n         3.结算\n         4.积分消费\n         5.注销\n");
        System.out.print(">>>>>>>>>>\n");
        System.out.print("请选择，请输入数字:");
        int a = new Scanner(System.in).nextInt();
        //主菜单功能
        //选项1功能
        if (a==1){
            System.out.print("悦茶点餐系统->主菜单->会员管理\n*********************************\n");
            System.out.print("         1.显示所有会员信息\n         2.添加会员\n         3.修改会员\n         4.返回主菜单\n>>>>>>>>>>\n");
            System.out.print("请选择，请输入数字：");
            int a1 = new Scanner(System.in).nextInt();
        //选项1功能
        //选项1-1功能
            if (a1==1){
                System.out.print("*********************************\n");
                System.out.print("悦茶点餐系统->主菜单->会员管理->显示所有会员信息\n>>>>>>>\n");
                System.out.print("会员名  储值余额  会员积分  是否是会员\n");
                System.out.print(" wxr      500       300         是\n");
                System.out.print("魏心睿    200       -1          否\n");
            }
        //选项1-1功能
            System.out.print("回车返回上一级>>>");
        }
        //选项2功能
        if (a==2){
            System.out.print("悦茶点餐系统->主菜单->菜单管理\n*********************************\n");
            System.out.print("         1.荤菜\n         2.素菜\n         3.饮品\n>>>>>>>>>>\n");
            System.out.print("请选择，请输入数字：");
            int a2 = new Scanner(System.in).nextInt();
        //选项2功能
        //选项2-1功能
        if (a2==1){
            System.out.print("*********************************\n");
            System.out.print("悦茶点餐系统->主菜单->会员管理->荤菜\n>>>>>>>\n");
            System.out.print("            1.烤肉\n");
            System.out.print("            2.烧鸡\n");
            System.out.print("           3.啤酒鸭\n");
            }
        //选项2-2功能
            System.out.print("回车返回上一级>>>");
        }
        }
    }

