package herencias.clases;

public abstract class Color {
    private String color;

    public Color(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public String setColor(String color) {
        if(color == "rojo"){
            this.color = "nestor";
        }
        return this.color = color;
    }


}
