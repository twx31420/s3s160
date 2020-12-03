package edu.nf.demo2;

import java.util.*;

public class FilterChain {
    /**
     *
     */

    private Iterator<Filter> iterator;


    /**
     * 在构造方法中初始化所有的过滤器，并存放到集合中
     */
    public FilterChain() {
//        List<Filter> filters=new ArrayList<>();
//        Filter filterA=new FilterA();
//        Filter filterB=new FilterB();
//        Filter filterC=new FilterC();
//        filters.add(filterA);
//        filters.add(filterB);
//        filters.add(filterC);
//        Map<Integer,Filter> map=new HashMap<>();
//        ScanUtils.scanPackage().forEach(str ->{
//            try {
//                Class<?> clazz=Class.forName(str);
//                if(clazz.isAnnotationPresent(WebFilter.class)){
//                    int value=clazz.getAnnotation(WebFilter.class).value();
//                    map.put(value,(Filter)clazz.newInstance());
//                }
//            } catch (Exception e) {
//                e.printStackTrace();
//            }
//        });
//        for (int i=1;i<=map.size();i++){
//            filters.add(map.get(i));
//        }
        List<Filter> list=initFilter();
        sort(list);
        //从集合中获取迭代器
        iterator=list.iterator();
    }

    private List<Filter> initFilter(){
        //扫描所有的类
        Set<String> classesName=ScanUtils.scanPackage();
        List<Filter> filters=new ArrayList<>();
        //循环遍历找出带有@WebFilter注解的类
        classesName.forEach(className->{
            try {
                Class<?>clazz=Class.forName(className);
                if(clazz.isAnnotationPresent(WebFilter1.class)){
                    //将Filter实例化并保存到集合中
                    filters.add((Filter)clazz.newInstance());
                }
            } catch (Exception e) {
                e.printStackTrace();
            }

        });
        return filters;

    }

    /**
     * 排序
     * @param filters
     */
    private void sort(List<Filter> filters){
        Collections.sort(filters,(filter1,filter2)->{
            Integer order1=filter1.getClass().getAnnotation(WebFilter1.class).order();
            Integer order2=filter2.getClass().getAnnotation(WebFilter1.class).order();
            return order1.compareTo(order2);
        });
    }



    /**
     *
     * @param req
     * @param resp
     */
    public void doExecute(HttpServletRequest req,HttpServletResponse resp){
//        先判断是否有下一个过滤器
       if(iterator.hasNext()){
           //取出下一个过滤器
           Filter filter=iterator.next();
           //执行filter的dofilter方法处理请求
           //注意：每一个过滤器都需要用到filterchain这个对象
           //因此，dofilter方法的this就是将当前对象（FilterChain）
           //传递给过滤器
           filter.doFilter(req,resp,this);
       }

    }
}
