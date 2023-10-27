package interviewProblems;

public class SingletonClassEg {

    static SingletonClassEg singletonClassObj;

    private SingletonClassEg() {}

    public static SingletonClassEg getInstance() {
        if (singletonClassObj == null){
            singletonClassObj = new SingletonClassEg();
        }
        return singletonClassObj;
    }

}
