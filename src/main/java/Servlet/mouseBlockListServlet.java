package Servlet;


import com.Serivce.FindAllSerivce;
import com.Serivce.Impl.FindAllSerivceImpl;
import domain.BlockList;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.util.List;

@WebServlet("/mouseBlockList/*")
public class mouseBlockListServlet extends BaseServlet {
private FindAllSerivce serivce = new FindAllSerivceImpl();
    public void FindAll(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        List<BlockList> cs = serivce.mouseFindAll();
        writeValue(cs,response);
    }
}
