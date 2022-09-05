public class Main {
    public static void main(String[] args) {
        //sol 2.1
        Rectangle rct1 = new Rectangle(0.16, 1.0);

        //before altering values - sol 2.1.3
        System.out.println(rct1.toString());
        //sol 2.1.2
        double newLength = rct1.getLength()/4;
        rct1.setLength(newLength);

        rct1.setWidth(rct1.getWidth()*4); //short writing

        //sol 2.1.3 after altering values
        System.out.println(rct1.toString());

        //sol 2.1.4
        System.out.println(rct1.isSquare());

        //sol 2
        System.out.println("The area of the rectangle is"+rct1.calculateArea());

    }
}
