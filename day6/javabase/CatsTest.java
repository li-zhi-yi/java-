public class CatsTest {
    public static void main(String[] args) {
        Cats one = new Cats("喵喵", 12, 12.00);
        System.out.println(one.getName());
        one.setMonth(-1);
        System.out.println(one.getMonth());
    }
}