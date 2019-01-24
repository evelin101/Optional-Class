public class NoOptional {

    public static void main(String[] args) {


        String[] str = new String[10];

        String subStr = str[9].substring(2, 5);

        System.out.println(subStr);

    }
}
