package sb.action;

import com.pi4j.io.gpio.*;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Created by spiritbomb on 7/15/2015.
 */
public class CheckState extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        if (req.getParameter("pin") != null) {
            int n = Integer.valueOf(req.getParameter("pin"));
            StringBuilder sb = new StringBuilder("{\"pin\":");
            final MyLed myLed = MyLed.getInstance();
            if (n == 0) {
                sb.append("\"").append(myLed.led00Out.getPin()).append("\",\"state\":\"").append(myLed.led00Out.getState()).append("\"}");
            }else if(n == 1) {
                sb.append("\"").append(myLed.led01Out.getPin()).append("\",\"state\":\"").append(myLed.led01Out.getState()).append("\"}");
            }else if (n == 2) {
                sb.append("\"").append(myLed.led02Out.getPin()).append("\",\"state\":\"").append(myLed.led02Out.getState()).append("\"}");
            }else if (n == 3) {
                sb.append("\"").append(myLed.led03Out.getPin()).append("\",\"state\":\"").append(myLed.led03Out.getState()).append("\"}");
            }else if (n == 4) {
                sb.append("\"").append(myLed.led04Out.getPin()).append("\",\"state\":\"").append(myLed.led04Out.getState()).append("\"}");
            }else if (n == 5) {
                sb.append("\"").append(myLed.led05Out.getPin()).append("\",\"state\":\"").append(myLed.led05Out.getState()).append("\"}");
            }else if (n == 6) {
                sb.append("\"").append(myLed.led06Out.getPin()).append("\",\"state\":\"").append(myLed.led06Out.getState()).append("\"}");
            }else if (n == 7) {
                sb.append("\"").append(myLed.led07Out.getPin()).append("\",\"state\":\"").append(myLed.led07Out.getState()).append("\"}");
            }else if (n == 8) {
                sb.append("\"").append(myLed.led08Out.getPin()).append("\",\"state\":\"").append(myLed.led08Out.getState()).append("\"}");
            }else if (n == 9) {
                sb.append("\"").append(myLed.led09Out.getPin()).append("\",\"state\":\"").append(myLed.led09Out.getState()).append("\"}");
            }else if (n == 10) {
                sb.append("\"").append(myLed.led10Out.getPin()).append("\",\"state\":\"").append(myLed.led10Out.getState()).append("\"}");
            }else if (n == 11) {
                sb.append("\"").append(myLed.led11Out.getPin()).append("\",\"state\":\"").append(myLed.led11Out.getState()).append("\"}");
            }else if (n == 12) {
                sb.append("\"").append(myLed.led12Out.getPin()).append("\",\"state\":\"").append(myLed.led12Out.getState()).append("\"}");
            }else if (n == 13) {
                sb.append("\"").append(myLed.led13Out.getPin()).append("\",\"state\":\"").append(myLed.led13Out.getState()).append("\"}");
            }else if (n == 14) {
                sb.append("\"").append(myLed.led14Out.getPin()).append("\",\"state\":\"").append(myLed.led14Out.getState()).append("\"}");
            }else if (n == 15) {
                sb.append("\"").append(myLed.led15Out.getPin()).append("\",\"state\":\"").append(myLed.led15Out.getState()).append("\"}");
            }else if (n == 16) {
                sb.append("\"").append(myLed.led16Out.getPin()).append("\",\"state\":\"").append(myLed.led16Out.getState()).append("\"}");
            }else if (n == 17) {
                sb.append("\"").append(myLed.led17Out.getPin()).append("\",\"state\":\"").append(myLed.led17Out.getState()).append("\"}");
            }else if (n == 18) {
                sb.append("\"").append(myLed.led18Out.getPin()).append("\",\"state\":\"").append(myLed.led18Out.getState()).append("\"}");
            }else if (n == 19) {
                sb.append("\"").append(myLed.led19Out.getPin()).append("\",\"state\":\"").append(myLed.led19Out.getState()).append("\"}");
            }else if (n == 20) {
                sb.append("\"").append(myLed.led20Out.getPin()).append("\",\"state\":\"").append(myLed.led20Out.getState()).append("\"}");
            }else if (n == 21) {
                sb.append("\"").append(myLed.led21Out.getPin()).append("\",\"state\":\"").append(myLed.led21Out.getState()).append("\"}");
            }else if (n == 22) {
                sb.append("\"").append(myLed.led22Out.getPin()).append("\",\"state\":\"").append(myLed.led22Out.getState()).append("\"}");
            }else if (n == 23) {
                sb.append("\"").append(myLed.led23Out.getPin()).append("\",\"state\":\"").append(myLed.led23Out.getState()).append("\"}");
            }else if (n == 24) {
                sb.append("\"").append(myLed.led24Out.getPin()).append("\",\"state\":\"").append(myLed.led24Out.getState()).append("\"}");
            }else if (n == 25) {
                sb.append("\"").append(myLed.led25Out.getPin()).append("\",\"state\":\"").append(myLed.led25Out.getState()).append("\"}");
            }else if (n == 26) {
                sb.append("\"").append(myLed.led26Out.getPin()).append("\",\"state\":\"").append(myLed.led26Out.getState()).append("\"}");
            }else if (n == 27) {
                sb.append("\"").append(myLed.led27Out.getPin()).append("\",\"state\":\"").append(myLed.led27Out.getState()).append("\"}");
            }else {
                resp.getWriter().print("No pin");
                return;
            }
            resp.setContentType("application/json;charset=UTF-8");
            resp.getWriter().print(sb.toString());
        }
    }
}
