import org.eclipse.jetty.server.Server;
import org.eclipse.jetty.servlet.ServletContextHandler;
import org.eclipse.jetty.servlet.ServletHolder;
import org.owasp.validator.html.*;
import servlets.HelloServlet;

public class WebApp {
    public static void main(String[] args) throws Exception {
        Server server = new Server(9091);
        HelloServlet helloServlet = new HelloServlet();
        ServletContextHandler handler = new ServletContextHandler();
        handler.addServlet(new ServletHolder(helloServlet),"/*");
        server.setHandler(handler);
        server.join();
        server.start();
    }
}
