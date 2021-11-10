package Servlet;


import com.Serivce.FindAllSerivce;
import com.Serivce.Impl.FindAllSerivceImpl;
import domain.BlockList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet("/dogblackuser/*")
public class dogblackuserServlet extends BaseServlet {
private FindAllSerivce serivce = new FindAllSerivceImpl();
    public void FindAll(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        List<BlockList> cs = serivce.DogFinfAll();
        writeValue(cs,response);
    }
}
