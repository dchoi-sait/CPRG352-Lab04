package servlets;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.*;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import models.Note;

/**
 *
 * @author 775262
 */
public class NoteServlet extends HttpServlet {
    private final String notePath = "/WEB-INF/note.txt";
 

   
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String path = getServletContext().getRealPath(notePath);
        BufferedReader br = new BufferedReader(new FileReader(new File(path)));
        String title = br.readLine();
        String contents = br.readLine();
        br.close();
        System.out.print(title);
        
        
        Note note = new Note(title, contents);
        request.setAttribute("note", note);
        
        String param = request.getParameter("edit");
        if(param == null){
            getServletContext().getRequestDispatcher("/WEB-INF/viewnote.jsp").forward(request, response);
        } else {
            getServletContext().getRequestDispatcher("/WEB-INF/editnote.jsp").forward(request, response);
        }
     
        return;
    }

   
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String title = "";
        String contents = "";
        String path = getServletContext().getRealPath(notePath);
        PrintWriter pw = new PrintWriter(new BufferedWriter(new FileWriter(path, false))); 
        
        title = request.getParameter("n_title");
        contents = request.getParameter("n_contents");
        String text = String.format("%s%n%s", title, contents);
        pw.print(text);
        pw.close();
        
        Note note = new Note(title, contents);
        request.setAttribute("note", note);
        
        getServletContext().getRequestDispatcher("/WEB-INF/viewnote.jsp").forward(request, response);
        return;
    }

  
 
}
