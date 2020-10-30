// import java.util.Arrays;
public class Tester {
    public static void main(String[] args) {

        // My Tests
    // test points straight up and down from each other
        System.out.println("dis test 1 " + (new Point(5, 0).distanceTo(new Point(-5, 0)) == 10));
        System.out.println("dis test 2 " + (new Point(0, 10).distanceTo(new Point(0, 0)) == 10));

    // scalene
        // 3 4 5
        
        System.out.println("scalene test 1 " + (new Triangle(0, 0 ,0, 3, 4, 0).classify().equals("scalene")));

        // 30 60 90
        System.out.println("scalene test 2 " + (new Triangle(0,0 , 1 , 0, 0, Math.sqrt(3)).classify().equals("scalene")));
        
    // isosceles
        System.out.println("isosceles test 1 " + (new Triangle(0,0 , 1 , 10, 2, 0).classify().equals("isosceles")));
    // equilateral
    
        System.out.println("equilateral test 1 " + (new Triangle(0, 10/Math.sqrt(3), -10/2 , -10/(2 *Math.sqrt(3)) , 10/2, -10/(2 *  Math.sqrt(3))).classify().equals("equilateral")));


    // perimeter
        // 3, 4, 5 triangle
        System.out.println("perimeter test 1 " + (new Triangle(0,0,0,3,4,0).getPerimeter() == 12.0));
        // 30 60 90

        // System.out.println("perimeter test 2 " + (Triangles.perimeter(0,0,1,0, 0, Math.sqrt(3)) ));
        // System.out.println(Math.sqrt(3) + 3);
     
        
    // Area
        System.out.println("Area test 1 " + (new Triangle(0,0,0,3,4,0).getArea() == 6.0));

// my answer key for reng's classify triangles

String[] answerTriangles = {
    "equilateral", 
    "equilateral",
    "isosceles",
    "isosceles",
    "scalene",
    "isosceles",
    "scalene",
    "isosceles",
    "equilateral",
    "isosceles",
    "isosceles"
};

        // other people's test

        // reng's god battery of tests from assignment 6//
        double[][] pointsAndDistance = {                                            //Stores the coordinate of the two endpoints of a line and then their distance rounded to the ten thousandth. {x1, y1, x2, y2, distance}
      {1,1,1,1,0},                                                              //checks for degenerate line cases.
      {2,3,2,1,2},                                                              //vertical line distance check.
      {-1,-1,2,3,5},                                                            //checks for line that is at a diagonal but collapses to an integer distance.
      {-5.329,7.8,-5.329,-2.2,10},                                              //horizontal line check with FP numbers.
      {7.8,-5.239,-2.2,-5.239,10},                                              //vertical line check with FP numbers.
      {0.23,1.24325,0.23,1.24325,0},                                            //degenerate point check with FP values.
    };
double[][] points = {                                                       //Test triangles.
      {0,0,0,0,0,0},                                                            //degenerate equilateral
      {12.21321,12321.232,12.21321,12321.232,12.21321,12321.232},               //degenerate FP equilateral
      {0,0,0,0,0,1},                                                            //degenerate isosceles (up down)
      {1,0,0,0,0,0},                                                            //degenerate isosceles (left right)
      {0,0,1,0,3,0},                                                            //degenerate scalene
      {0,1,1,0,0,0},                                                            //isosceles right triangle
      {1.023,12,123,1.194,234325,21321},                                        //scalene
      {0,1,0,0,1,0.5},                                                          //isosceles
      {0.1,0.1,-1.9,0.1,-0.9,-1.632051},                                        //equilateral
      {-10,0,0,0,-5,2},                                                         //isosceles
      {0,1000,0,0,1000,0},                                                      //isosceles
    };

double[][] pointsAndPerimeterLength = {                                     //format {x1,y1,x2,y2,x3,y3,perimeter}
      {0,0,0,0,0,0,0},                                                          //degenerate equilateral case
      {643.43,23.4,643.43,23.4,643.43,23.4,0},                                  //degenerate equilateral case off origin
      {0,0,1,0,0,0,2},                                                          //degenerate isosceles
      {0,0,1,0,3,0,6},                                                          //degenerate scalene
      {0,3,4,0,0,0,12},                                                         //3,4,5 triangle (scalene)
    };
double[][] pointsAndArea = {                                                //format {x1,y1,x2,y2,x3,y3,area}
      {0,0,0,0,0,0,0},                                                          //degenerate equilateral
      {463532.23,6432.32,463532.23,6432.32,463532.23,6432.32,0},                //degenerate FP equilateral
      {1.2,0,0,0,1.2,0,0},                                                      //degenerate isosceles
      {0,3,0,1,0,0,0},                                                          //degenerate scalene
      {3,0,0,0,0,4,6},                                                          //3 4 5 scalene
    };

    int counter = 0;
    // distance
    for (double[] i : pointsAndDistance){
        System.out.println("dis other tests " + counter + (new Point(i[0], i[1]).distanceTo(new Point(i[2], i[3])) == i[4]) + (new Point(i[0], i[1]).distanceTo(new Point(i[2], i[3]))));
        counter ++;
    }
    counter = 0;
    // classify
    for (int i = 0 ; i < points.length ; i ++){
        System.out.println("classify other tests " + counter + (new Triangle(points[i][0], points[i][1], points[i][2], points[i][3], points[i][4], points[i][5]).classify().equals(answerTriangles[i])));
        counter ++;
    }
    // perimeter
    counter = 0;

    for (double[] i : pointsAndPerimeterLength ){
        // System.out.println(Arrays.toString(i));
        System.out.println("perimeter other tests " + counter + (new Triangle(i[0], i[1], i[2], i[3], i[4], i[5]).getPerimeter() == i[6]));
        System.out.println(new Triangle(i[0], i[1], i[2], i[3], i[4], i[5]).getPerimeter());
        counter ++;
    }

    // area
    counter = 0;
    for (double[] i : pointsAndArea ){
        System.out.println("area other tests " + counter + (new Triangle(i[0], i[1], i[2], i[3], i[4], i[5]).getArea() == i[6]));
        System.out.println(new Triangle(i[0], i[1], i[2], i[3], i[4], i[5]).getArea());
        counter ++;
    }
    }
}
