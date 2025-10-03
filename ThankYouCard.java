class ThankYouCard extends GreetingCard {
    public ThankYouCard(CardStyle style) {
        super(style);
    }

    @Override
    public void create() {
        System.out.println("Creating Thank You Card:");
        style.design("Thank You Card");
        System.out.println();
    }
}