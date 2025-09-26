package Basic_problems;

public class Name {
    public static void main(String[] args) {
        String[] colors = {
                "\u001B[31m",
                "\u001B[32m",
                "\u001B[33m",
                "\u001B[34m",
                "\u001B[35m",
                "\u001B[36m"
        };
        String reset = "\u001B[0m";
        String name = "MAHMUDKHON";

        for (int row = 0; row < 5; row++) {
            for (int i = 0; i < name.length(); i++) {
                char c = name.charAt(i);
                String color = colors[i % colors.length];
                for (int col = 0; col < 5; col++) {
                    if (isStar(c, row, col)) {
                        System.out.print(color + "*" + reset);
                    } else {
                        System.out.print(" ");
                    }
                }
                System.out.print("  "); // space between letters
            }
            System.out.println();
        }
    }

    private static boolean isStar(char ch, int row, int col) {
        switch (ch) {
            case 'M': return col == 0 || col == 4 || (row == col && row <= 2) || (row + col == 4 && row <= 2);
            case 'A': return row == 0 || row == 2 || col == 0 || col == 4;
            case 'H': return col == 0 || col == 4 || row == 2;
            case 'U': return (col == 0 || col == 4) && row < 4 || row == 4;
            case 'D': return col == 0 || (col == 4 && row > 0 && row < 4) || (row == 0 && col < 4) || (row == 4 && col < 4);
            case 'K': return col == 0 || (row + col == 4) || (row == col && col > 1);
            case 'O': return row == 0 || row == 4 || col == 0 || col == 4;
            case 'N': return col == 0 || col == 4 || row == col;
            default: return false;
        }
    }
}