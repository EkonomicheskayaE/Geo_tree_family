package Tree_family;

import java.util.ArrayList;


public class Tree {
    public ArrayList<Node> tree = new ArrayList<>();

    public ArrayList<Node> getTree() {
        return tree;
    }

    public void append_1(Human parent, Human children) {
        tree.add(new Node(parent, Relationship.parent, children));
        tree.add(new Node(children, Relationship.children, parent));
    }

    public void append_2(Human grandparent, Human grandchild) {
        tree.add(new Node(grandchild, Relationship.grandchild, grandparent));
        tree.add(new Node(grandparent, Relationship.grandparent, grandchild));
    }


    enum Relationship {
        parent, children, grandparent, grandchild
    }

    class Node {
        public Node(Human h1, Relationship r, Human h2) {
            this.h1 = h1;
            this.r = r;
            this.h2 = h2;
        }
    
        Human h1;
        Relationship r;
        Human h2;
    
        @Override
        public String toString() {
            return String.format("%s %s %s", h1, r, h2);
        }
    }

}
