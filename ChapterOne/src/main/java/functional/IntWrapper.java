package functional;

/**
 * Created by Developer on 3/22/2017.
 */
public class IntWrapper {

    String operation;
    int num;

    public IntWrapper setOperation(String operation) {
        this.operation = operation;
        return this;
    }

    public IntWrapper setNum(int num) {
        this.num = num;
        return this;
    }

    public int calculate(int num2){
        int result = 0;
        switch(operation){
            case "+":result = num + num2; break;
            case "-":result = num - num2; break;
        }
        return result;
    }
}
