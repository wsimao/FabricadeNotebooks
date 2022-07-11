package Fábricas;
import Modelos.INotebookComum;
import Modelos.INotebookGamer;
import Notebooks.Comum.NotebookIdeaPad_3i;
import Notebooks.Gamer.NotebookGamerLegion_5i;

public class Lenovo implements IFabricadeNotebooks{

    @Override
    public INotebookGamer criarNotebookGamer() {
        return new NotebookGamerLegion_5i();
    }

    @Override
    public INotebookComum criarNotebookComum() {
        return new NotebookIdeaPad_3i();
    }
    
}
