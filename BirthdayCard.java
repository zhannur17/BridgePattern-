class BirthdayCard extends GreetingCard {
    public BirthdayCard(CardStyle style) {
        super(style);
    }

    @Override
    public void create() {
        System.out.println(" Creating Birthday Card:");
        style.design("Birthday Card");
        System.out.println();
    }
}