/**
 * context是策略的使用环境
 *
 */
public class Context {
    private Strategy strategy=null;
    public Context(Strategy strategy){
        this.strategy=strategy;
    }

    /**
     * 策略的使用
     * @param num1
     * @param num2
     * @return
     */
    public int executeStrategy(int num1,int num2){
        return strategy.doOperation(num1,num2);
    }
}
