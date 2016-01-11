package sb.action;

import jodd.props.PropsUtil;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.*;
import java.util.Properties;

/**
 * Created by tuananh on 1/11/16.
 */
public class Config extends HttpServlet {
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        if("r".equals(req.getParameter("a"))){ //read
            Properties prop = new Properties();
            InputStream input = null;

            try {

                input = new FileInputStream(new File(Config.class.getClassLoader().getResource("/config.properties").toURI()));

                // load a properties file
                prop.load(input);

                int n = Integer.valueOf(prop.getProperty("buttons"));
                StringBuilder sb = new StringBuilder("{buttons: ").append(n).append(", labels: [");
                for(int i = 1; i <= n; ++i){
                    sb.append("\"").append(prop.getProperty("btn" + i)).append("\",");
                }
                sb.deleteCharAt(sb.length() - 1);
                sb.append("]}");
                resp.setContentType("application/json;charset=UTF-8");
                resp.getWriter().print(sb.toString());
            } catch (Exception ex) {
                ex.printStackTrace();
            } finally {
                if (input != null) {
                    try {
                        input.close();

                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
            }
            return;
        }else if("w".equals(req.getParameter("a"))){//write
            Properties prop = new Properties();
            OutputStream output = null;
            InputStream input = null;
            try {
                input = new FileInputStream(new File(Config.class.getClassLoader().getResource("/config.properties").toURI()));
                prop.load(input);

            } catch (Exception ex) {
                ex.printStackTrace();
            } finally {
                if (input != null) {
                    try {
                        input.close();
                        try {

                            output = new FileOutputStream(new File(Config.class.getClassLoader().getResource("/config.properties").toURI()));
                            // set the properties value
                            prop.setProperty("btn"+req.getParameter("btn"), req.getParameter("lb"));
                            // save properties to project root folder
                            prop.store(output, null);

                        } catch (Exception io) {
                            io.printStackTrace();
                        } finally {
                            if (output != null) {
                                try {
                                    output.close();
                                } catch (IOException e) {
                                    e.printStackTrace();
                                }
                            }

                        }
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
            }

        }
        resp.setContentType("application/json;charset=UTF-8");
        resp.getWriter().print("{}");
    }
}
