import java.util.Scanner;
public class BankInterest {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Nhập lượng tiền gửi: ");
        double Money=scanner.nextDouble();
        System.out.println("Nhập tỷ lệ lãi suất: ");
        double intersetRate=scanner.nextDouble();
        System.out.println("Nhập số tháng cho vay: ");
        double Month=scanner.nextDouble();
        double totalInterset=(Money*intersetRate/12)*Month;
        System.out.println("Tổng số tiền lãi là: "+totalInterset);
    }
}
