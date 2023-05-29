package shixun.day3;
import java.util.Scanner;
public class demo {
    public static void main(String args[]){
         //结算系统
 Scanner input = new Scanner(System.in);
 String answer="y";
 int option =0;
 String name = "";
 double price=0;
 while(answer.equals("y")){
    System.out.println("*********************************");
    System.out.println("晨曦酒庄点餐系统->主菜单->菜单管理");
    System.out.println("*********************************");
    System.out.println("请选择商品");
    System.out.println("1.果汁\n2.椰果奶茶\n3.百香果茶\n4.珍珠奶茶\n5.布丁奶茶");
    System.out.println("*********************");
    System.out.println("请输入商品编号:"); 
  option=input.nextInt();
  switch(option){
    case 1:
    name = "果汁"; price=10; break;
    case 2:
    name ="椰果奶茶"; price=8; break; 
    case 3:
    name ="百香果茶"; price =15; break;
    case 4:
    name ="珍珠奶茶"; price=7; break; 
    case 5:
    name ="布丁奶茶"; price =9; break;
    }
  System.out.println("商品:"+name+"\t价格:$"+price);
  System.err.println("请进行确认(Y/N)"); 
  answer = input.next();
  System.out.println("购买成功！");
  }
  System.out.println("系统退出");

}
}
