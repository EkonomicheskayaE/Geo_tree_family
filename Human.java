package Tree_family;

public class Human {

    // имя человека
    private String Name;

    // возраст человека
    private String Age;

    // пол чловека
    private String Sex;

    private State state;

    enum State {
        On, Off
    }

    
    public String getName() {
        return Name;
    } 

    public String getAge() {
        return Age;
    } 

    public String getSex() {
        return Sex;
    } 

    public Human(String Name, String Age, String Sex) {
        this.Name = Name;
        this.Age = Age;
        this.Sex = Sex;
    }

    // public Human(String Name, String Age) {
    //     this(Name, Age);
    // }

    // public Human(String Name) {
    //     this(Name);
    // }

    @Override
    public String toString() {
        return String.format("%s %s %s", this.Name, this.Age, this.Sex);
    }

    public void list_human() {
        String[] person = new String[] {
            "Иван Иванович          65 лет    муж",
            "Мария Петровна         64 лет    жен",
            "Константин Иванович    45 лет    муж",
            "Анастасия Ивановна     37 лет    жен",
            "Георгий Константинович 25 лет    муж"
        };

        for (int i = 0; i < person.length; i++) {
    
            System.out.println(person[i]);
        }
    }

    public void startHi() {
        System.out.println("Здравствуйте!\nНиже представлен весь список людей в этом древе:\n");
    }

    public void endBye() {
        System.out.println("До свидание! Хорошего дня!");
    }

    public void power() {
        if (this.state == State.Off) {
            this.powerOff();
            this.state = State.On;
        } else {
            this.powerOn();
            this.state = State.Off;
        }
        System.out.println();
    }

    private void powerOn() {
        this.startHi();
        this.list_human();
        
    }

    private void powerOff() {
        this.endBye();
    }    
}
