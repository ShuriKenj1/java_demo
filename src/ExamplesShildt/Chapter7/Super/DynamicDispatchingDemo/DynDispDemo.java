package ExamplesShildt.Chapter7.Super.DynamicDispatchingDemo;

public class DynDispDemo {
    public static void main(String[] args) {
        Superclass superOb = new Superclass();
        Subclass1 subOb1 = new Subclass1();
        Subclass2 subOb2 = new Subclass2();

        Superclass supReference; // ссылается на объект типа Superclass
        /* В каждом из последующих вызовов выбор версии метода who()
        осуществляется по типу объекта, на который указывает ссылка
        во время выполнения */
        supReference = superOb;
        supReference.who();

        supReference = subOb1;
        supReference.who();

        supReference = subOb2;
        supReference.who();
    }
}
