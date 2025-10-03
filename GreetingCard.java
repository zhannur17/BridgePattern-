abstract class GreetingCard {
    protected CardStyle style;

    public GreetingCard(CardStyle style) {
        this.style = style;
    }

    public abstract void create();
}