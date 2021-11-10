package Servlet;

import com.Serivce.CheckService;
import com.Serivce.Impl.CheckServiceImpl;
import domain.Comit;
import org.apache.commons.beanutils.BeanUtils;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.util.Map;

@WebServlet("/CheckServlet/*")
public class CheckServlet extends BaseServlet {

    public void OK(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        Map<String, String[]> map = request.getParameterMap();
        Comit comitDo = new Comit();
        try {
            BeanUtils.populate(comitDo,map);
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        }

        CheckService serivce  =  new CheckServiceImpl();

        Boolean flag = serivce.OK(comitDo);

        response.sendRedirect("/comit.html");
    }

    public void NO(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        Map<String, String[]> map = request.getParameterMap();
        Comit comitDo = new Comit();
        try {
            BeanUtils.populate(comitDo,map);
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        }

        CheckService serivce  =  new CheckServiceImpl();

        int flag = serivce.NO(comitDo);
        response.sendRedirect("/comit.html");
    }
    }
