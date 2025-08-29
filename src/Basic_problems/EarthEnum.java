package Basic_problems;

public class EarthEnum {
    public static void main(String[] args) {
        for (Planets p : Planets.values()) {
            System.out.println(p + " is about " + p.getDistanceFromSun() + " km from the Sun.");
        }
    }
}

enum Planets {
    MERCURY(57_900_000),
    VENUS(108_200_000),
    EARTH(149_600_000),
    MARS(227_900_000),
    JUPITER(778_500_000),
    SATURN(1_434_000_000L),
    URANUS(2_871_000_000L),
    NEPTUNE(4_495_000_000L);

    private final long distanceFromSun;

    Planets(long distanceFromSun) {
        this.distanceFromSun = distanceFromSun;
    }

    public long getDistanceFromSun() {
        return distanceFromSun;
    }
}