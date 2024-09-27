class Maths {
    public static void main(String[] args) {
        double x = 3, y = 4, a = Math.sqrt(++x) + Math.sqrt(y--), b = 5, c = 6, d;
        d = Math.sqrt(a) + Math.sqrt(b) * c / y;
        System.out.println("d =" + d);
        System.out.println("y ="+y);
        
    }
}