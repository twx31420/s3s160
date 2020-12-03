package edu.nf.demo2;

@WebFilter(1)
public class FilterA implements Filter {
    @Override
    public void doFilter(HttpServletRequest req, HttpServletResponse resp, FilterChain chain) {
        System.out.println("filterA 处理请求");
        //FilterChain放行，req和resp转到下一个过滤器
        chain.doExecute(req,resp);
    }
}
