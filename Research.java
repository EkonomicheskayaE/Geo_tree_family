package Tree_family;

import java.util.ArrayList;

import Tree_family.Tree.Relationship;

public class Research {
    ArrayList<Tree_family.Tree.Node> tree;

    public Research(Tree geoTree) {
        tree = geoTree.getTree();
    }

    public ArrayList<Human> spend(Human h, Relationship r) {
        ArrayList<Human> result = new ArrayList<>();
        for (Tree_family.Tree.Node t : tree) {
            if(t.h1.getName() == h.getName() && t.r == r) {
                result.add(t.h2);
            }
        }
        return result;
    }
}

