
package threads;


public class FetchError
{
    private String error;
    private String url;

    public FetchError(String error, String url)
    {
        this.error = error;
        this.url = url;
    }

    public String getError()
    {
        return error;
    }

    public void setError(String error)
    {
        this.error = error;
    }

    public String getUrl()
    {
        return url;
    }

    public void setUrl(String url)
    {
        this.url = url;
    }
    
    
}
