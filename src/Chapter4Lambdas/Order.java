package JavaOca.src.Chapter4Lambdas;

class Order {
    String value = "t";

    {
        value += "a";
    }

    {
        value += "c";
    }

    public Order() {
        value += "b";
    }

    public Order(String s) {
        value += s;
    }

    public static void main(String[] args) {
        Order order = new Order("f");
        order = new Order();
        System.out.println(order.value);

    }
}

