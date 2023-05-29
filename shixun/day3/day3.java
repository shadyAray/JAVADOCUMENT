package shixun.day3;
import java.util.Scanner;
public class day3 {
    public static void main(String []args){
        //主菜单功能
        System.out.print("*********************************\n");
        System.out.print("悦茶点餐系统->主菜单\n");
        System.out.print("*********************************\n");
        System.out.print("         1.会员管理\n         2.菜单管理\n         3.结算\n         4.积分消费\n         5.注销\n");
        System.out.print(">>>>>>>>>>\n");
        System.out.print("请选择，请输入数字:");
        int option = new Scanner(System.in).nextInt();
        if (option==3){
            System.out.print("悦茶点餐系统->主菜单->结算\n*********************************\n*********************************\n");
            System.out.print("商品菜单列表：\n");
            System.out.print("菜单编号  菜单名   价格\n");
            System.out.print("  m01   素颜锡兰   18\n");
            System.out.print("  m02   抹茶菩提   22\n");
            System.out.print("  m03   珍珠奶茶   25\n");
            System.out.print("  m04    桂花弄    28\n");
            System.out.print("  m05   芊芊马卡   20\n");
            System.out.print("  m06   幽兰拿铁   22\n");
            System.out.print(">>>>>>>>\n");
            System.out.print("请输入要购买的商品编号：\n");
            Scanner input = new Scanner(System.in);
            if (input==){

            }

        }
    }
}

