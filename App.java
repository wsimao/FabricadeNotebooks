import Fábricas.Acer;
import Fábricas.Dell;
import Fábricas.IFabricadeNotebooks;
import Fábricas.Lenovo;
import Modelos.INotebookComum;
import Modelos.INotebookGamer;

public class App {
    public static void main(String[] args) {
        IFabricadeNotebooks fabrica = new Dell();
        INotebookGamer notebookGamer = fabrica.criarNotebookGamer();
        INotebookComum notebookComum = fabrica.criarNotebookComum();
        
        System.out.println("INFORMAÇÕES NOTEBOOKS DA FABRICANTE (DELL)");
        notebookGamer.exibirInfoNotebookGamer();
        notebookComum.exibirInfoNotebookComum();
        System.out.println("=========================================================================");

        fabrica = new Lenovo();
        INotebookGamer notebookGamer2 = fabrica.criarNotebookGamer();
        INotebookComum notebookComum2 = fabrica.criarNotebookComum();

        System.out.println("INFORMAÇÕES NOTEBOOKS DA FABRICANTE (LENOVO)");
        notebookGamer2.exibirInfoNotebookGamer();
        notebookComum2.exibirInfoNotebookComum();
        System.out.println("=========================================================================");

        fabrica = new Acer();
        INotebookGamer notebookGamer3 = fabrica.criarNotebookGamer();
        INotebookComum notebookComum3 = fabrica.criarNotebookComum();

        System.out.println("INFORMAÇÕES NOTEBOOKS DA FABRICANTE (ACER)");
        notebookGamer3.exibirInfoNotebookGamer();
        notebookComum3.exibirInfoNotebookComum();
    }
    
}
