import java.io.*;
public class FileOps2 {

	public static void main(String[] args)throws IOException
	{
		String path1="D:\\FileProgs\\input.txt";
		String path2="D:\\FileProgs\\output.txt";
		FileReader fr= new FileReader(path1);
		int temp;
		FileWriter fw= new FileWriter(path2);
		while((temp=fr.read())!=-1) {
			fw.write(temp);
			
		}
           fw.flush();
           fr.close();
	}

}
