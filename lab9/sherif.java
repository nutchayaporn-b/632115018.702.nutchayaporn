public class sherif extends person{
    String workState;

    public sherif(String name, int bornYear, String workState){
        super(name, bornYear);
        this.workState = workState;
    }

    //overiding method
    public void introduce() {
        super.introduce();
        System.out.println("I'm a sheriff and work in "+ workState + ".");
    }
    
}

class Teacher extends person{
    String workState;

    public Teacher(String name, int bornYear, String workState){
        super(name, bornYear);
        this.workState = workState;  
    }

    public void introduce() {
        super.introduce();
        System.out.println("I'm a teacher and teach the students in "+ workState + ".");
    }
}

class Prime extends person{
    String workState;

    public Prime(String name, int bornYear, String workState){
        super(name, bornYear);
        this.workState = workState;  
    }

    public void introduce() {
        super.introduce();
        System.out.println("I'm a prime minister and work in "+ workState + ".");
    }
}

class Football extends person{
    String workState;

    public Football(String name, int bornYear, String workState){
        super(name, bornYear);
        this.workState = workState;  
    }

    public void introduce() {
        super.introduce();
        System.out.println("I'm a football and work in "+ workState + ".");
    }
}

class gamer extends person{
    String workState;

    public gamer(String name, int bornYear, String workState){
        super(name, bornYear);
        this.workState = workState;  
    }

    public void introduce() {
        super.introduce();
        System.out.println("I'm a doctor in "+ workState + ".");
    }
}
    

