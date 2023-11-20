package no_if_else;

/**
 * 优化了if-else
 */
public class Main {
    public static void main(String[] args) {
        Context context=new Context();
        int add = context.executeStrategy(1, 2, "add");
        System.out.println("add:"+add);
    }
}
