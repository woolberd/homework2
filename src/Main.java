public class Main {
    public static void main(String[] args) {
        System.out.println(ageAndTemperature(33, 20));
        System.out.println(ageAndTemperature(13, 23));
        System.out.println(ageAndTemperature(34, 32));
        System.out.println(ageAndTemperature(56, 41));
        System.out.println(ageAndTemperature(12, 43));

    }

    public static String ageAndTemperature(int age, int temperature) {
        if (age >= 20 && age <= 45 && temperature >= -20 && temperature <= 30) {
            return "можно идти гулять";
        } else if (age < 20 && temperature >= 0 && temperature <= 28) {
            return "можно идти гулять";
        } else if (age >= 45 && temperature >= -10 && temperature <= 25) {
            return "можно идти гулять";
        } else {
            return "оставайтесь дома";
        }
    }
}

