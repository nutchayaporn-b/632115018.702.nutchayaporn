public class circle {

    public static void circle1() {
        double r = 2.0;
        System.out.println("Area of circle1 is   :" + Math.PI * r * r);
        System.out.println("Circumference of circle1 is  :" + 2 * Math.PI * r);

    }

    public static void circle2() {
        double r = 3.0;
        System.out.println("Area of circle2 is   :" + Math.PI * r * r);
        System.out.println("Circumference of circle2 is  :" + 2 * Math.PI * r);

    }

    public static void circle3() {
        double r = 1.0;
        System.out.println("Area of circle3 is  :" +Math.PI * r * r);
        System.out.println("Circumference of circle3 is  :" + 2 * Math.PI * r);

    }

    public static void circle4() {
        double r = -1.0;
        if (r < 0) {
            System.out.println("Area of circle4 is : 0");
            System.out.println("Circumference of circle4 is : 0");
        }

    }
    public static void intersec13(){
        double m1 = 0.0;
        double b1 = 3.0;
        double m2 = 0.0;
        double b2 = 5.0;
        double r1 = 2.0;
        double r2 = 1.0;
        double area = (m1 - m2) * (m1 - m2) * (b1 - b2) * (b1 - b2);
        double line = (r1 + r2) * (r1 + r2);//6
        if (area <= line) {
            System.out.println("Is circle 1 intersec circle 3: False");

        } else {
            System.out.println("Is circle 1 intersec circle 3: True");
        }

    }

    public static void intersec12() {
        double m1 = 0.0;
        double b1 = 1.0;
        double m2 = 0.0;
        double b2 = 2.0;
        double r1 = 2.0;
        double r2 = 3.0;
        double area = (m1 - m2) * (m1 - m2) * (b1 - b2) * (b1 - b2);
        double line = (r1 + r2) * (r1 + r2);
        if (area <= line) {
            System.out.println("Is circle 1 intersec circle 2: True");

        } else {
            System.out.println("Is circle 1 intersec circle 2: False");
        }
    

    }   
    

}

