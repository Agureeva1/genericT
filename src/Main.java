public class Main {

    public static void main(String[] args) throws Exception {

        MagicBox<String> box = new MagicBox<>(6);
        box.add("Russian Federation");
        box.add("Germany");
        box.add("Belgium");
        box.add("India");
        box.add("Japan");
        box.add("Italy");
        System.out.println(box.pick());

        MagicBox<Integer> box2 = new MagicBox<>(4);
        box2.add(3);
        box2.add(9);
        box2.add(14);
        box2.add(91);
        System.out.println(box2.pick());
    }
}
