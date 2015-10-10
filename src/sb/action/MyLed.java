package sb.action;

import com.pi4j.io.gpio.*;

/**
 * Created by tuananh on 8/23/15.
 */
public class MyLed {
    public  GpioPinDigitalOutput led00Out;
    public  GpioPinDigitalOutput led01Out;
    public  GpioPinDigitalOutput led02Out;
    public  GpioPinDigitalOutput led03Out;
    public  GpioPinDigitalOutput led04Out;
    public  GpioPinDigitalOutput led05Out;
    public  GpioPinDigitalOutput led06Out;
    public  GpioPinDigitalOutput led07Out;
    public  GpioPinDigitalOutput led08Out;
    public  GpioPinDigitalOutput led09Out;
    public  GpioPinDigitalOutput led10Out;
    public  GpioPinDigitalOutput led11Out;
    public  GpioPinDigitalOutput led12Out;
    public  GpioPinDigitalOutput led13Out;
    public  GpioPinDigitalOutput led14Out;
    public  GpioPinDigitalOutput led15Out;
    public  GpioPinDigitalOutput led16Out;
    public  GpioPinDigitalOutput led17Out;
    public  GpioPinDigitalOutput led18Out;
    public  GpioPinDigitalOutput led19Out;
    public  GpioPinDigitalOutput led20Out;
    public  GpioPinDigitalOutput led21Out;
    public  GpioPinDigitalOutput led22Out;
    public  GpioPinDigitalOutput led23Out;
    public  GpioPinDigitalOutput led24Out;
    public  GpioPinDigitalOutput led25Out;
    public  GpioPinDigitalOutput led26Out;
    public  GpioPinDigitalOutput led27Out;
    
    public  GpioPinDigitalInput led00In;
    public  GpioPinDigitalInput led01In;
    public  GpioPinDigitalInput led02In;
    public  GpioPinDigitalInput led03In;
    public  GpioPinDigitalInput led04In;
    public  GpioPinDigitalInput led05In;
    public  GpioPinDigitalInput led06In;
    public  GpioPinDigitalInput led07In;
    public  GpioPinDigitalInput led08In;
    public  GpioPinDigitalInput led09In;
    public  GpioPinDigitalInput led10In;
    public  GpioPinDigitalInput led11In;
    public  GpioPinDigitalInput led12In;
    public  GpioPinDigitalInput led13In;
    public  GpioPinDigitalInput led14In;
    public  GpioPinDigitalInput led15In;
    public  GpioPinDigitalInput led16In;
    public  GpioPinDigitalInput led17In;
    public  GpioPinDigitalInput led18In;
    public  GpioPinDigitalInput led19In;
    public  GpioPinDigitalInput led20In;
    public  GpioPinDigitalInput led21In;
    public  GpioPinDigitalInput led22In;
    public  GpioPinDigitalInput led23In;
    public  GpioPinDigitalInput led24In;
    public  GpioPinDigitalInput led25In;
    public  GpioPinDigitalInput led26In;
    public  GpioPinDigitalInput led27In;

