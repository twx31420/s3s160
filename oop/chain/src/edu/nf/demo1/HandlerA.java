package edu.nf.demo1;

/**
 * @author 天文学
 * 直接主管，审批限额为2000元
 */
public class HandlerA extends AbstractHandler {

    @Override
    public void execute(int money) {
        //如果是2000元，直接审批通过，否则交个下一个
        if(money<=2000){
            System.out.println("审批通过");
        }else {
            //获取下一个审批人
            if(getHandler()!=null){
                getHandler().execute(money);
            }
        }
    }
}
