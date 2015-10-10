package sb.action;

import com.pi4j.io.gpio.*;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Created by tuananh on 8/1/15.
 */
public class ToggleStateController extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        if (req.getParameter("pin") != null) {
            resp.setContentType("application/json;charset=UTF-8");
            int n = Integer.valueOf(req.getParameter("pin"));
            if (n == 0) {
                MyLed.getInstance().led00Out.toggle();
            }else if (n == 1) {
                MyLed.getInstance().led01Out.toggle();
            }else if (n == 2) {
                MyLed.getInstance().led02Out.toggle();
            }else if (n == 3) {
                MyLed.getInstance().led03Out.toggle();
            }else if (n == 4) {
                MyLed.getInstance().led04Out.toggle();
            }else if (n == 5) {
                MyLed.getInstance().led05Out.toggle();
            }else if (n == 6) {
                MyLed.getInstance().led06Out.toggle();
            }else if (n == 7) {
                MyLed.getInstance().led07Out.toggle();
            }else if (n == 8) {
                MyLed.getInstance().led08Out.toggle();
            }else if (n == 9) {
                MyLed.getInstance().led09Out.toggle();
            }else if (n == 10) {
                MyLed.getInstance().led10Out.toggle();
            }else if (n == 11) {
                MyLed.getInstance().led11Out.toggle();
            }else if (n == 12) {
                MyLed.getInstance().led12Out.toggle();
            }else if (n == 13) {
                MyLed.getInstance().led13Out.toggle();
            }else if (n == 14) {
                MyLed.getInstance().led14Out.toggle();
            }else if (n == 15) {
                MyLed.getInstance().led15Out.toggle();
            }else if (n == 16) {
                MyLed.getInstance().led16Out.toggle();
            }else if (n == 17) {
                MyLed.getInstance().led17Out.toggle();
            }else if (n == 18) {
                MyLed.getInstance().led18Out.toggle();
            }else if (n == 19) {
                MyLed.getInstance().led19Out.toggle();
            }else if (n == 20) {
                MyLed.getInstance().led20Out.toggle();
            }else if (n == 21) {
                MyLed.getInstance().led21Out.toggle();
            }else if (n == 22) {
                MyLed.getInstance().led22Out.toggle();
            }else if (n == 23) {
                MyLed.getInstance().led23Out.toggle();
            }else if (n == 24) {
                MyLed.getInstance().led24Out.toggle();
            }else if (n == 25) {
                MyLed.getInstance().led25Out.toggle();
            }else if (n == 27) {
                MyLed.getInstance().led26Out.toggle();
            }else {
                resp.getWriter().print("{\"s\":\"1\", \"msg\":\"No pin\"}");
                return;
            }
            resp.getWriter().print("{\"s\":\"0\", \"msg\":\"Look good\"}");
        } else {
            resp.setStatus(200);
            resp.getWriter().print("Nhap so pin");
        }
    }
}
