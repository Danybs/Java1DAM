/**
 * 
 * @author Dani
 *
 */
public class Audio extends File {
	/**
	 * @param nameFile
	 * @param URL
	 * @param SizeBytes
	 * @param tittle
	 * @param videoFormat
	 */
	public Audio(String nameFile, String URL, int SizeBytes, String tittle, String videoFormat) {
		super(nameFile, URL, SizeBytes);
		Tittle = tittle;
		VideoFormat = videoFormat;
	}

	private String Tittle;
	private String VideoFormat;

}
