
public class Reviw01 {

    public static void main(String[] args) {
        int tax = taxMethod (10);
        int price = 1500;
        System.out.println("1500円の商品の税込価格は" + (price + tax)+ "円(消費税は" + tax + "円)です。");
        }

    public static int taxMethod(int tax) {
        int price =1500;
        int result =  price * tax/100;
        return result;
    }

}
