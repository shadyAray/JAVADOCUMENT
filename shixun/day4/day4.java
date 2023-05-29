package shixun.day4;
import java.util.Scanner;
public class day4 {
    public static void main(String[] args){
        Scanner input= new Scanner(System.in);
        int option=0;
        System.out.println("***********************************");
        System.out.println("悦茶点餐系统->主菜单->积分消费");
        System.out.println("***********************************");
        System.out.println("吉芬商品列表：");
        System.out.println("礼品编号   礼品名    礼品所需积分");
        System.out.println("  s01     悠悠球         20");
        System.out.println("  s02      跳绳          20");
        System.out.println("  s03     自拍杆         100");
        System.out.println("  s04   iphone红富士     55");
        System.out.println(">>>>>>>>>>>");
        System.out.println("请输入要兑换的礼品编号：");
        option=input.nextInt();
        switch(option){
            case 1:
            System.out.println("查询到礼品：悠悠球(s01),积分:20");break;
            case 2:
            System.out.println("查询到礼品：跳绳(s02),积分:20");break;
            case 3:
            System.out.println("查询到礼品：自拍杆(s03),积分:100");break;
            case 4:
            System.out.println("查询到礼品：iphone红富士(s04),积分:55");break;
        }
        int remaining = 500;
        System.out.println("当前账户wxr      积分余额  500\n>>>>>>>>>>>");
        System.out.println("是否确认购买？(1/2)");
        int verity;
        verity=input.nextInt();
        if (verity==1) {
            System.out.println("购买成功！当前余额：480");
        } 
        else {
            System.out.println("购买失败\n回车返回\n");
        }



        }
    }
