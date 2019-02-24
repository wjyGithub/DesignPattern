package prototype;

/**
 * @author jianyuan.wei@hand-china.com
 * @date 2019/2/13 17:07
 */
public class Test {

    public static void main(String[] args) throws CloneNotSupportedException {
        Mail mail = new Mail();
        mail.setContent("初始化模板");

        //原型模式是在内存中进行二进制流的拷贝，相对于new一个对象，性能上会提高很多
        for(int i=0; i<10; i++) {
            Mail mailTemp = (Mail) mail.clone();
            mailTemp.setName("姓名" + i);
            mailTemp.setEmailAddress("姓名"+i +"@imooc.com");
            mailTemp.setContent("恭喜您,此次慕课网活动中奖了");
            MailUtil.sendMail(mailTemp);
        }


        Mail cloneMail = (Mail) mail.clone();
        Mail backupMail = (Mail) mail.clone();
        String s = new String("hello");
        cloneMail.setContent(s);

        System.out.println(cloneMail);
        System.out.println(backupMail);

        MailUtil.saveOriginMailRecord(mail);
    }
}
