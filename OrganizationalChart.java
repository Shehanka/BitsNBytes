// Don't place your source in a package
import java.util.*;
import java.lang.*;
import java.io.*;

// Please name your class Main
/*interface doNo
{
    public void doNo();
}*/
class Engineering{
    public void doNo()
    {
        System.out.println("engineering company");
        int noDivisions= 5;
        int noEmployees=30;
    }
    
}
class team1 extends Engineering{
    public void doNo()
    {
        System.out.println("team1 engineering");
        int noDivisions=10;
        int noEmployees=10;
    }
    
}

class team2 extends Engineering{
    public void doNo()
    {
        System.out.println("team1 engineering");
        int noDivisions=0;
        int noEmployees=0;
    }
}   
class part1 extends team2{
    public void doNo()
    {
        System.out.println("team2part1 team2");
        int noDivisions=5;
        int noEmployees=5;
    }
}

class part2 extends team2{
    public void doNo()
    {
        System.out.println("team2part2 team2");
        int noDivisions=3;
        int noEmployees=3;
    }
}

class Manufacturing{
    public void doNo()
    {
        System.out.println("manufacturing division");
        int noDivisions= 40;
        int noEmployees=40;
    }
    
}

class Finance{
    public void doNo()
    {
        System.out.println("finance company");
        int noDivisions= 0;
        int noEmployees=0;
    }
    
}

class accounting extends Finance{
    public void doNo()
    {
        System.out.println("accounting finance");
        int noDivisions=0;
        int noEmployees=0;
    }
    
}

class sales extends Finance{
    public void doNo()
    {
        System.out.println("sales finance");
        int noDivisions=0;
        int noEmployees=5;
    }
    
}

class Organization extends Engineering {
	public static void main (String[] args) {
	    Organization or = new Organization();
	    System.out.println(or.noEmployees);
	    System.out.println(or.noDivisions);
	    
	}
}
