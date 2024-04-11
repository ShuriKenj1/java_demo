package HW.Second;

public class LogicalOpTableSoluton01 {
    public static void main(String[] args) {
        boolean p, q;

        System.out.println("P\tQ\tAND\tOR\tXOR\tNOT");

        p = true;
        q = true;

        printLineTernaryVersion2(true,false);

        p = true;
        q = false;

        printLineTernaryVersion2(true,false);

        p = false;
        q = true;

        printLineTernaryVersion2(true,false);

        p = false;
        q = false;

        printLineTernaryVersion2(true,false);

        printLineArrMethod(true, false);

        p = true;
        q = true;

        printLineArray(p, q);

        p = true;
        q = false;

        printLineArray(p, q);

        p = false;
        q = true;

        printLineArray(p, q);

        p = false;
        q = false;

        printLineArray(p, q);

        System.out.println();

        System.out.println("P\tQ\tAND\tOR\tXOR\tNOT");
        p = true;
        q = true;

        printLineTernary(p, q);

        p = true;
        q = false;

        printLineTernary(p, q);

        p = false;
        q = true;

        printLineTernary(p, q);

        p = false;
        q = false;

        printLineTernary(p, q);

        System.out.println("P\tQ\tAND\tOR\tXOR\tNOT");

        p = true; q = true;
        System.out.print((p?1:0) + "\t" + (q?1:0) + "\t");
        System.out.print((p&q?1:0) + "\t" + (p|q?1:0) + "\t");
        System.out.println((p^q?1:0) + "\t" + (!p?1:0));

        p = true; q = false;
        System.out.print((p?1:0) + "\t" + (q?1:0) + "\t");
        System.out.print((p&q?1:0) + "\t" + (p|q?1:0) + "\t");
        System.out.println((p^q?1:0) + "\t" + (!p?1:0));

        p = false; q = true;
        System.out.print((p?1:0) + "\t" + (q?1:0) + "\t");
        System.out.print((p&q?1:0) + "\t" + (p|q?1:0) + "\t");
        System.out.println((p^q?1:0) + "\t" + (!p?1:0));

        p = false; q = false;
        System.out.print((p?1:0) + "\t" + (q?1:0) + "\t");
        System.out.print((p&q?1:0) + "\t" + (p|q?1:0) + "\t");
        System.out.println((p^q?1:0) + "\t" + (!p?1:0));
    }
    public static void printLine(boolean p, boolean q){
        if (p) System.out.print(1);
        else System.out.print(0);
        System.out.println("\t");
        if (q) System.out.print(1);
        else System.out.print(0);
        System.out.println("\t");
        if (p&q) System.out.print(1);
        else System.out.print(0);
        System.out.println("\t");
        if (p|q) System.out.print(1);
        else System.out.print(0);
        System.out.println("\t");
        if (p^q) System.out.print(1);
        else System.out.print(0);
        System.out.println("\t");
        if (!p) System.out.print(1);
        else System.out.print(0);
        System.out.println("\t");
    }

    public static void printLineArray(boolean p, boolean q) {
        boolean[] statements = {p, q, (p&q), (p|q), (p^q), (!p)};

        for (boolean statement : statements) {
            if (statement) System.out.print(1);
            else System.out.print(0);
            System.out.print("\t");
        }
        System.out.println();
    }

    public static void printLineTernary(boolean p, boolean q) {
        boolean[] statements = {p, q, (p&q), (p|q), (p^q), (!p)};

        for (boolean statement : statements) {
            System.out.print((statement?1:0) + "\t");
        }
        System.out.println();
    }

    public static int boolToInt(boolean b){
        return Boolean.compare(b, false);
    }

    public static void printLineTernaryVersion2(boolean p, boolean q){
        System.out.print(boolToInt(p) + "\t");
        System.out.print(boolToInt(q) + "\t" );
        System.out.print(boolToInt(p&q) + "\t");
        System.out.print(boolToInt(p|q) + "\t");
        System.out.print(boolToInt(p^q) + "\t");
        System.out.print(boolToInt(!p) + "\t");
    }

    public static void boolToIntPrint(boolean b){
        System.out.println(Boolean.compare(b, false) + "\t");
    }

    public static void printLineArrMethod(boolean p, boolean q){
        boolean[] statements = {p, q, (p&q), (p|q), (p^q), (!p)};

        for (boolean statement : statements) {
            boolToIntPrint(statement);
        }
        System.out.println();
    }
}
