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
     int noDivisions;
     int noEmployees;
    public void doNo()
    {
        System.out.println("engineering company");
        noDivisions= 5;
        noEmployees=30;
    }
    
}
class team1 extends Engineering{
    
    public void doNo()
    {
        System.out.println("team1 engineering");
        noDivisions=10;
        noEmployees=10;
    }
    
}

class team2 extends Engineering{
    public void doNo()
    {
        System.out.println("team1 engineering");
        noDivisions=0;
        noEmployees=0;
    }
}   
class part1 extends team2{
    public void doNo()
    {
        System.out.println("team2part1 team2");
        noDivisions=5;
        noEmployees=5;
    }
}

class part2 extends team2{
    public void doNo()
    {
        System.out.println("team2part2 team2");
        noDivisions=3;
        noEmployees=3;
    }
}

class Manufacturing{
     int noDivisions;
     int noEmployees;
    public void doNo()
    {
        System.out.println("manufacturing division");
        noDivisions= 40;
        noEmployees=40;
    }
    
}

class Finance{
     int noDivisions;
     int noEmployees;
    public void doNo()
    {
        System.out.println("finance company");
        noDivisions= 20;
        noEmployees=0;
    }
    
}

class accounting extends Finance{
    public void doNo()
    {
        System.out.println("accounting finance");
        noDivisions=14;
        noEmployees=0;
    }
    
}

class sales extends Finance{
    public void doNo()
    {
        System.out.println("sales finance");
         noDivisions=6;
         noEmployees=5;
    }
    
}

class Organization extends Engineering {
        
	public static void main (String[] args) {
	   
	    Organization or = new Organization();
	    System.out.println(or.noEmployees);
	    System.out.println(or.noDivisions);
	    
	}
}
