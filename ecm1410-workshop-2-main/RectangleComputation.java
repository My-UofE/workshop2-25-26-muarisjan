public class RectangleComputation {
    public static void main(String[] args){

        //height and width parameters passed in, and double it for formulae
        double width = Double.parseDouble(args[0]);
        double height = Double.parseDouble(args[1]);

        //area +perimeter calc
        double area = height*width;
        double perimeter = 2* (height+width);

        //display relevant info
        System.out.println("area: " +area);
        System.out.println("perimeter: " +perimeter);

    }

}