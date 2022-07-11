package Fábricas;
import Modelos.INotebookComum;
import Modelos.INotebookGamer;
import Notebooks.Comum.NotebookComumInspiron15_3000;
import Notebooks.Gamer.NotebookGamerDellG15;

public class Dell implements IFabricadeNotebooks {

    @Override
    public INotebookGamer criarNotebookGamer() {
        return new NotebookGamerDellG15();
    }

    @Override
    public INotebookComum criarNotebookComum() {
        return new NotebookComumInspiron15_3000();
    }
    
}
