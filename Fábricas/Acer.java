package Fábricas;
import Modelos.INotebookComum;
import Modelos.INotebookGamer;
import Notebooks.Comum.NotebookAcerAspire_3;
import Notebooks.Gamer.NotebookGamerAspireNitro_5;

public class Acer implements IFabricadeNotebooks {

    @Override
    public INotebookGamer criarNotebookGamer() {
        return new NotebookGamerAspireNitro_5();
    }

    @Override
    public INotebookComum criarNotebookComum() {
        return new NotebookAcerAspire_3();
    }
    
}
