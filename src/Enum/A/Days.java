package Enum.A;
@SuppressWarnings("unused")
public enum Days {
    Sunday,Monday,Tuesday,Wednesday,Thursday,Friday,Saturday;

    public static boolean isDayOff(Days day) {
        return (day.equals(Days.Sunday) || day.equals(Days.Saturday));
    }

}
