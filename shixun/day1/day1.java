package shixun.day1;
import java.util.Scanner;
import java.util.List;
class member{
    private String username;
    private String password;
    private String address;
}
public class day1 {
    public static void main(String []args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("悦茶点餐系统->主菜单");
        System.out.println("********************************");
        System.out.println("1.会员管理\n2.菜单管理\n3.结算\n4.积分消费\5.注销");
        System.out.println(">>>>>>>>");
        System.out.println("请选择，请输入数字：");
        int num = scanner.nextInt();
        switch(num)
        {
            case 1:
            System.out.println("悦茶点餐系统->主菜单->会员管理");break;
            case 2:
            System.out.println("悦茶点餐系统->主菜单->菜单管理");break;
            case 3:
            System.out.println("悦茶点餐系统->主菜单->结算");break;
            case 4:
            System.out.println("悦茶点餐系统->主菜单->积分消费");break;
            case 5:
            System.out.println("悦茶点餐系统->主菜单->注销");break;
        }

    }
}
