public class SwitchExample {
    public static void main(String[] args) {
        int dayOfWeek = 3;
        String dayName;

        switch (dayOfWeek) {
            case 1:
                dayName = "Monday";
                break;
            case 2:
                dayName = "Tuesday";
                break;
            case 3:
                dayName = "Wednesday";
                break;
            // ... other cases ...
            default:
                dayName = "Invalid day";
        }

        System.out.println("Day of the week: " + dayName);
    }
}
