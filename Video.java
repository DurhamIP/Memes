public class Video extends Media
{
    private int runningTime;
    
    public Video(int runningTime, String platform, int yearOfCreation)
    {
        super(platform, yearOfCreation);
	this.runningTime = runningTime;

    }

    public int getRunningTime(){
	return runningTime;
    }

    public void setRunningTime(int runningTime){
	this.runningTime = runningTime;
    }
}
