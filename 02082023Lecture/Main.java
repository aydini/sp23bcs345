/**
 *
 * @author itlabs
 */
public class Main {
        
    public static void main(String[] args) {
        double total = MathFunctions.getSum_staticVersion(10, 20, 30);
        System.out.printf("sum is %.2f ", total);

        MathFunctions mf = new MathFunctions();
        double total2 = mf.getSum_nonStaticVersion(10, 20, 30);
        System.out.printf("sum is %.2f\n", total);
        
        MathFunctions mf2 = new MathFunctions();
        System.out.printf("before update mf.PI %.3f\n", mf.PI);
        System.out.printf("before update mf.nonStaticVariable %.3f\n"
                , mf.aNonStaticVariable);
        mf2.PI = 7.777;  // update PI via mf2 but this will impact mf
        mf2.aNonStaticVariable = 7.777;
        System.out.printf("after update mf.PI %.3f\n", mf.PI);
        System.out.printf("after update mf.nonStaticVariable %.3f\n"
                , mf.aNonStaticVariable);
    }    
}
