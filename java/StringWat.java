import java.lang.reflect.Field;

public class asdf {

    public static void main (String... args) throws NoSuchFieldException, IllegalAccessException {

        String s1 = "hello";

        Field valueField = String.class.getDeclaredField("value");

        valueField.setAccessible(true);

        valueField.set(s1, "world".toCharArray());

        System.out.println(s1);

        String s3 = "hello";

        System.out.println(s3 + " " + s1);

        System.out.println("hello");


    }

}
