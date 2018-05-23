package edu.cnm.deepdive;

public class CanisLupusFamiliaris extends CanisLupus {

  private boolean goodboy = true;

  public boolean isGoodboy() {
    return goodboy;
  }

  public void setGoodboy(boolean goodboy) {
    this.goodboy = goodboy;
  }


//  @Override
//  public void hunt() {
//    System.out.println("Throw the ball and I'ii fetch it!");
//  }

  @Override
  public void speak() {
    System.out.println("Bark at passing cars!");
  }
}
