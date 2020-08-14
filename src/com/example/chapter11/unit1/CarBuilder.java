package com.example.chapter11.unit1;

import java.util.ArrayList;

/**
 * @author gaodapeng
 */
public abstract class CarBuilder {

  /**
   * 汽车动作执行顺序
   * @param sequence 序列
   */
  public abstract void setSequence(ArrayList<Work> sequence);

  /**
   * 一个车模
   * @return 车模
   */
  public abstract CarModel getCarModel();
}
