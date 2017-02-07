import java.util.ArrayList;

public class MemeLibrary
{
    // instance variables - replace the example below with your own
    private ArrayList<Media> memes;

    /**
     * Constructor for objects of class MemeLibrary
     */
    public MemeLibrary()
    {
        memes = new ArrayList<Media>();
    }

    /**
     * An example of a method - replace this comment with your own
     * 
     * @param  y   a sample parameter for a method
     * @return     the sum of x and y 
     */
    public void addMedia(Media m){
        memes.add(m);
    }
    
    public static void main(String[] args){
        Meme m = new Meme(args[0], args[1], 2017);
        MemeLibrary ml = new MemeLibrary();
        ml.addMedia(m);
        System.out.println(ml);
    }
    
    public String toString(){
        return memes.toString();
    }
}
