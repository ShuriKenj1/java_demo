package Lesson14;

public class IConstImpl implements IConst{
    public static void main(String[] args) {
        int[] nums = new int[MAX];

        for (int i = MIN; i < 11; i++){
            if (i >= MAX) System.out.println(ERRORMSG);
            else {
                nums[i] = i;
                System.out.print(nums[i] + " ");
            }
        }

        B obj1 = new ImplementB();

        obj1.method1();
        obj1.method2();
        obj1.method3();

        D obj2 = new DefaultImpl();

        obj2.getUserID();
        System.out.println(obj2.getAdminID());

        System.out.println("Universal ID: " + D.getUniversalID());
    }
}
