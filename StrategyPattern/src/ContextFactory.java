/**
 * 使用工厂模式修改Context
 */
public class ContextFactory {
    private Strategy strategy;
    public ContextFactory(String type){
        switch (type){
            case "+":
                this.strategy=new OperationAdd();
                break;
            case "*":
                this.strategy=new OperationMultiply();
                break;
            case "-":
                this.strategy=new OperationSubtract();
                break;
        }
    }

    public int executeStrategy(int num1,int num2){
        return strategy.doOperation(num1,num2);
    }
}
