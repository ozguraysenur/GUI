import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import java.util.Collection;

public class Storage extends AbstractListModel<String> {
    ArrayList<String> data =new ArrayList<>();
    Component comp;

    public Storage(Component c){
        comp =c;
        data.add("-x^2");
        data.add("x^3");
        data.add("x^2");

    }
    public void add(String s){
        if(data.contains(s)){
            JOptionPane.showMessageDialog(comp,s+" exists",
                    "ERROR",JOptionPane.ERROR_MESSAGE);
            return;
        }
        data.add(s);
        fireIntervalAdded(this,0,data.size());
    }
    public void remove(String s){
        if(!data.contains(s)){
            JOptionPane.showMessageDialog(comp," no"+ s +" in list",
                    "error",JOptionPane.ERROR_MESSAGE);
            return;
        }
        data.remove(s);
        fireIntervalRemoved(this,0,data.size());
    }

    @Override
    public int getSize() {
        return data.size();
    }

    @Override
    public String getElementAt(int index) {

            return data.get(index);


    }
}
