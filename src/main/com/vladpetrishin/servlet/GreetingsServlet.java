package main.com.vladpetrishin.servlet;

import main.com.vladpetrishin.service.MessageService;
import main.com.vladpetrishin.service.impl.MessageServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Created by Влад on 8/27/2016.
 */
@WebServlet(name = "AnnotatedServlet", urlPatterns = "/greetings")
public class GreetingsServlet extends HttpServlet {

    private MessageService messageService = new MessageServiceImpl();

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        PrintWriter writer = response.getWriter();

        String nickname = request.getParameter("nickname");
        nickname = nickname!=null && !nickname.trim().isEmpty() ? nickname : "Anonymous";

        String greetings = messageService.getGreetings(nickname);
        String htmlGreeting = String.format("<h2> %s </h2>",greetings);


        writer.append(htmlGreeting);
    }

}
