package observer;

import java.util.Observable;

/**
 * 被观察者
 * @author jianyuan.wei@hand-china.com
 * @date 2019/2/13 21:58
 */
public class Course extends Observable {

    private String courseName;

    public Course(String courseName) {
        this.courseName = courseName;
    }

    public String getCourseName() {
        return courseName;
    }

    public void produceQuestion(Course course,Question question){
        System.out.println();
    }


}
