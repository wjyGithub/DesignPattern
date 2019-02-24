package prototype.clone;

import java.util.Date;

/**
 * @author jianyuan.wei@hand-china.com
 * @date 2019/2/13 21:33
 */
public class Test {

    /**
     * 深克隆: 对当前克隆对象的内部引用类型也实现克隆
     * 浅克隆: 对当前克隆对象的内部引用类型不实现克隆,使用相同的一个引用地址
     * @param args
     * @throws CloneNotSupportedException
     */
    public static void main(String[] args) throws CloneNotSupportedException {
        Date birthday = new Date(0L);
        Pig pig1 = new Pig("佩奇",birthday);
        Pig pig2 = (Pig) pig1.clone();

        System.out.println(pig1);
        System.out.println(pig2);

        pig1.getBirthday().setTime(888);

        System.out.println(pig1);
        System.out.println(pig2);

    }
}
