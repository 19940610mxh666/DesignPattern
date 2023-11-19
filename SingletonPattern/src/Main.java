/**
 * 单例模式
 * 只能有一个实例
 * 单例类必须自己创建自己的唯一实例
 * 单例类必须给所有其他对象提供这一实例
 */
public class Main {

    public static void main(String[] args) {
        SingleObject instance = SingleObject.getInstance();
        instance.showMessage();
    }
}
