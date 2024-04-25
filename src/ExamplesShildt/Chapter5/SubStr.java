package ExamplesShildt.Chapter5;
// Применение метода substring
// Общий синтаксис
// string substring(int начальныый_индекс, int конечный_индекс)
public class SubStr {
    public static void main(String[] args) {
        String orgstr = "Java - двигатель Интернета";

        // Сформировать подстроку
        String substr = orgstr.substring(7, 25);

        System.out.println("orgstr: " + orgstr);
        System.out.println("substr: " + substr);
    }
}
