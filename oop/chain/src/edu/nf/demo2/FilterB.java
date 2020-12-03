package edu.nf.demo2;

@WebFilter(2)
public class FilterB implements Filter {
    @Override
    public void doFilter(HttpServletRequest req, HttpServletResponse resp, FilterChain chain) {
        System.out.println("filterB处理请求。。。");
        chain.doExecute(req,resp);
    }
}
