package modelo;

public class ColorItem {
    private  int code;

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    private  String description;

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public  ColorItem(int code, String description){
        this.code = code;
        this.description = description;
    }

}
