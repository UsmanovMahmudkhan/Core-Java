package Basic_problems;

/**
 * Modify a deprecated class annotation to
 * include a reason and date.
 */

public class ModifyAnno {

    public static void main(String[] args) {
        MyAnnoforModifyDeprecated.getMassage();
    }
}


class MyAnnoforModifyDeprecated{
    @Deprecated(since = "2025-09-08",forRemoval = true)
    public static void getMassage(){
        System.out.println("hello deprecated");
    }

}

