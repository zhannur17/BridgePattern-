class PrintedStyle implements CardStyle {
    @Override
    public void design(String cardType) {
        System.out.println("Designing " + cardType + " in printed style.");
    }
}
