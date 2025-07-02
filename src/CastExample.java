public class CastExample {
    public static void main(String[] args) {
        long x_long=923456789876755453L;
        int x_int = (int) x_long;
        byte x_byte = (byte) x_int;
        short x_short=(short) x_int;
        double y_double=123.987654321;
        float y_float=(float) y_double;

        System.out.println("from LONG: "+x_long+" to INT --> "+x_int);
        System.out.println("from INT: "+x_int+" to BYTE --> "+x_byte);
        System.out.println("from INT: "+x_int+" to SHORT --> "+x_short);
        System.out.println("from DOUBLE: "+y_double+" to FLOAT --> "+y_float);

    }
}
