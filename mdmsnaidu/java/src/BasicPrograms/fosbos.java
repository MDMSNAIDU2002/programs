package BasicPrograms;
import java.io.*;
import java.util.Scanner;

public class fosbos{
    public static void main(String[] args) {
        File f = new File("./n.txt");  

        try {
             
//            if (f.exists()) {
//                f.delete();
//            }
//            f.createNewFile();

            FileOutputStream fos = new FileOutputStream(f);
            BufferedOutputStream bos = new BufferedOutputStream(fos);
            Scanner sc = new Scanner(System.in);

            System.out.println("Enter data into the file:");
            String w = sc.nextLine();

            
            bos.write(w.getBytes());
            bos.flush(); 
            System.out.println("Data has been entered successfully.");

            
            bos.close();
            sc.close(); 

        } catch (IOException e) {
            e.printStackTrace(); 
        }
    }
}
