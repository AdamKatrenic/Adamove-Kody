package Objekty.cvicenie1;

public class PostIt {

    public PostIt(String text, String textColor, String backgroundColor) {
        this.text = text;
        this.textColor = textColor;
        this.backgroundColor = backgroundColor;
    }

    String backgroundColor;
    String text;
    String textColor;

    @Override
    public String toString() {
        return "PostIt{" +
                "backgroundColor='" + backgroundColor + '\'' +
                ", text='" + text + '\'' +
                ", textColor='" + textColor + '\'' +
                '}';
    }
}
