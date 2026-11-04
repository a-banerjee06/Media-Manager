public abstract class Media
{
    protected int id;
    protected String fileName;
    public static int nextID;

    public Media(String fileName)
    {
        this.fileName = fileName;
        id = ++nextID;
    }

    public int getId() {
        return id;
    }

    public String getFileName() {
        return fileName;
    }
}
