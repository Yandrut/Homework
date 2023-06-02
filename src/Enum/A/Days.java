package Enum.A;
@SuppressWarnings("unused")
public enum Days {
    SUNDAY,MONDAY,TUESDAY,WEDNESDAY,THURSDAY,FRIDAY,SATURDAY;

    public static boolean isDayOff(Days day) {
        return (day.equals(Days.SUNDAY) || day.equals(Days.SATURDAY));
    }

}
