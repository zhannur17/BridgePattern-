class HolidayCard extends GreetingCard {
    public HolidayCard(CardStyle style) {
        super(style);
    }

    @Override
    public void create() {
        System.out.println("Creating Holiday Card:");
        style.design("Holiday Card");
        System.out.println();
    }
}