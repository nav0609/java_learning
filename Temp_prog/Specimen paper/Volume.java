class Circle {
    double area,radius;
    Circle(double r){
        radius=r;
        area=0.0;
    }
    void cal_area() {
        area = 3.14 * radius * radius;
    }

    void display() {
        System.out.println("Area of circle = " + area);
    }
}

class Volume extends Circle {
    double volume,height;

    Volume(double r,double h) {
        super(r);
        volume = 0.0;
        height = h;
    }

    double Calculate() {
        cal_area();
        volume = area * height;
        return volume;
    }

    void display() {
        System.out.println("Volume of cynlinder = " + volume);
    }
}
