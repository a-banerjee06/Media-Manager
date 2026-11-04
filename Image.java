public class Image  extends Media implements IImageStandard
{
    protected String imageCodec;
    public Image(String fileName, String imageCodec)
    {
        super(fileName);
        this.imageCodec = imageCodec;
    }

    @Override
    public String getImageCodec()
    {
        return "Image codec: " + imageCodec;
    }

    @Override
    public String getMediaInfo()
    {
       return "Image id: " + getId() +"\nImage name: " + getFileName() + "\n" + getImageCodec();
    }
}
