/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package abi05;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Map;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author abi05
 */
@WebServlet(name = "FinishController05", urlPatterns = {"/abi05/FinishController"})
public class FinishController extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
    }

    // <editor-fold defaultstate="expends" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
        
        response.setContentType("text/html;charset=UTF-8");
        request.setCharacterEncoding("UTF-8");     

        
        HttpSession session = request.getSession();
        if(session.getAttribute("answers") != null){
        
        //FileWinter クラスのオブジェクトを生成する
        FileWriter file = new FileWriter("c:\\temp\\ankate.txt",true);
        //PrintWriterクラスのオブジェクトを生成する
        PrintWriter pw = new PrintWriter(new BufferedWriter(file));
        
        //ファイルに書き込む
        Map answers = (Map)session.getAttribute("answers");
        
        //ファイルに書き込む
        pw.print("abi05"); //アンケートの番号
        pw.print("\t");
        pw.print(answers.get("ans1"));
        pw.print("\t");
        pw.print(answers.get("ans2"));
        pw.print("\t");
        pw.print(answers.get("ans3"));        
        pw.println("");
        //ファイルを閉じる
        pw.close();

        }

        session.removeAttribute("answers");
        RequestDispatcher  dispatcher = request.getRequestDispatcher("/WEB-INF/jsp/abi05/FinishView.jsp");//絶対パス
       dispatcher.forward(request,response);  
                   
        
       
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
