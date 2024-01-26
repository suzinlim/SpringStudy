package hello.core.singleton;

public class StatefulService {

//    private int price; // 상태를 유지하는 필드 10000 -> 20000

    public int order(String name, int price) {
        System.out.println("name = " + name + "price = " + price);
//        this.price = price; // 여기가 문제 -> 공유되는 필드로 인해 생기는 문제점
        return price; // -> 가격을 바로 반환해 price를 공유하지 않게 함
    }

//    public int getPrice() {
//        return price;
//    }
}
