public class Main {
    public static void main(String[] args) {
        GreetingCard birthday = new BirthdayCard(new HandDrawnStyle());
        birthday.create();

        GreetingCard holiday = new HolidayCard(new PrintedStyle());
        holiday.create();

        GreetingCard thankYou = new ThankYouCard(new DigitalStyle());
        thankYou.create();
    }
}
