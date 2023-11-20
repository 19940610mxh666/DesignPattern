package no_if_else;

import java.util.HashMap;
import java.util.Map;

/**
 * 不符合开闭原则
 * 对于固定的算法，可以采用枚举来实现
 */
public class Context {
    private Map<String,Strategy> strategyMap;
    public Context(){
        Map<String,Strategy> strategyMap=new HashMap<>();
        strategyMap.put("add",Strategy.OperateAdd);
        strategyMap.put("mul",Strategy.OperationMultiply);
        strategyMap.put("sub",Strategy.OperationSubtract);
        this.strategyMap=strategyMap;
    }
    public int executeStrategy(int num1,int num2,String type){
        return strategyMap.get(type).doOperation(num1,num2);
    }

}
