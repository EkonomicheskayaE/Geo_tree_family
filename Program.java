package Tree_family;

import Tree_family.Tree.Relationship;

public class Program {
    public static void main(String[] args) {
        Human dad = new Human("Иван Иванович", "65  лет", "муж");
        Human mom = new Human("Мария Петровна", "64 лет", "жен");
        Human son = new Human("Константин Иванович", "45 лет", "муж");
        Human daughter = new Human("Анастасия Ивановна", "37 лет", "жен");
        Human son2 = new Human("Георгий Константинович", "25 лет", "муж");

        Human human = new Human("Представитель дерева |", "Возраст |", "Пол |");

        human.power();
        // System.out.println();
        // System.out.println("Ниже представлен весь список людей в этом древе:\n");
        // System.out.println(human);
        System.out.println("----------------------------------------");
        // human.list_human();
        
        Tree tree = new Tree();
        tree.append_1(dad, son);
        tree.append_1(mom, son);
        tree.append_1(dad, daughter);
        tree.append_1(mom, daughter);
        tree.append_1(son, son2);
        tree.append_2(dad, son2);
        tree.append_2(mom, son2);
        


        
        System.out.println();
        System.out.println("Давайте найдем детей каждого представителя этого дерева:\n");
        System.out.println("Дети Ивана Ивановича" + ":" + new Research(tree).spend(dad, Relationship.parent));
        System.out.println("Дети Марии Петровны" + ":" + new Research(tree).spend(mom, Relationship.parent));
        System.out.println("Дети Константина Ивановича" + ":" + new Research(tree).spend(son, Relationship.parent));
        System.out.println();
        System.out.println("А теперь поищем родителей каждого представителя этого дерева:\n");
        System.out.println("Родители Константина Ивановича" + ":" + new Research(tree).spend(son, Relationship.children));
        System.out.println("Родители Анастасии Ивановны" + ":" + new Research(tree).spend(daughter, Relationship.children));
        System.out.println("Родители Георгия Константиновича" + ":" + new Research(tree).spend(son2, Relationship.children));
        System.out.println();
        System.out.println("Теперь поищем внуков каждого представителя этого дерева:\n");
        System.out.println("Внук Ивана Ивановича" + ":" + new Research(tree).spend(dad, Relationship.grandparent));
        System.out.println("Внук Марии Петровны" + ":" + new Research(tree).spend(mom, Relationship.grandparent));
        System.out.println();
        System.out.println("Ну и найдем дедушек и бабушек каждого представителя этого дерева:\n");
        System.out.println("Дедушка и бабушка Георгия Константиновича" + ":" + new Research(tree).spend(son2, Relationship.grandchild));

        
        System.out.println();
        human.power();

        Notepad notes = new Notepad();
        notes.newFile();
        notes.currentDocument().addAllText("Иван Иванович ---сын---> Константин Иванович");
        notes.currentDocument().addAllText("Иван Иванович ---дочь---> Анастасия Ивановна");
        notes.currentDocument().addAllText("Мария Петровна ---сын---> Константин Иванович");
        notes.currentDocument().addAllText("Мария Петровна ---дочь---> Анастасия Ивановна");
        notes.currentDocument().addAllText("Константин Иванович --сын--> Георгий Константинович");
        notes.currentDocument().addAllText("Анастасия Ивановна -------> ");
        notes.currentDocument().addAllText("Георгия Константиновича -------> ");
        notes.SaveAs("family", new Txt());
    }
    
}