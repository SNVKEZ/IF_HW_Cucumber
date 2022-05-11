package StepDefinition;

import io.cucumber.java.ru.Дано;
import io.cucumber.java.ru.Когда;
import io.cucumber.java.ru.Тогда;
import org.junit.Assert;

public class StepDefClass {
    double a;
    double b;
    double res;

    @Дано("^две цифры (\\d+) и (\\d+)")
    public void ins(double a, double b){
        this.a=a;
        this.b=b;
    }
    @Тогда("^ищем их сумму$")
    public void sum(){
        res = Double.sum(a,b);
    }
    @Когда("^результат должен быть (.*)")
    public void comparison(double result){
        Assert.assertEquals(result,res,0.0001);
    }


}
