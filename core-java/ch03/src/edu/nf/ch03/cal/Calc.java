package edu.nf.ch03.cal;

import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;
import java.util.Scanner;

public abstract class Calc {
    Scanner s=new Scanner(System.in);
    public String num1(){
        System.out.println("请输入第一个数：");
        return s.next();
    }
    public abstract String fu();

    public String num2(){
        System.out.println("请输入第二个数：");
        return s.next();
    }

    public Object result(){
        String str = num1()+fu()+num2();
        System.out.println(str);
        ScriptEngineManager manager = new ScriptEngineManager();
        ScriptEngine engine = manager.getEngineByName("js");
        try {
            return engine.eval(str);
        } catch (ScriptException e) {
            e.printStackTrace();
        }
        return null;
    }

}
