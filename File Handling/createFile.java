import java.io.*;
public class createFile{
    public static void main(String[] args) {
        File f = new File("C:\\Users\\USER\\Documents\\CODING\\JAVA\\File Handling\\LC.txt");
        try{

            if(f.createNewFile()){
                System.out.println("File Successfully create");
            }
            else{
                System.out.println("File Already Exists...!");
                System.out.println("File Name: " + f.getName());
                System.out.println("File Location: "+ f.getAbsolutePath());
                System.out.println("File Writable: "+f.canWrite());
                System.out.println("File Readable: "+ f.canRead());
                
                System.out.println("File Size: " + f.length());
                System.out.println("File Removed" + f.delete());
            }
        }
        catch(IOException i)
        {
            System.out.println(i);
        }

    }

}