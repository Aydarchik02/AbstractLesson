public class Main {
    public static void main(String[] args) {

        Cow cow = new Cow(100,4,"Male","Burenka");
        Cow cow2 = new Cow(100,4,"Male","Burenka");
        Cow cow3 = new Cow(100,4,"Male","Burenka");
        Cow cow4 = new Cow(100,4,"Male","Burenka");
        Cow cow5 = new Cow(100,4,"Male","Burenka");


        Farm farm = new Farm();
        farm.adress = "Turgeneva";
        farm.cows = new Cow[]{cow, cow2, cow3, cow4,cow5};
        farm.name = "Aydar";

        Farm farm2 = new Farm();
        farm2.adress = "Turgeneva";
        farm2.cows = new Cow[]{cow, cow2, cow3, cow4,cow5};
        farm2.name = "Kairat";

        System.out.println("Farm 1 "+farm);
        System.out.println("==================================================");
        System.out.println("Farm 2 "+farm2);
    }

}