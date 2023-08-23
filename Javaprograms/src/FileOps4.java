import java.io.*;
public class FileOps4 {

	public static void main(String[] args)throws IOException
	{
		String path1="D:\\FileProgs\\input.txt";
		String path2="D:\\FileProgs\\output.txt";
		FileInputStream fis = new FileInputStream(path1);
		BufferedInputStream bis = new BufferedInputStream(fis);
		int temp;
		FileOutputStream fos = new FileOutputStream(path2);
		BufferedOutputStream bos = new BufferedOutputStream(fos);
		while((temp=bis.read())!=-1) {
			bos.write(temp);
			
		}
           bos.flush();
           fis.close();
           bis.close();
           fos.close();
	}

}
