import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Member {
    private String name;
    private String phoneNumber;
    private String address;

    public Member(String name, String phoneNumber, String address) {
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public String getAddress() {
        return address;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}

public class Main {
    private static List<Member> members = new ArrayList<>();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        boolean running = true;
        while (running) {
            System.out.println("1. 显示会员");
            System.out.println("2. 添加会员");
            System.out.println("3. 修改会员信息");
            System.out.println("4. 退出");
            System.out.print("请选择操作：");
            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume the newline character

            switch (choice) {
                case 1:
                    displayMembers();
                    break;
                case 2:
                    addMember(scanner);
                    break;
                case 3:
                    modifyMember(scanner);
                    break;
                case 4:
                    running = false;
                    break;
                default:
                    System.out.println("无效的选择！");
                    break;
            }
        }
    }

    private static void displayMembers() {
        if (members.isEmpty()) {
            System.out.println("没有会员信息。");
        } else {
            System.out.println("会员列表：");
            for (Member member : members) {
                System.out.println("姓名：" + member.getName());
                System.out.println("电话号码：" + member.getPhoneNumber());
                System.out.println("地址：" + member.getAddress());
                System.out.println();
            }
        }
    }


    private static void addMember(Scanner scanner) {
        System.out.print("请输入会员姓名：");
        String name = scanner.nextLine();
        System.out.print("请输入电话号码：");
        String phoneNumber = scanner.nextLine();
        System.out.print("请输入地址：");
        String address = scanner.nextLine();

        Member member = new Member(name, phoneNumber, address);
        members.add(member);

        System.out.println("会员添加成功！");
        System.out.println();
    }
    

    private static void modifyMember(Scanner scanner) {
        System.out.print("请输入要修改信息的会员姓名：");
        String name = scanner.nextLine();

        Member member = findMemberByName(name);
        if (member == null) {
            System.out.println("找不到该会员！");
            System.out.println();
            return;
        }

        System.out.println("当前会员信息：");
        System.out.println("姓名：" + member.getName());
        System.out.println("电话号码：" + member.getPhoneNumber());
        System.out.println("地址：" + member.getAddress());
        System.out.println();

        System.out.print("请输入新的电话号码（不修改请直接回车）：");
    }

    private static Member findMemberByName(String name) {
        return null;
    }
       
