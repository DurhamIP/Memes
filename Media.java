
/**
 * Write a description of class Media here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Media
{
    private boolean isItFunny;
    private String platformOfOrigin;
    private int year;

    /**
     * Constructor for objects of class Media
     */
    public Media(String platform, int yearOfCreation)
    {
        platformOfOrigin = platform;
        year = yearOfCreation;
        isItFunny = false;
    }

    public boolean isItFunny(){
        return isItFunny;
    }

    public void itIsFunny(){
        isItFunny = true;
    }

    public void itIsNotFunny(){
        isItFunny = false;
    }

    public String getPlatform()
    {
        return platformOfOrigin;
    }

    public void setPlatform(String platform){
        platformOfOrigin = platform;
    }

    public int getYear(){
        return year;
    }

    public void setYear(int year){
        this.year = year;
    }
    
    public String toString(){
        return year + ": from " + platformOfOrigin; 
    }

}
