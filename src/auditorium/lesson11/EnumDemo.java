package auditorium.lesson11;

public class EnumDemo {


    public static void main(String[] args) {

        Week week = Week.FRIDAY;

        Season season = Season.SUMMER;

        System.out.println(season.ordinal());

//        switch (season) {
//            case SPRING:
//                System.out.println("MARCH");
//                System.out.println("APRIL");
//                System.out.println("MAY");
//                break;
//            case SUMMER:
//                System.out.println("JUNE");
//                System.out.println("JULY");
//                System.out.println("AUGUST");
//                break;
//            case AUTUMN:
//                System.out.println("SEPTEMBER");
//                System.out.println("OCTOBER");
//                System.out.println("NOVEMBER");
//                break;
//            case WINTER:
//                System.out.println("DECEMBER");
//                System.out.println("JANUARY");
//                System.out.println("FEBRUARY");
//                break;
//        }
    }
}


final class Week {

    public static final Week MONDAY = new Week(1);
    public static final Week TUESDAY = new Week(2);
    public static final Week WEDNESDAY = new Week(3);
    public static final Week THURSDAY = new Week(4);
    public static final Week FRIDAY = new Week(5);
    public static final Week SATURDAY = new Week(6);
    public static final Week SUNDAY = new Week(7);

    private int value;

    private Week(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }
}

enum Season {
    SPRING(new String []{"MARCH", "APRIL", "MAY"}),
    SUMMER(new String []{"JUNE", "JULY", "AUGUST"}),
    AUTUMN(new String []{"SEPTEMBER", "OCTOBER", "NOVEMBER"}),
    WINTER(new String []{"DECEMBER", "JANUARY", "FEBRUARY"});

    private String[] months;
    Season(String[] months) {
        this.months = months;
    }

    public String[] getMonths() {
        return months;
    }

    public Season getSeasonByValue(int value) {
        for (Season season : Season.values()) {
            if (season.ordinal() == value) {
                return season;
            }
        }
        return null;
    }

}





