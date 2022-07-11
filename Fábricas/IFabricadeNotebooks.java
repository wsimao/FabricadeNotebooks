package Fábricas;
import Modelos.INotebookComum;
import Modelos.INotebookGamer;

public interface IFabricadeNotebooks {

    INotebookGamer criarNotebookGamer();
    INotebookComum criarNotebookComum();
}