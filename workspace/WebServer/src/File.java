/**
 * 
 * @author Dani
 *
 */
public class File {
	@Override
	public String toString() {
		return "File [nameFile=" + nameFile + ", URL=" + URL + ", SizeBytes=" + SizeBytes + "]";
	}
	File(String nameFile,String URL,int SizeBytes){
		this.nameFile=nameFile;
		this.URL=URL;
		this.SizeBytes=SizeBytes;
	}
	protected String nameFile;
	protected String URL;
	protected int SizeBytes;
	

	
}
