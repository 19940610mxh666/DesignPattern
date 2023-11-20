package optimize;
import java.util.*;

public class Context {
    private Map<String,Strategy> map;

    public Context() {
        List<Class<?>> allAssignedClass = null;
        try{
            allAssignedClass=CommonUtil.getAllAssignedClass(Strategy.class);
            map=new HashMap<>();
            int size=allAssignedClass.size();
            for (int i = 0; i < size; i++) {
                Strategy strategy=(Strategy) (allAssignedClass.get(i).newInstance());
                String name=strategy.getClass().getSimpleName();
                map.put(name,strategy);
            }
        }catch (InstantiationException instantiationException){

        }catch (IllegalAccessException illegalAccessException){

        }catch (Exception e){

        }


    }
    /**
     * 策略的使用
     * @param num1
     * @param num2
     * @return
     */
    public  int executeStrategy(int num1,int num2,String name){
        return map.get(name).doOperation(num1,num2);
    }
}
