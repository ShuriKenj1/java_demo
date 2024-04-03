package HW.Fourth;

public class Square {
    int sd;
    Square(int side) {
        this.sd = side;
    }

    int area(){
        return sd * sd;
    }
}

class SquareDemo {
    public static void main(String[] args) {
        Square square1 = new Square(5);

        System.out.println("Площадь квадрата равна " + square1.area());
    }
}
