public class BadYearException extends Exception{
    private String msg;

    public BadYearException(String msg){
	this.msg = msg;
    }

    @Override
    public String toString(){
	return msg;
    }
}
