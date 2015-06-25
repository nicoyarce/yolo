package javaapplication1;

public class Libro {
    String codlibro, codISBN, autor, titulo, anno, editorial, materia;
    int copias;
    boolean estado;
    
    public Libro(){
        toString();
    }
    
    public Libro(String codlibro, String codISBN, String autor, String titulo, String anno, String editorial,
             String materia, int copias, boolean estado){
        this.codlibro=codlibro;
        this.codISBN=codISBN;
        this.autor=autor;
        this.anno=anno;
        this.editorial=editorial;
        this.materia=materia;
        this.copias=copias;
        this.estado=false;
    }
   
    public long transformaCodigo(){
        long suma=0;
        int exp=codlibro.length()-1;
        for(int i=0;i<codlibro.length();i++){            
            suma=suma+(int)codlibro.charAt(i)*(int)Math.pow(128,exp);
            exp--;
        }
        return suma;
    }
    
    
    public void mostrar(){
        System.out.println("Codigo: "+codlibro);
    }
    
    @Override
    public String toString() {
        return "Libro{" + "codlibro=" + codlibro + ", codISBN=" + codISBN + ", autor=" + autor + ", titulo=" + titulo + ", anno=" + anno + ", editorial=" + editorial + ", materia=" + materia + ", copias=" + copias + ", estado=" + estado + '}';
    }
    
}
