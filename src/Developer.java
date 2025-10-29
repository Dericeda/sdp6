public class Developer {
    IActivity activity;

    public void setActivity(IActivity activity){
        this.activity = activity;
    }

    public void executeActivity(){
        activity.justDoIt();
    }
}
