package classes;

import application.Produtos;

public class Publicacao  {
    private String titulo;
    private int codigo;
    private int numeroDePaginas;
    private float custo;

    public Publicacao(String titulo, int codigo, int numeroDePaginas, float custo) {
        this.titulo = titulo;
        this.codigo = codigo;
        this.numeroDePaginas = numeroDePaginas;
        this.custo = custo;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public int getNumeroDePaginas() {
        return numeroDePaginas;
    }

    public void setNumeroDePaginas(int numeroDePaginas) {
        this.numeroDePaginas = numeroDePaginas;
    }

    public float getCusto() {
        return custo;
    }

    public void setCusto(float custo) {
        this.custo = custo;
    }

  
    
    
    
    
}
