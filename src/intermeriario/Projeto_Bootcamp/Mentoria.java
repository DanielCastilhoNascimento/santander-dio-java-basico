package intermeriario.Projeto_Bootcamp;

import java.time.LocalDate;

public class Mentoria extends Conteudo {

    private LocalDate data;

    public Mentoria() {
    }

    public double CalcularXP(){
        return XP_PADRAO + 20;
    }    

    public LocalDate getData() {
        return data;
    }
    public void setData(LocalDate data) {
        this.data = data;
    }
    @Override
    public String toString() {
        return "Mentoria [titulo=" + getTitulo() + ", descricao=" + getDescricao() + ", data=" + getData() + "]";
    }

    
    

}
