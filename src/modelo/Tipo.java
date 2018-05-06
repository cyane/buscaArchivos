package modelo;

public enum Tipo {
	//audiovisual
mp3("mp3"),mp4("mp4"),vlc("vlc"),avg("avg"),ogv("ogv"),m4a("m4a"),webm("webm"),mkv("mkv"),avi("avi"),
	//imagen
jpg("jpg"),png("png"),gif("gif"),
	//texto
txt("txt"),pdf("pdf"),odf("odf"),odt("odt"),
	//aplicaciones
exe("exe"),
	//comprimidos
rar("rar"),zip("zip"),cab("cab"),sz("7z"),gz("gz"),
	//internet
xml("xml"),html("html");


	
	private String nombre;
	
	private Tipo(String nombre){
		this.nombre = nombre;
	}
	
	public String getNombre() {
		return nombre;
	}
	
	@Override
	public String toString() {
		return this.nombre;
	}
}

