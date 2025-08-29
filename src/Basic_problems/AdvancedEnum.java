package Basic_problems;

/**
 *
 * Design an enum `EmployeeRole` with MANAGER, DEVELOPER, and ANALYST.
 * Include a constructor with a salary multiplier,
 * a method to calculate annual bonus based on a base salary,
 * and override `toString()` to include role and bonus.
 * Involves constructors, method overriding, and dynamic calculation, showcasing enum extensibility.

 */
public class AdvancedEnum {
    public static void main(String[] args) {
        EmployeeRole manager=EmployeeRole.MANAGER;
        System.out.println(manager.getBase());
        System.out.println(manager.getMuptilier());
        System.out.println(manager.annualBonus());
        System.out.println(manager.toString());
    }
}

enum EmployeeRole{

        MANAGER(1.3F, 2_000_000), DEVELOPER(0.8F, 21_324_450.5F),ANALYST(1.1F, 5_700_000);

        private final float muptilier;
        private final float base;
        EmployeeRole( float muptilier, float base){
            this.muptilier = muptilier;
            this.base=base;
        }

    public float getBase() {
        return base;
    }

    public float getMuptilier() {
        return muptilier;
    }

    public float annualBonus(){
            return getBase()*getMuptilier()-getBase();
    }

    @Override
    public String toString() {
        return "Base: "+getBase()+" Annual bonus: "+annualBonus();
    }
}
