import org.eclipse.jetty.server.Server;
import org.eclipse.jetty.servlet.ServletContextHandler;
import org.eclipse.jetty.servlet.ServletHolder;
import servlets.HelloServlet;
import servlets.IndexServlet;

public class WebApp {
    public static void main(String[] args) throws Exception {
        Server server = new Server(9091);
        HelloServlet helloServlet = new HelloServlet();
        IndexServlet indexServlet=new IndexServlet();
        ServletContextHandler handler = new ServletContextHandler();
        handler.addServlet(new ServletHolder(helloServlet),"/*");
        handler.addServlet(new ServletHolder(indexServlet),"/index*");
        server.setHandler(handler);
        server.join();
        server.start();
    }
}
