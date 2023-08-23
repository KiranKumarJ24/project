import java.io.*;
public class FileOps3 {

	public static void main(String[] args) throws IOException
	{
		String path1="D:\\FileProgs\\input.txt";
		String path2="D:\\FileProgs\\output.txt";
		FileReader fr= new FileReader(path1);
		BufferedReader br = new BufferedReader(fr);
		int temp;
		FileWriter fw= new FileWriter(path2);
		BufferedWriter bw = new BufferedWriter(fw);
		while((temp=br.read())!=-1) {
			bw.write(temp);
			
		}
             bw.flush();
             fw.flush();
             br.close();
             fr.close();
	}

}
