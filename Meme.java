
public class Meme extends Media
{

    private String text;

    public Meme(String text, String platform, int yearOfCreation)
    {
        super(platform, yearOfCreation);
        this.text = text;

    }


    public String getText(){
        return text;
    }

    public String thumbnail(){
        return text;
    }
    
    public void setText(String text){
        this.text = text;
    }
    
    @Override
    public String toString(){
        return super.toString() + text;
    }
}
