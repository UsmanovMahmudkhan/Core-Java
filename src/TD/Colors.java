package TD;

enum Colors {
    GOLD("\u001B[38;2;255;215;0m"),
    ROSE_GOLD("\u001B[38;2;255;182;193m"),
    GRAPHITE("\u001B[38;2;54;69;79m"),
    PACIFIC_BLUE("\u001B[38;2;0;76;153m"),
    SPACE_BLACK("\u001B[38;2;20;20;20m"),
    TITANIUM("\u001B[38;2;150;150;150m"),
    EMERALD("\u001B[38;2;0;201;87m"),
    BURGUNDY("\u001B[38;2;128;0;32m"),
    LAVENDER("\u001B[38;2;181;126;220m"),
    SKY("\u001B[38;2;135;206;235m"),
    MINT("\u001B[38;2;152;255;152m"),
    PEARL("\u001B[38;2;245;245;245m"),
    ORANGE("\u001B[38;2;255;94;77m"),
    PURPLE("\u001B[38;2;75;0;130m"),
    NAVY("\u001B[38;2;0;0;128m"),
    SAPPHIRE("\u001B[38;2;15;82;186m"),
    RUBY("\u001B[38;2;224;17;95m"),
    AURORA("\u001B[38;2;255;110;180m"),
    FROST("\u001B[38;2;190;220;250m"),
    SILVER("\u001B[38;2;192;192;192m"),
    TEAL("\u001B[38;2;0;128;128m"),
    CORAL("\u001B[38;2;255;127;80m"),
    MIDNIGHT("\u001B[38;2;25;25;112m"),
    RESET("\u001B[0m");

    private final String code;
    Colors(String code) { this.code = code; }
    public String c() { return code; }
}