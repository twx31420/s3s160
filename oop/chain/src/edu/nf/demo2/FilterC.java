package edu.nf.demo2;

/**
 * @author 天文学
 */
@WebFilter(3)
public class FilterC implements Filter{
    @Override
    public void doFilter(HttpServletRequest req, HttpServletResponse resp, FilterChain chain) {
        System.out.println("filterC处理请求");
        chain.doExecute(req,resp);
    }
}
