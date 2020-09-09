package com.example.chapter27.unit1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class Main {
  public static void main(String[] args) throws IOException {
    /**
     * 解释器模式
     * 定义：给定一门语言，定义它的文法的一种表示，并定义一个解释器，该解释器使用该表示来解释语言中的句子。
     * 不常用，调用脚本语言更好
     */
    String expression = getExpStr();
    Map<String, Integer> value = getValue(expression);
    Calculator calculator = new Calculator(expression);
    int result = calculator.run(value);
    System.out.println("运算结果:" + result);
  }

  public static String getExpStr() throws IOException {
    System.out.print("请输入表达式：");
    return (new BufferedReader(new InputStreamReader(System.in))).readLine();
  }

  public static Map<String, Integer> getValue(String expression) throws IOException {
    HashMap<String, Integer> map = new LinkedHashMap<>();
    for (char ch : expression.toCharArray()) {
      if (ch != '+' && ch != '-') {
        if (!map.containsKey(String.valueOf(ch))) {
          String in = (new BufferedReader(new InputStreamReader(System.in))).readLine();
          map.put(String.valueOf(ch), Integer.valueOf(in));
        }
      }
    }
    return map;
  }
}
