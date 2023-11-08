import java.util.Arrays;

public class Farm {
    String adress ;
    Cow [] cows;
    String name;

    public Farm() {
    }

    public Farm(String adress, Cow[] cows, String name) {
        this.adress = adress;
        this.cows = cows;
        this.name = name;
    }

    @Override
    public String toString() {
        return "\n" +
                "\nadress='" + adress + '\'' +
                "\ncows=" + Arrays.toString(cows) +
                "\nname='" + name ;
    }
}
