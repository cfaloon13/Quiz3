package base;

public abstract class GeometricObject {
  private String color = "green";
  private boolean filled;
  private java.util.Date dateCreated;

  /** Create a default geo obj */
  protected GeometricObject() {
    dateCreated = new java.util.Date();
  }

  /** Construct a geo obj with filled value and color */
  protected GeometricObject(String color, boolean filled) {
    dateCreated = new java.util.Date();
    this.color = color;
    this.filled = filled;
  }

  /** Return color */
  public String getColor() {
    return color;
  }

  /** Set new color */
  public void setColor(String color) {
    this.color = color;
  }

  /** Filled is returned */
  public boolean isFilled() {
    return filled;
  }

  /** Set new filled */
  public void setFilled(boolean filled) {
    this.filled = filled;
  }

  /** Get dateCreated */
  public java.util.Date getDateCreated() {
    return dateCreated;
  }

  @Override
  public String toString() {
    return "created on " + dateCreated + "\ncolor: " + color +
      " and filled: " + filled;
  }

  /** Abstract method getArea */
  public abstract double getArea();

  /** Abstract method getPerimeter */
  public abstract double getPerimeter();

}



