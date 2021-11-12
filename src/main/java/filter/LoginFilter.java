package filter;

import javax.servlet.*;
import javax.servlet.annotation.*;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;

@WebFilter("/comit.html")
public class LoginFilter implements Filter {
    public void init(FilterConfig config) throws ServletException {
    }

    public void destroy() {
    }

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws ServletException, IOException {
        HttpServletRequest request1 = (HttpServletRequest) request;
        String uri = request1.getRequestURI();
        if (uri.contains("/Login.html") || uri.contains("/LoginSerlet")) {
            chain.doFilter(request1, response);

        }else {
            Object user = request1.getSession().getAttribute("user");
            if (user!=null){
                chain.doFilter(request1, response);

            }else{
                request1.setAttribute("login_msg","尚未登入");
                request1.getRequestDispatcher("Login.html").forward(request1,response);
            }

        }
    }
}
