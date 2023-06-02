package Enum.A;
@SuppressWarnings("unused")
public enum Days {
    SUNDAY, MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY;


    public static String dayOff(String day) {
        if (day == null || day.isEmpty()) throw new IllegalArgumentException("Day cannot be null");

        if (day.equalsIgnoreCase(String.valueOf(Days.SUNDAY)) ||
                day.equalsIgnoreCase(String.valueOf(Days.SATURDAY))) {
            return day + " is a day off!";
        }
        Days[] days = Days.values();
        String[] stringDays = new String[days.length];

        for (int i = 0; i < days.length; i++) {
            stringDays[i] = String.valueOf(days[i]);

            if (day.equalsIgnoreCase(stringDays[i])) {
                return day + " is a work day";
            }
        }
        throw new IllegalArgumentException(day + " is not a valid day of the week");
    }
}