import java.util.ArrayList;
import java.util.Scanner;

public class Assignment4
{
    public static void main(String[] args)
    {
        Scanner myScan = new Scanner(System.in);
        int choice = 0;
        ArrayList<Media> allMedia = new ArrayList<>();
        System.out.println("[Media Manager]");

        do {
            System.out.println("1- Add image\n" + "2- Add music\n" + "3- Add video\n"
            + "4- Show images\n" + "5- Show music\n" + "6- Show videos\n"
            + "7- Show images and videos\n" + "8- Show music and videos\n" + "9- quit");
            System.out.print("Enter option: ");
            choice = myScan.nextInt();

            switch (choice)
            {
                case 1: {
                    myScan.nextLine(); // consume newline HERE
                    System.out.print("\nEnter file name: ");
                    String fileName = myScan.nextLine();
                    System.out.print("Enter image Codec: ");
                    String codec = myScan.nextLine();
                    Image image = new Image(fileName, codec);
                    allMedia.add(image);
                    System.out.println();
                    break;
                }
                case 2: {
                    myScan.nextLine();
                    System.out.print("\nEnter file name: ");
                    String fileName = myScan.nextLine();
                    System.out.print("Enter audio Codec: ");
                    String codec = myScan.nextLine();
                    Music music = new Music(fileName, codec);
                    allMedia.add(music);
                    System.out.println();
                    break;
                }
                case 3: {
                    myScan.nextLine();
                    System.out.print("\nEnter file name: ");
                    String fileName = myScan.nextLine();
                    System.out.print("Enter image codec: ");
                    String imageCodec = myScan.nextLine();
                    System.out.print("Enter audio Codec: ");
                    String audioCodec = myScan.nextLine();
                    Video vid = new Video(fileName, imageCodec, audioCodec);
                    allMedia.add(vid);
                    System.out.println();
                    break;
                }
                case 4:
                {
                    for (Media m : allMedia)
                        if(m instanceof Image)
                            System.out.println("\n"+ ((Image) m).getMediaInfo() +"\n");
                    break;
                }
                case 5:
                {
                    for (Media m : allMedia)
                        if(m instanceof Music)
                            System.out.println("\n"+ ((Music) m).getMediaInfo() +"\n");
                    break;
                }
                case 6:
                {
                    for (Media m : allMedia)
                        if(m instanceof Video)
                            System.out.println("\n" + ((Video) m).getMediaInfo() +"\n");
                    break;
                }
                case 7:
                {
                    for (Media m : allMedia)
                    {
                        if(m instanceof Image)
                            System.out.println("\n"+ ((Image) m).getMediaInfo() +"\n");
                        else if(m instanceof Video)
                            System.out.println("\n" + ((Video) m).getMediaInfo() +"\n");
                    }
                    break;
                }
                case 8:
                {
                    for (Media m : allMedia)
                    {
                        if(m instanceof Music)
                            System.out.println("\n"+ ((Music) m).getMediaInfo() +"\n");
                        else if(m instanceof Video)
                            System.out.println("\n" + ((Video) m).getMediaInfo() +"\n");
                    }
                    break;
                }
            }
        }while (choice != 9);
        System.out.println("\nShutting down...");
    }
}
