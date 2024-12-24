public class Main {

    public static void main(String[] args) {
        NullPointerGenerator generator = new NullPointerGenerator();

        try {
            generator.generateNullPointerException();
        } catch (NullPointerException e) {
            System.out.println("Wystąpił wyjątek NullPointerException!");
            System.out.println("Informacje o wyjątku:");
            System.out.println(e.toString());
            e.printStackTrace();
        }
    }
}