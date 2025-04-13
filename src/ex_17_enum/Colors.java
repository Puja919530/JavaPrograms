package ex_17_enum;
import java.awt.*;

public enum Colors {
    RED("FF0000"),
    GREEN("#61FF33"),
    BLUE("#3377FF"),
    YELLOW("#4477FF");

    private String hexaCode;
    Colors(String hexaCode){
        this.hexaCode=hexaCode;
    }
    String getHexaCode(){
        return this.hexaCode;
    }

}
