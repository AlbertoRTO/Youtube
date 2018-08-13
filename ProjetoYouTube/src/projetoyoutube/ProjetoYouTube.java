package projetoyoutube;
public class ProjetoYouTube {
    public static void main(String[] args) {
        Video v[] = new Video[3];
        v[0] = new Video("Aula 1 de POO");
        v[1] = new Video("Aula 12 de PHP");
        v[2] = new Video("Aula 10 de HTML5");
        
        Assinante a[] = new Assinante[2];
        a[0] = new Assinante("Jubileu", 22, "M", "juba" );
        a[1] = new Assinante("Creuza", 12, "F", "creuzita");
        
        System.out.println("Videos\n----------------------------------------");
        System.out.println(v[0].toString());
        System.out.println(v[1].toString());
        System.out.println(v[2].toString());
        System.out.println("\nAssinnates\n----------------------------------");
        System.out.println(a[0].toString());
        System.out.println(a[1].toString());
        System.out.println("------------------------------------------------");
        Visualizacao vis[] = new Visualizacao[5];
        vis[0] = new Visualizacao(a[0], v[2]); // Jubileu assiste HTML5
        vis[0].avaliar();
        System.out.println(vis[0].toString());
        System.out.println("------------------------------------------------");
        vis[1] = new Visualizacao(a[0], v[1]); // Jubileu assiste PHP
        vis[0].avaliar(86.0f);
        System.out.println(vis[1].toString());
                
    }
    
}
