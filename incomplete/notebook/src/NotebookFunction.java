import java.util.ArrayList;

public class NotebookFunction {
    ArrayList notebook;
    public NotebookFunction (ArrayList notebook) {
        this.notebook = notebook;
    }
    public void deleteString (int index) {
        notebook.remove(index);
    }
    public void addString(String string) {
        notebook.add(string);
    }
    public String getString(int index) {
        try {
            return (notebook.get(index).toString());
        } catch (Exception a) {
            a.printStackTrace();
            return null;
        }
    }


}
