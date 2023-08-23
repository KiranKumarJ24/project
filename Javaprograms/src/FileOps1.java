import java.io.*;
public class FileOps1 {

	public static void main(String[] args) throws IOException
	{
		String path1="D:\\FileProgs\\input.txt";
		String path2="D:\\FileProgs\\output.txt";
		FileInputStream fis= new FileInputStream(path1);
		int temp;
		FileOutputStream fos= new FileOutputStream(path2);
		while((temp=fis.read())!=-1) {
			fos.write(temp);
		
		}
		fos.close();
		fis.close();

	}

}
