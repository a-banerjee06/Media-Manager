public class Music extends Media implements IAudioStandard
{
    protected String audioCodec;

    public Music(String fileName, String audioCodec)
    {
        super(fileName);
        this.audioCodec = audioCodec;
    }

    @Override
    public String getAudioCodec()
    {
        return "Audio codec: " + audioCodec;
    }
    @Override
    public String getMediaInfo()
    {
        return "Music id: " + getId() +"\nMusic name: " + getFileName() + "\n" + getAudioCodec();
    }
}
