public class Rectangle {
    private double length;
    private double width;

    //sol section1
    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }
    //sol section2
    public double getLength() {
        return length;
    }
    //sol section3
    public double getWidth() {
        return width;
    }

    //sol section4
    public double getDiagonal(){
        return Math.sqrt(width*width + length*length);
    }

    //sol section5
    public void setLength(double length) {
        this.length = length;
    }
    //sol section6
    public void setWidth(double width) {
        this.width = width;
    }

    //sol section7
    public boolean isSquare(){
        return (width == length);
    }

    /**
     * this method calculates the area of the rectangle
     * @return double
     */
    public double calculateArea(){
        return (width*length);
    }
    //sol section8
    @Override
    public String toString() {
        return "Rectangle{" +
                "length=" + length +
                ", width=" + width +
                '}';
    }
}
