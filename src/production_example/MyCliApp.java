package production_example;

class MyCliApp {
    public static void main(String[] args) {
        if (args.length > 0) {
            String command = args[0];
            switch (command) {
                case "greet":
                    if (args.length > 1) {
                        System.out.println("Hello, " + args[1] + "!");
                    } else {
                        System.out.println("Hello, stranger!");
                    }
                    break;
                case "help":
                    System.out.println("Usage: java MyCliApp <command> [arguments]");
                    System.out.println("Commands: greet <name>, help");
                    break;
                default:
                    System.out.println("Unknown command: " + command);
            }
        } else {
            System.out.println("No command provided. Use 'help' for usage.");
        }
    }
}
