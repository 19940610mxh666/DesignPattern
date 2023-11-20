package no_if_else;

/**
 * 使用枚举，但是不符合开闭
 */
public enum Strategy {
    OperateAdd{
        @Override
        public int doOperation(int num1, int num2) {
            return num1+num2;
        }
    },
    OperationMultiply{
        @Override
        public int doOperation(int num1, int num2) {
            return num1*num2;
        }
    },
    OperationSubtract {
        public int doOperation(int num1, int num2) {
            return num1-num2;
        }
    };

    public abstract int doOperation(int num1, int num2);
}
