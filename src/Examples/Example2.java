package Examples;
class Example2 {
    public static void main(String args[]) {
        int var1; //объявляется переменная
        int var2; //объявляется еще одна переменная

//        Можно было бы объявить переменные сверху так - int var1, var2;

        var1 = 1024; // переменной var1 присваивается значение 1024

        System.out.println("Переменная var1 содержит " + var1);

        var2 = var1 / 2;

        System.out.print("Переменная var2 содержит var1 / 2: ");
        System.out.println(var2);
    }
}
