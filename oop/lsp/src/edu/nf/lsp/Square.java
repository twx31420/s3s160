package edu.nf.lsp;

/**
 * @author 天文学
 */
public class Square extends Rectangle{
//    @Override
//    public void setWidth(int width) {
//        this.width=width;
//        this.height=width;
//    }
//
//    @Override
//    public void setHeight(int height) {
//        this.height=height;
//        this.width=height;
//    }

    /**
     * 遵循里氏替换原则 ，不应覆盖父类默认的行为
     * 但可以在子类可以扩展父类的功能。
     * @param side
     */
    public void setSide(int side){
        this.width=side;
        this.height=side;
    }

}
