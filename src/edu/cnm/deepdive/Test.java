package edu.cnm.deepdive;

import java.util.ArrayList;
import java.util.List;

public class Test {

  public static void main(String[] args) {
    List<Canis> kennel = fillKennel();
    inspectKennel(kennel);
  }

  private static List<Canis> fillKennel() {
    List<Canis> kennel = new ArrayList<>();
    kennel.add(new CanisLupusFamiliaris());
    kennel.add(new CanisLupus());
    kennel.add(new CanisLupusFamiliaris());
    kennel.add(new CanisLupusFamiliaris());
    kennel.add(new CanisLupus());
    kennel.add(new CanisDirus());
    ((CanisLupusFamiliaris) kennel.get(0)).setGoodboy(false);
    return kennel;
  }

  private static void inspectKennel(List<Canis> kennel) {
    for (Canis canis : kennel) {
      canis.hunt();
      if (canis instanceof CanisLupus) {
        ((CanisLupus) canis).speak();
        if (canis instanceof CanisLupusFamiliaris
            && ((CanisLupusFamiliaris) canis).isGoodboy()) {
          System.out.println("I'm a good boy:");
        }
      }

      }
  }

}
