public class test {
    public static void main(String[] args) {
        String[] array = new String[]{"a", "b", "c"};

        String[] array1 = new String[]{"a", "b", "c"};

        System.out.println(array == array1);
        System.out.println(array.equals(array1));

        String[] strArray = { "a", "b", "c"};

        String[] strArray1 = { "a", "b", "c"};

        System.out.println(strArray == strArray1);
        System.out.println(strArray.equals(strArray1));

        String test = "test";
        String test1 = new String("test");

        System.out.println(test == test1);
        System.out.println(test.equals(test1));
    }
}
