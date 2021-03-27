package projetoyoutube;
public class ProjetoYouTube {
    public static void main(String[] args) {
        // criando vetor para videos
        Video v[] = new Video[3];
        v[0] = new Video("Aula 1 de POO");
        v[1] = new Video ("Aula 12 de PHP");
        v[2] = new Video ("Aula 10 de HTML5");
        
        Gafanhoto[] g = new Gafanhoto[2];
        g[0] = new Gafanhoto("Pedro", 15, "H", "Pedrinho");
        g[1] = new Gafanhoto("Maria", 21, "M", "Ia");
        
        System.out.println(v[0].toString());
        System.out.println(g[0].toString());
    }
    
}
