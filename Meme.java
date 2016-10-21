
public class Meme
{
    private boolean isItFunny;
    private String platformOfOrigin;
    private int year;
    
    public Meme(String platform, int yearOfCreation)
    {
        isItFunny = false;
        platformOfOrigin = platform;
        year = yearOfCreation;
    }
    
    
    public String getPlatform()
    {
        return platformOfOrigin;
    }
}
