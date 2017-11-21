package sample;

import java.io.Serializable;
import java.util.TreeSet;

public class Players implements Serializable {
    private TreeSet<String> list;

    public void setList(TreeSet<String> list) {
        this.list = list;
    }

    public TreeSet<String> getList() {
        return list;
    }


}
