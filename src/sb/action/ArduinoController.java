package sb.action;

import util.CronScheduler;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by tuananh on 9/23/15.
 */
public class ArduinoController extends HttpServlet {
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("application/json;charset=UTF-8");
        if("status".equals(req.getParameter("a"))){ //action = status
            if("7".equals(req.getParameter("p"))){ //pin
                resp.getWriter().print("{\"status\": " + Constant.ARDUINO_PIN7 + "}");
            }else if("6".equals(req.getParameter("p"))){

            }

            return;
        }

        String command = "/home/pi/sendMsgArdunio.sh";
        if("8".equals(req.getParameter("a"))){
            command = "/home/pi/sendMsgArdunio8.sh";
        }else if("7".equals(req.getParameter("a"))){
            command = "/home/pi/sendMsgArdunio7.sh";
            if (Constant.ARDUINO_PIN7 == Constant.Status.ON) {
                Constant.ARDUINO_PIN7 = Constant.Status.OFF;
            } else {
                Constant.ARDUINO_PIN7 = Constant.Status.ON;
                if(req.getParameter("t") != null){
                    new CronScheduler().switchoffFan(Integer.valueOf(req.getParameter("t")));
                }
            }
        }else if("6".equals(req.getParameter("a"))){
            command = "/home/pi/sendMsgArdunio6.sh";
        }else if("5".equals(req.getParameter("a"))){
            command = "/home/pi/sendMsgArdunio5.sh";
        }else if("4".equals(req.getParameter("a"))){
            command = "/home/pi/sendMsgArdunio4.sh";
        }else if("3".equals(req.getParameter("a"))){
            command = "/home/pi/sendMsgArdunio3.sh";
        }else if("2".equals(req.getParameter("a"))){
            command = "/home/pi/sendMsgArdunio2.sh";
        }else if("1".equals(req.getParameter("a"))){
            command = "/home/pi/sendMsgArdunio1.sh";
        }

        ProcessBuilder pb = new ProcessBuilder(command);
        Process p = pb.start();
        BufferedReader reader = new BufferedReader(new InputStreamReader(p.getInputStream()));
        String line;
        int done = 0;
        while ((line = reader.readLine()) != null)
        {
            if(line.contains("resolve")) done = 1;
        }
        resp.getWriter().print("{\"status\": " + done + "}");
    }

    public void turnOffFan() {
        if (Constant.ARDUINO_PIN7 == Constant.Status.ON) {
            ProcessBuilder pb = new ProcessBuilder("/home/pi/sendMsgArdunio7.sh");
            try {
                pb.start();
            } catch (IOException e) {
                e.getMessage();
            }
            Constant.ARDUINO_PIN7 = Constant.Status.OFF;
        }
    }
}
