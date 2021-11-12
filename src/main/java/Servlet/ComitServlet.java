package Servlet;

import com.Serivce.ComitSerivce;
import com.Serivce.FindAllSerivce;
import com.Serivce.Impl.ComitSerivceimpl;

import com.Serivce.Impl.FindAllSerivceImpl;
import com.fasterxml.jackson.databind.ObjectMapper;
import domain.Comit;
import domain.ResultInfo;
import org.apache.commons.beanutils.BeanUtils;


import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.util.List;
import java.util.Map;


@WebServlet("/comitServlet/*")
public class ComitServlet extends BaseServlet {



    public void ComitS(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        Map<String, String[]> map = request.getParameterMap();
        Comit comitDo = new Comit();
        try {
            BeanUtils.populate(comitDo,map);
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        }

        ComitSerivce serivce  = new ComitSerivceimpl();

        boolean flag = serivce.Comits(comitDo);
        ResultInfo info = new ResultInfo();

        if(flag){

            info.setFlag(true);
        }else{

            info.setFlag(false);
            info.setErrorMsg("注册失败!");
        }


        ObjectMapper mapper = new ObjectMapper();
        String json = mapper.writeValueAsString(info);


        response.setContentType("application/json;charset=utf-8");
        response.getWriter().write(json);
    }
    public FindAllSerivce serivce = new FindAllSerivceImpl();
    public void FindAll(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        List<Comit> cs = serivce.comitList();
        writeValue(cs,response);
    }
}
