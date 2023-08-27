public class Main {
    public static void main(String[] args) {
        task1();
    }

    private static void task1() {
        System.out.println("задача");
        String name = "ЛюдаЛюдаЛюдаЛюда";
        String name2 = name.substring(0, name.length() / 2);
        System.out.println(name2);
        String name3 = name.substring(name.length() / 2, name.length());
        System.out.println(name3);

    }
}