package UT9;

public class D2017_05_15_Ej1_Vista {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AnimacionProxy a1=new AnimacionProxy();
		a1.Dibuja();
		a1.Click();
		a1.Dibuja();
	}

}
interface Animacion{
	abstract void Dibuja();
	abstract void Click();
}
class Video implements Animacion{

	@Override
	public void Dibuja() {
		// TODO Auto-generated method stub
		System.out.println("Mostrar el video");
	}

	@Override
	public void Click() {
		// TODO Auto-generated method stub
		
	}
	public void Carga() {
		System.out.println("Cargar el video");
	}
	public void Reproduce(){
		System.out.println("Reproducir el video");
	}
	
}

class AnimacionProxy implements Animacion{
	String foto="Mostrar la foto";
	Video video=null;
	public String getFoo() {
		return foto;
	}

	public void setFoo(String foo) {
		this.foto = foo;
	}

	public Video getVideo() {
		return video;
	}

	public void setVideo(Video video) {
		this.video = video;
	}

	@Override
	public void Dibuja() {
		// TODO Auto-generated method stub
		if(getVideo()!=null){
			video.Dibuja();
		}
		else{
			System.out.println(foto);
		}
	}

	@Override
	public void Click() {
		// TODO Auto-generated method stub
		if(getVideo()==null){
			setVideo(new Video());
			video.Carga();
		}
		video.Reproduce();
	}
	
}
