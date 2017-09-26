import java.util.ArrayList;
/**
 * @
 * @author Dani
 *
 */
public class Server {
	ArrayList<File> files = new ArrayList<File>();
	public boolean addFile(File f1){
		boolean check=false;
		for (File file : files) {
			if(!files.contains(f1)){
				files.add(f1);
				check=true;
			}
		}
		return check;
		
	}
	public void delete(){
		
	}
	public void search(){
		
	}
	public String show(){
		return "El código es:";
	}
	
}
