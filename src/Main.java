import java.util.Random;

public class Main {
    public static void main(String[] args) {
        System.out.println(permession(18, 27));
        System.out.println(permession(5, 15));
        System.out.println(permession(8, 21));
        System.out.println(permession(11, 23));
        System.out.println(permession(25, 13));
        System.out.println(permession(25, generateRandomAge()));
    }
    public static String permession(int age, int temperature) {
        if ((age >= 20 && age <= 45 && temperature >= -20 && temperature <= 30) ||
                (age < 20 && temperature >= 0 && temperature <= 28) ||
                (age > 45 || temperature >= -10 && temperature <= 25)) {
            return ("Можно идти гулять");
        } else return ("Оставайтесь дома");

    }



    public static int generateRandomAge(){
        Random randomAge = new Random();
        return randomAge.nextInt(100) + 1;
    }

}