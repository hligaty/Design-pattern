package com.example.chapter30.unit1.factory;

public class SuperManFactory {
  public static ISuperMan createSuperMan(String type) {
    switch (type) {
      case "adult":
        return new AdultSuperMan();
      case "child":
        return new ChildSuperMan();
      default:
        return null;
    }
  }
}
