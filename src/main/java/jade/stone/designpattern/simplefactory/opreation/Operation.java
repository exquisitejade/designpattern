package jade.stone.designpattern.simplefactory.opreation;


import lombok.Data;

/**
 * 用于运算的工具类.
 *
 * @author : qinyang @Date : 2018/10/16 上午9:30
 */
@Data
public class Operation {
  private double firstNumber;
  private double secondNumber;

  public double getResult() throws Exception {
    return 0;
  }
}
