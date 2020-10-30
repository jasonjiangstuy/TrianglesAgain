public class Triangle {
    private Point v1, v2, v3;

    public Triangle(Point a, Point b, Point c){
        v1 = a;
        v2 = b;
        v3 = c;
    }

    public Triangle(double x1, double y1,double x2, double y2,double x3, double y3){
        v1 = new Point(x1, y1);
        v2 = new Point(x2, y2);
        v3 = new Point(x3, y3);
    }

    public double getPerimeter(){
        double l1 = v1.distanceTo(v2);
        double l2 = v1.distanceTo(v3);
        double l3 = v3.distanceTo(v2);
        return l1 + l2 + l3;
    }

    public double getArea() {
        double l1 = v1.distanceTo(v2);
        double l2 = v1.distanceTo(v3);
        double l3 = v3.distanceTo(v2);
        double semi = (l1 + l2 + l3) / 2.0 ;
        return (Math.sqrt(semi * (semi - l1) * (semi - l2) * (semi - l3)));
    }

    public String classify(){
        int sameLen = 0;
        double l1 = Math.round(v1.distanceTo(v2) * 10000.0) / 10000.0;
        double l2 = Math.round(v1.distanceTo(v3) * 10000.0) / 10000.0;
        double l3 = Math.round(v3.distanceTo(v2) * 10000.0) / 10000.0;
        if (l1==l2)
        sameLen ++;
        if (l1==l3)
        sameLen ++;
        if (l3==l2)
        sameLen ++;

        switch(sameLen) {
            case 0:
                return ("scalene");
            case 1:
                return ("isosceles");
            case 3:
                return ("equilateral");  
        }
        return "Fail";
    }

    public String toString(){
        return ("v1(" + v1.getX() +", " + v1.getY() + ") " + 
                "v2(" + v2.getX() +", " + v2.getY() + ") " +  
                "v3(" + v3.getX() +", " + v3.getY() + ")"
        );
    }

    public void setVertex(int index, Point newP){
        switch(index) {
            case 0:
                v1 = newP;
                break;
            case 1:
                v2 = newP;
                break;
            case 2:
                v3 = newP;  
                break;
        }
    }

}


