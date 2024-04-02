package ExamplesShildt.Chapter4;

public class CheckNum {
//    вернуть логическое значение true,
//    если x содержит четное число
    boolean isEven(int x) { // здесь x - целочисленный параметр метода isEven()
        if ((x%2) == 0) return true;
        else return false;
    }
}

class ParameterDemo {
    public static void main(String[] args) {
        CheckNum e = new CheckNum();

        if (e.isEven(10)) System.out.println("10 - четное число"); // в данном случае, 10 - это АРГУМЕНТ

        if (e.isEven(9)) System.out.println("9 - четное число"); // этого программа не выдаст после компиляции

        if (e.isEven(8)) System.out.println("8 - четное число");
    }
}

class Factor {
    boolean isFactor(int a, int b) { // этот метод имеет два параметра
        if ((b % a) == 0) return true;
        else return false;
    }
}

class IsFactor {
    public static void main(String[] args) {
        Factor x = new Factor();

        if (x.isFactor(2, 20)) System.out.println("2 - делитель"); // передача двух аргументов методу
        if (x.isFactor(3,20))
            System.out.println("Эта строка не будет выведена");
    }
}
