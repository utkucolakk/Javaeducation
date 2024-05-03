package enum_sample02;

public class Main {
    public static void main(String[] args) {
        BagSizeEnum bagSizeEnum = BagSizeEnum.MEDIUM;
        System.out.println("Size : " + bagSizeEnum.name() + " Price : " + bagSizeEnum.getPrice() + "$")  ;
    }
}
