public class Rectangle {
    private int length;
    private int width;
    private String name;

    public Rectangle() {
        length = 10;
    }

    public String getInfo() {
        String str = "length: " + length + "\n";
        str += "width: " + width + "\n";
        str += "name: " + name;
        return str;
    }
}
