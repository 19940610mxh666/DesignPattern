package optimize;

/**
 * 优化策略模式
 * 仔细体会策略模式的思想
 */
public class Main {
    public static void main(String[] args)  {
        Context context=new Context();
        int add = context.executeStrategy(3, 3, "OperationAdd");
        System.out.println("add:"+add);
    }
}
