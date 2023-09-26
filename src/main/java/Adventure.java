public class Adventure {
private String retning;
private String help;
curent
public String getRetning(){
    return retning;
}

public void move(String retning){
    switch (retning){
        case "go north":
            this.retning = "going north";
            break;
        case "go east":
            this.retning = "going east";
            break;
        case "go south":
            this.retning = "going south";
            break;
        case "go west":
            this.retning="going west";
    }
}
public String getHelp(){
    return help;
}


    public void help(String help){
        switch (help){
        case "help":
            this.help = "velkommen til hjælp." +
                "du kan skrive go efterfulgt af enten north, east, west, south for at vælge retning din karakter skal gå";
    }
}
}
