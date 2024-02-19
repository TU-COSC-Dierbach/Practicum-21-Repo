public class SingleValue {
  private int x;

  // constructor
  public SingleValue(int x) {
    this.x = x;
  }

  public int getX() {
    return x;
  }

  public void setX(int new_value) {
    x = new_value;
  }

  public boolean equals(SingleValue other) {
    return x == other.getX();
  }
}