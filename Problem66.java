public class Problem66 {
    public static void main(String[] args) {
        for (Day d : Day.values()) {
            System.out.println(d + " : " + d.getType());
        }
    }
}

enum Day {
    SUNDAY(false), MONDAY(true), TUESDAY(true), WEDNESDAY(true), THURSDAY(true), FRIDAY(true), SATURDAY(false);

    public boolean isWeekday;

    Day(boolean isWeekday) {
        this.isWeekday = isWeekday;
    }

    public String getType() {
        return isWeekday ? "Weekday" : "Weekend";
    }
}
