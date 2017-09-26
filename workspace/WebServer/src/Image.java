/**
 * 
 * @author Dani
 *
 */
public class Image extends File {

	/**
	 * @param nameFile
	 * @param URL
	 * @param SizeBytes
	 * @param IMGFormat
	 * @param desc
	 */
	public Image(String nameFile, String URL, int SizeBytes, String IMGFormat, String desc) {
		super(nameFile, URL, SizeBytes);
		this.IMGFormat = IMGFormat;
		this.desc = desc;
	}

	private String IMGFormat;
	private String desc;
}
