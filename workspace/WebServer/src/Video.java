/**
 * 
 * @author Dani
 *
 */
public class Video extends File implements Plays {
	/**
	 * @param nameFile
	 * @param URL
	 * @param SizeBytes
	 * @param tittle
	 * @param videoFormat
	 */
	public Video(String nameFile, String URL, int SizeBytes, String tittle, String videoFormat) {
		super(nameFile, URL, SizeBytes);
		Tittle = tittle;
		VideoFormat = videoFormat;
	}

	private String Tittle;
	private String VideoFormat;

}
