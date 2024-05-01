package controller;

import model.Glasses;
import service.GlassesService;
import service.IGlassesService;

import javax.servlet.DispatcherType;
import javax.servlet.RequestDispatcher;
import javax.servlet.Servlet;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet(name = "controllerGlass", urlPatterns = "/listGlasses")
public class GlassesServlet extends HttpServlet {
    private final IGlassesService glassesService = new GlassesService();
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String action = req.getParameter("action");
        if (action!=null && action.equals("create")){
            showformCreate(req,resp);
        }else {
            showallglasses(req, resp);
        }
    }
    public void showformCreate(HttpServletRequest req, HttpServletResponse resp){
        RequestDispatcher formcreate = req.getRequestDispatcher("create.jsp");
        try {
            formcreate.forward(req,resp);
        } catch (ServletException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String action = req.getParameter("action");
        switch (action){
            case "create":
                int id = Integer.parseInt(req.getParameter("ID")) ;
                String code = req.getParameter("CODE");
                int price = Integer.parseInt(req.getParameter("PRICE")) ;
                String decription = req.getParameter("DECRIPTION");
                String color = req.getParameter("COLOR");
                String img = req.getParameter("INMAGE");
                Glasses glasses = new Glasses(id, code, price,color,decription,img);
                glassesService.createGlasses(glasses);
                RequestDispatcher requestDispatcher = req.getRequestDispatcher("create.jsp");
                req.setAttribute("mess", "tao moi thanh cong");
                requestDispatcher.forward(req, resp);
                showallglasses(req,resp);
                break;
            default:
                showallglasses(req,resp);
        }
    }

    private static void showallglasses(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        RequestDispatcher list = req.getRequestDispatcher("/listGlasses.jsp");
        GlassesService glassesService = new GlassesService();
        List<Glasses> list1 = glassesService.findAll();
        req.setAttribute("dsk", list1);
        list.forward(req, resp);
    }
}
