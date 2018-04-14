package builder;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class HTMLBuilder extends Builder {
    private String filename;
    private PrintWriter writer;
    @Override
    public void makeTitle(String title) {
        filename = title + ".html";
        try {
            writer = new PrintWriter(new FileWriter(filename));
        } catch (IOException e) {
            e.printStackTrace();
        }
        writer.println("<html><head><title>"+title+"</head></title><body>");
        writer.println("<h1>"+title+"</h1>");
    }

    @Override
    public void makeString(String string) {
        writer.println("<p>"+string+"</p>");
    }

    @Override
    public void makeItem(String[] item) {
        writer.println("<ul>");
        for (String s:item
             ) {
            writer.println("<li>"+s+"</li>");
        }
        writer.println("</ul>");
    }

    @Override
    public void close() {
        writer.println("</body></html>");
        writer.close();
    }

    public String getRes() {
        return filename;
    }
}
