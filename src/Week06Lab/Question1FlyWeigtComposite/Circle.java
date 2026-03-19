package Week06Lab.Question1FlyWeigtComposite;

class Circle implements Shape {
    private final Color color;

    public Circle(String color) {
        this.color = ColorFactory.getColor(color);
    }

    @Override
    public Color getColor() {
        return color;
    }
}

