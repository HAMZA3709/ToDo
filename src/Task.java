public class Task {
    protected String title;
    private boolean isCompleted;
    private int progress;

    public Task(String title) {

        this.isCompleted = false;
        this.title = title;
        this.progress = 0;
    }

    public String getTitle() {
        return title;
    }

    public boolean isCompleted() {
        return isCompleted;
    }

    public int getProgress() {
        return progress;
    }
    public void markComplete(){
        isCompleted=true;
        progress=100;
    }
    public void updateProgress(int progress){
        if(progress<0){
            this.progress=0;
        } else if(progress>100){
            this.progress=100;
        } else {
            this.progress=progress;
        }
    }
    public  void display(){
        String status =isCompleted?"Completed":"Not Completed";
        System.out.println("Task : "+title+ "| Status " +status +"| Progress: " + "%");
    }
}
