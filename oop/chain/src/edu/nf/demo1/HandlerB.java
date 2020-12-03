package edu.nf.demo1;

/**
 * @author 天文学
 * 财务主管，审批限额为5000元
 */
public class HandlerB extends AbstractHandler{
    @Override
    public void execute(int money) {
        if (money<=5000){
            System.out.println("财务审批通过");
        }else {
            if(getHandler()!=null){
                getHandler().execute(money);
            }
        }
    }
}
