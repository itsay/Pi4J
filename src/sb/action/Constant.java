package sb.action;

import jodd.props.Props;

/**
 * Created by spiritbomb on 4/14/2015.
 */
public final class Constant {
    public final static String PATH = Constant.class.getClassLoader().getResource("").getPath().substring(1, Constant.class.getClassLoader().getResource("").getPath().indexOf("WEB-INF"));
    public static Props P = new Props();

    public enum Status {
        ON, OFF
    }
    public static Status ARDUINO_PIN7 = Status.OFF; //fan
}
