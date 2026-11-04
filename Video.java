public class Video extends Media implements IImageStandard, IAudioStandard
{
    protected String imageCodec, audioCodec;

    public Video(String fileName, String imageCodec, String audioCodec)
    {
        super(fileName);
        this.imageCodec = imageCodec;
        this.audioCodec = audioCodec;
    }

    @Override
    public String getImageCodec()
    {
        return "Image codec: " + imageCodec;
    }

    @Override
    public String getAudioCodec()
    {
        return "Audio codec: " + audioCodec;
    }
    public String getMediaInfo()
    {
        return "Music id: " + getId() +"\nMusic name: " + getFileName() + "\n" + getImageCodec() +
                "\n" + getAudioCodec();
    }
}