    private MyLed() {
        final GpioController gpio = GpioFactory.getInstance();
        led00Out = gpio.provisionDigitalOutputPin(RaspiPin.GPIO_00, "LED 00 out", PinState.HIGH);
        led00Out.setShutdownOptions(true, PinState.LOW, PinPullResistance.OFF);
        led01Out = gpio.provisionDigitalOutputPin(RaspiPin.GPIO_01, "LED 01 out", PinState.HIGH);
        led01Out.setShutdownOptions(true, PinState.LOW, PinPullResistance.OFF);
        led02Out = gpio.provisionDigitalOutputPin(RaspiPin.GPIO_02, "LED 02 out", PinState.HIGH);
        led02Out.setShutdownOptions(true, PinState.LOW, PinPullResistance.OFF);
        /*led03Out = gpio.provisionDigitalOutputPin(RaspiPin.GPIO_03, "LED 03 out", PinState.HIGH);
        led03Out.setShutdownOptions(true, PinState.LOW, PinPullResistance.OFF);*/
        led04Out = gpio.provisionDigitalOutputPin(RaspiPin.GPIO_04, "LED 04 out", PinState.HIGH);
        led04Out.setShutdownOptions(true, PinState.LOW, PinPullResistance.OFF);
        led05Out = gpio.provisionDigitalOutputPin(RaspiPin.GPIO_05, "LED 05 out", PinState.HIGH);
        led05Out.setShutdownOptions(true, PinState.LOW, PinPullResistance.OFF);
        led06Out = gpio.provisionDigitalOutputPin(RaspiPin.GPIO_06, "LED 06 out", PinState.HIGH);
        led06Out.setShutdownOptions(true, PinState.LOW, PinPullResistance.OFF);
        led07Out = gpio.provisionDigitalOutputPin(RaspiPin.GPIO_07, "LED 07 out", PinState.HIGH);
        led07Out.setShutdownOptions(true, PinState.LOW, PinPullResistance.OFF);
        led08Out = gpio.provisionDigitalOutputPin(RaspiPin.GPIO_08, "LED 08 out", PinState.HIGH);
        led08Out.setShutdownOptions(true, PinState.LOW, PinPullResistance.OFF);
        led09Out = gpio.provisionDigitalOutputPin(RaspiPin.GPIO_09, "LED 09 out", PinState.HIGH);
        led09Out.setShutdownOptions(true, PinState.LOW, PinPullResistance.OFF);
        /*led10Out = gpio.provisionDigitalOutputPin(RaspiPin.GPIO_10, "LED 10 out", PinState.HIGH);
        led10Out.setShutdownOptions(true, PinState.LOW, PinPullResistance.OFF);*/
        led11Out = gpio.provisionDigitalOutputPin(RaspiPin.GPIO_11, "LED 11 out", PinState.HIGH);
        led11Out.setShutdownOptions(true, PinState.LOW, PinPullResistance.OFF);
        /*led12Out = gpio.provisionDigitalOutputPin(RaspiPin.GPIO_12, "LED 12 out", PinState.HIGH);
        led12Out.setShutdownOptions(true, PinState.LOW, PinPullResistance.OFF);
        led13Out = gpio.provisionDigitalOutputPin(RaspiPin.GPIO_13, "LED 13 out", PinState.HIGH);
        led13Out.setShutdownOptions(true, PinState.LOW, PinPullResistance.OFF);
        led14Out = gpio.provisionDigitalOutputPin(RaspiPin.GPIO_14, "LED 14 out", PinState.HIGH);
        led14Out.setShutdownOptions(true, PinState.LOW, PinPullResistance.OFF);*/
        led15Out = gpio.provisionDigitalOutputPin(RaspiPin.GPIO_15, "LED 15 out", PinState.HIGH);
        led15Out.setShutdownOptions(true, PinState.LOW, PinPullResistance.OFF);
        led16Out = gpio.provisionDigitalOutputPin(RaspiPin.GPIO_16, "LED 16 out", PinState.HIGH);
        led16Out.setShutdownOptions(true, PinState.LOW, PinPullResistance.OFF);
        led17Out = gpio.provisionDigitalOutputPin(RaspiPin.GPIO_17, "LED 17 out", PinState.HIGH);
        led17Out.setShutdownOptions(true, PinState.LOW, PinPullResistance.OFF);
        led18Out = gpio.provisionDigitalOutputPin(RaspiPin.GPIO_18, "LED 18 out", PinState.HIGH);
        led18Out.setShutdownOptions(true, PinState.LOW, PinPullResistance.OFF);
        led19Out = gpio.provisionDigitalOutputPin(RaspiPin.GPIO_19, "LED 19 out", PinState.HIGH);
        led19Out.setShutdownOptions(true, PinState.LOW, PinPullResistance.OFF);
        led20Out = gpio.provisionDigitalOutputPin(RaspiPin.GPIO_20, "LED 20 out", PinState.HIGH);
        led20Out.setShutdownOptions(true, PinState.LOW, PinPullResistance.OFF);
        led21Out = gpio.provisionDigitalOutputPin(RaspiPin.GPIO_21, "LED 21 out", PinState.HIGH);
        led21Out.setShutdownOptions(true, PinState.LOW, PinPullResistance.OFF);
        led22Out = gpio.provisionDigitalOutputPin(RaspiPin.GPIO_22, "LED 22 out", PinState.HIGH);
        led22Out.setShutdownOptions(true, PinState.LOW, PinPullResistance.OFF);
        led23Out = gpio.provisionDigitalOutputPin(RaspiPin.GPIO_23, "LED 23 out", PinState.HIGH);
        led23Out.setShutdownOptions(true, PinState.LOW, PinPullResistance.OFF);
        led24Out = gpio.provisionDigitalOutputPin(RaspiPin.GPIO_24, "LED 24 out", PinState.HIGH);
        led24Out.setShutdownOptions(true, PinState.LOW, PinPullResistance.OFF);
        led25Out = gpio.provisionDigitalOutputPin(RaspiPin.GPIO_25, "LED 25 out", PinState.HIGH);
        led25Out.setShutdownOptions(true, PinState.LOW, PinPullResistance.OFF);
        led26Out = gpio.provisionDigitalOutputPin(RaspiPin.GPIO_26, "LED 26 out", PinState.HIGH);
        led26Out.setShutdownOptions(true, PinState.LOW, PinPullResistance.OFF);
        led27Out = gpio.provisionDigitalOutputPin(RaspiPin.GPIO_27, "LED 27 out", PinState.HIGH);
        led27Out.setShutdownOptions(true, PinState.LOW, PinPullResistance.OFF);

        /*led00In = gpio.provisionDigitalInputPin(RaspiPin.GPIO_00, "GPIO_00_In", PinPullResistance.PULL_DOWN);
        led01In = gpio.provisionDigitalInputPin(RaspiPin.GPIO_01, "GPIO_01_In", PinPullResistance.PULL_DOWN);
        led02In = gpio.provisionDigitalInputPin(RaspiPin.GPIO_02, "GPIO_02_In", PinPullResistance.PULL_DOWN);
        led03In = gpio.provisionDigitalInputPin(RaspiPin.GPIO_03, "GPIO_03_In", PinPullResistance.PULL_DOWN);
        led04In = gpio.provisionDigitalInputPin(RaspiPin.GPIO_04, "GPIO_04_In", PinPullResistance.PULL_DOWN);
        led05In = gpio.provisionDigitalInputPin(RaspiPin.GPIO_05, "GPIO_05_In", PinPullResistance.PULL_DOWN);
        led06In = gpio.provisionDigitalInputPin(RaspiPin.GPIO_06, "GPIO_06_In", PinPullResistance.PULL_DOWN);
        led07In = gpio.provisionDigitalInputPin(RaspiPin.GPIO_07, "GPIO_07_In", PinPullResistance.PULL_DOWN);
        led08In = gpio.provisionDigitalInputPin(RaspiPin.GPIO_08, "GPIO_08_In", PinPullResistance.PULL_DOWN);
        led09In = gpio.provisionDigitalInputPin(RaspiPin.GPIO_09, "GPIO_09_In", PinPullResistance.PULL_DOWN);
        led10In = gpio.provisionDigitalInputPin(RaspiPin.GPIO_10, "GPIO_10_In", PinPullResistance.PULL_DOWN);
        led11In = gpio.provisionDigitalInputPin(RaspiPin.GPIO_11, "GPIO_11_In", PinPullResistance.PULL_DOWN);
        led12In = gpio.provisionDigitalInputPin(RaspiPin.GPIO_12, "GPIO_12_In", PinPullResistance.PULL_DOWN);
        led13In = gpio.provisionDigitalInputPin(RaspiPin.GPIO_13, "GPIO_13_In", PinPullResistance.PULL_DOWN);
        led14In = gpio.provisionDigitalInputPin(RaspiPin.GPIO_14, "GPIO_14_In", PinPullResistance.PULL_DOWN);
        led15In = gpio.provisionDigitalInputPin(RaspiPin.GPIO_15, "GPIO_15_In", PinPullResistance.PULL_DOWN);
        led16In = gpio.provisionDigitalInputPin(RaspiPin.GPIO_16, "GPIO_16_In", PinPullResistance.PULL_DOWN);
        led17In = gpio.provisionDigitalInputPin(RaspiPin.GPIO_17, "GPIO_17_In", PinPullResistance.PULL_DOWN);
        led18In = gpio.provisionDigitalInputPin(RaspiPin.GPIO_18, "GPIO_18_In", PinPullResistance.PULL_DOWN);
        led19In = gpio.provisionDigitalInputPin(RaspiPin.GPIO_19, "GPIO_19_In", PinPullResistance.PULL_DOWN);
        led20In = gpio.provisionDigitalInputPin(RaspiPin.GPIO_20, "GPIO_20_In", PinPullResistance.PULL_DOWN);
        led21In = gpio.provisionDigitalInputPin(RaspiPin.GPIO_21, "GPIO_21_In", PinPullResistance.PULL_DOWN);
        led22In = gpio.provisionDigitalInputPin(RaspiPin.GPIO_22, "GPIO_22_In", PinPullResistance.PULL_DOWN);
        led23In = gpio.provisionDigitalInputPin(RaspiPin.GPIO_23, "GPIO_23_In", PinPullResistance.PULL_DOWN);
        led24In = gpio.provisionDigitalInputPin(RaspiPin.GPIO_24, "GPIO_24_In", PinPullResistance.PULL_DOWN);
        led25In = gpio.provisionDigitalInputPin(RaspiPin.GPIO_25, "GPIO_25_In", PinPullResistance.PULL_DOWN);
        led26In = gpio.provisionDigitalInputPin(RaspiPin.GPIO_26, "GPIO_26_In", PinPullResistance.PULL_DOWN);
        led27In = gpio.provisionDigitalInputPin(RaspiPin.GPIO_27, "GPIO_27_In", PinPullResistance.PULL_DOWN);*/
    }
    private static MyLed myled = null;
    public static MyLed getInstance(){
        if(myled == null)
            myled = new MyLed();
        return myled;
    }

    public void destroy(){
        GpioFactory.getInstance().shutdown();
    }
}
