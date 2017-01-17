
public class Meme
{
    private boolean isItFunny;
    private String platformOfOrigin;
    private String text;
    private int year;
    
    public Meme(String text, String platform, int yearOfCreation)
    {
	this.text = text;
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

    public String getText(){
	return text;
    }

    public void setText(String text){
	this.text = text;
    }
}
