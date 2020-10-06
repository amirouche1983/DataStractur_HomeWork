package homeWork;

import java.util.Scanner;

public class MegaMarket {
    static int customerId;
    static double billAmount;
    static String TotalPrice;
    static double finalPrice;
    //static double disc;
    static String finaldisc;
    //System.Exit(0);
    public static void getInput() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the customer Id");
        customerId = scan.nextInt();
        if (customerId <= 0) {
            System.out.println( customerId +" is not a valiid Customer Id");
            Runtime.getRuntime().halt(0);		}
        System.out.println("Enter the Bill amount");
        billAmount = scan.nextInt();
        if (billAmount <= 0)
            System.out.println( billAmount+ " is not a valiid Bill amount");
        return;

    }

    public static String totalPrice() {
        if (customerId <= 100 && billAmount < 1000) {
            TotalPrice = String.format("%.2f", billAmount);
            return ""+TotalPrice;
        } else if (customerId <= 100 && customerId<101 && billAmount >= 1000) {
            //disc = (billAmount * 15 / 100);

            finalPrice = billAmount - (billAmount * 15 / 100);
            TotalPrice = String.format("%.2f", finalPrice);
            return ""+TotalPrice;
        } else if (customerId >= 101 && customerId<=250 && billAmount < 1000) {
            TotalPrice = String.format("%.2f", billAmount);
            return""+ TotalPrice;
        } else if (customerId >= 101 && customerId<= 250 && billAmount >= 1000) {
            //disc = (billAmount * 18 / 100);
            finalPrice = billAmount - (billAmount * 18 / 100);

            TotalPrice = String.format("%.2f", finalPrice);
            return TotalPrice;
        } else if (customerId >= 251 && customerId<=500 && billAmount < 1000) {

            TotalPrice = String.format("%.2f", billAmount);
            return""+ TotalPrice;
        } else if (customerId >= 251 && customerId<=500 && billAmount >= 1000) {
            //disc = (billAmount * 23 / 100);
            finalPrice = billAmount - (billAmount * 23 / 100);

            TotalPrice = String.format("%.2f", finalPrice);
            return TotalPrice;
        } else if (customerId >= 501 && customerId<=1000 && billAmount < 1000) {

            TotalPrice = String.format("%.2f", billAmount);
            return""+ TotalPrice;
        } else if (customerId >= 501 && customerId<=1000 && billAmount >= 1000) {
            //disc = (billAmount * 28 / 100);
            finalPrice = billAmount - (billAmount * 28 / 100);

            TotalPrice = String.format("%.2f", finalPrice);
            return TotalPrice;
        } else if (customerId >= 1001 && billAmount < 1000) {

            TotalPrice = String.format("%.2f", billAmount);
            return""+ TotalPrice;
        }

        else {
            //disc = (billAmount * 32 / 100);

            finalPrice = billAmount - (billAmount * 32 / 100);

            TotalPrice = String.format("%.2f", finalPrice);
            return TotalPrice;
        }

    }


    public static void main(String[] args) {

        getInput();
        if(customerId <=0 || billAmount<=0) return;
        System.out.println("Total Price is "+totalPrice());
        KarimMethod();

    }



    public static void KarimMethod(){

                System.out.println("Entre the Customer Id : ");
                Scanner scanner =new Scanner(System.in);
                int customer_Id = scanner.nextInt();
                if(customer_Id<=0){
                    System.out.println(customer_Id +" is not a valid Customer Id.");
                    return;
                }
                System.out.println("Entre the Bill amount : ");
                Scanner scanner1 =new Scanner(System.in);
                double Bill_amount = scanner1.nextDouble();
                if(Bill_amount<=0){
                    System.out.println(Bill_amount +" is not a valid Bill amount.");
                    return;
                }
                else if(Bill_amount>=1000) {
                    String Customer_type="Bronze";
                    double Discount_Percentage=0;
                    double New_Bill_amount;
                    if (customer_Id >= 1 && customer_Id <= 100) {Customer_type="Bronze";}
                    if (customer_Id >= 101 && customer_Id <= 250) {Customer_type="Server";}
                    if (customer_Id >= 251 && customer_Id <= 500) {Customer_type="Gold";}
                    if (customer_Id >= 501 && customer_Id <= 1000) {Customer_type="Platinum";}
                    if (customer_Id >= 1001) {Customer_type="Diamante";}
                    switch (Customer_type) {
                        case "Bronze":{
                            Discount_Percentage = 15;
                            New_Bill_amount = Bill_amount - (Bill_amount * 15 / 100);
                            System.out.printf("%.2f",New_Bill_amount);
                            break;}
                        case "Server":{
                            Discount_Percentage = 18;
                            New_Bill_amount = Bill_amount - (Bill_amount * 18 / 100);
                            System.out.printf("%.2f",New_Bill_amount);
                        }
                        case "Gold":{
                            Discount_Percentage = 23;
                            New_Bill_amount = Bill_amount - (Bill_amount * 23 / 100);
                            System.out.printf("%.2f",New_Bill_amount);
                            break;}
                        case "Platinum":{
                            Discount_Percentage = 28;
                            New_Bill_amount = Bill_amount - (Bill_amount * 28 / 100);
                            System.out.printf("%.2f",New_Bill_amount);
                            break;}
                        case "Diamante":{
                            Discount_Percentage = 32;
                            New_Bill_amount = Bill_amount - (Bill_amount * 32 / 100);
                            System.out.printf("%.2f",New_Bill_amount);
                            break;}
// default:System.out.printf("%.2f",Bill_amount);
                    }
                }else System.out.printf("%.2f",Bill_amount);
            }
        }



