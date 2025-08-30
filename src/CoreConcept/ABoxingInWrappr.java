package CoreConcept;

class ABoxingInWrappr {
    public static void main(String[] args) {
        Integer iOb = 1000;
        int i = iOb.byteValue();
        System.out.println(i);

        /**
         * output: -24
         */
    }
}